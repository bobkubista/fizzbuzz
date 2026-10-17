# fizzbuzz - project context prompt

Last updated: 2026-10-17
Verified against commit: 18c5d3e

> This file is the single-page context for AI assistants and new contributors. It MUST describe the repository as it is today. Update it in the same change as any structural change. Do not leave placeholders.

## Role
You are a senior engineer working on fizzbuzz. Follow the conventions below. Ask before any `git push`, `git merge` or change to the protected branch.

## Purpose
A small FizzBuzz library: `FizzBuzz.buzz(int)` returns "Fizz" for multiples of 3, "Buzz" for multiples of 5, "FizzBuzz" for multiples of both, and the number itself otherwise. It is a kata-sized practice project, kept next to the catalog-service repositories.

## Architecture
One class (`com.bobkubista.fizzbuzz.FizzBuzz`) with its unit test. No layers, no data store, no external systems, no deployment.
Details: `docs/architecture/overview.md`. Decisions: `docs/adr/` (index in `docs/adr/README.md`).

## Tech stack
| Area | Technology and version |
|---|---|
| Backend | Java 25, Maven 3.9, JUnit 6.1.3, JaCoCo 0.8.15, Spotless 3.10.4 (Eclipse formatter `formatter.xml`) |
| Frontend | none |
| Data | none |
| Infrastructure | Built by the kvm-server Jenkins (Kubernetes agent pod `maven:3.9.16-eclipse-temurin-25`); `master` is analysed in SonarQube. Not deployed. |

## Repository map
| Path | Purpose |
|---|---|
| `src/main/java` | FizzBuzz implementation |
| `src/test/java` | Unit tests |
| `formatter.xml` | Eclipse formatter settings used by Spotless |
| `Jenkinsfile` | CI pipeline for the kvm-server Jenkins |
| `docs/` | Documentation |

## Commands
| Task | Command |
|---|---|
| Backend verify | `mvn verify` (tests, JaCoCo, Spotless check) |
| Fix formatting | `mvn spotless:apply` |
| Frontend tests | n/a |
| End-to-end | n/a |
| Run locally | n/a (library; run the tests) |

## Conventions
- Test-driven development: failing test first, then the minimum code, then refactor.
- Formatting is enforced by `mvn verify`; CI never commits.
- Documentation lives in `docs/`; only README.md lives elsewhere.

## Quality gates
Local hooks (pre-commit, pre-push), then independent code review, then Jenkins (`mvn verify` on every branch; on `master` also SonarQube analysis and quality gate).

## Environments and observability
None: the library is not deployed. Build results: Jenkins at http://jenkins.internal.bobkubista.com (folder "GitHub: bobkubista"), analysis at http://sonarqube.internal.bobkubista.com (project `fizzbuzz`).

## Current state
- Status: builds on Java 25 with current plugins; 5 unit tests.
- Known gaps / next work: none planned.

## Glossary (ubiquitous language)
- Fizz: output for a multiple of 3. Buzz: output for a multiple of 5. FizzBuzz: output for a multiple of 15.
