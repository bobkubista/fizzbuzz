# 0001. Record architecture decisions

- Status: accepted
- Date: 2026-10-17
- Deciders: project team

## Context and problem statement
Significant technical decisions are easily forgotten, and new contributors (and AI agents) cannot tell why the system looks the way it does.

## Decision outcome
Every significant decision is recorded as an Architecture Decision Record in `docs/adr/`, named `NNNN-kebab-title.md`, using `docs/adr/template.md`. Accepted ADRs are immutable; a change of mind is a new ADR that supersedes the old one.

### Consequences
- Good: decisions and their reasoning stay discoverable and reviewable.
- Bad: small writing overhead per decision.
