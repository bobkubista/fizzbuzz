package com.bobkubista.fizzbuzz;


public class FizzBuzz {

    public String buzz(int i) {
        String string = "";
        if (!isFizz(i) && !isBuzz(i)) {
            return Integer.toString(i);
        }
        if (isFizz(i)) {
            string = "Fizz";
        }
        if (isBuzz(i)) {
            string += "Buzz";
        }
        return string;
    }

    private boolean isBuzz(int i) {
        return i % 5 == 0;
    }

    private boolean isFizz(int i) {
        return i % 3 == 0;
    }

}
