pipeline { 
    agent any  
    tools { 
        maven 'Maven' 
        jdk '1.8' 
    }
    stages { 
    	stage('auto formatting') {
    	    steps {
				sh 'mvn spotless:apply'
				sh 'mvn -Dmessage="auto formatting" scm:checkin'    	        
    	    }
	}
	stage('Update Dependencies') {
	    steps {
		sh 'mvn versions:use-latest-versions -DprocessParent=true'
            }
    	}
        stage('Compile') { 
            steps { 
               sh 'mvn clean compile'
            }
        }
        stage('Test'){
        	steps {
        		sh 'mvn test'
        	}
        	post {
                always {
                    junit 'target/surefire-reports/**/*.xml' 
                }
            }
        }
	stage('Commit dependency updates') {
		steps {
			sh 'mvn versions:commit'
			//sh 'mvn -Dmessage="updateing dependencies" scm:checkin'
		}
	}
        stage('Sonar') {
        	steps {
        	    sh 'mvn sonar:sonar'
        	}
        }
    }
}
