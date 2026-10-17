# Architecture overview

A single-class library: `FizzBuzz.buzz(int)` maps a number to "Fizz", "Buzz", "FizzBuzz" or the number itself.

## Context
Used only by its own unit tests; it talks to no external systems.

## Containers / components
```mermaid
flowchart LR
  test[FizzBuzzTest] --> fb[FizzBuzz]
```

## Cross-cutting concerns
- Resilience: not applicable (pure function, no I/O).
- Observability: not applicable (not deployed).
- Monitoring: not applicable; build health in Jenkins and SonarQube.
- Security: no secrets, no network access.
