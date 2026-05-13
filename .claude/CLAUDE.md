# CLAUDE.md
This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

**Streams-API-Practices** is a Java 17 Maven project designed as a learning and practice resource for the Java Stream API. It contains:
- **Concept notes** (markdown files) covering Stream fundamentals, intermediate and terminal operations
- **Practice exercises** organized by difficulty level (easy, medium, hard) and domain (numbers, strings, employee data)
- **Functional interface exercises** covering Predicate, Function, Consumer, Supplier, and more
- **Gatherer exercises** for modern stream processing patterns (Java 19+)
- **Reference solutions** in `ProblemSolutions.java` to compare against learner implementations

The project uses **JUnit 5** for test-driven learning: exercises are marked with `@Disabled` and learners remove this annotation, implement a solution, and verify it matches the reference implementation.

## Tech Stack & Build Configuration

- **Java Version:** 17 (target and source)
- **Build Tool:** Maven
- **Testing Framework:** JUnit 5 (6.1.0-M1 milestone release)
- **Key Dependencies:**
  - JUnit Jupiter (test framework)
  - Lombok 1.18.44 (for annotations, test scope)
  - DataFaker 2.5.4 (generates fake test data like names, emails, etc.)
- **Maven Surefire Plugin:** 3.5.5 (test runner)

### Build & Test Commands

```bash
# Run all tests
mvn test

# Run a specific test class
mvn test -Dtest=P_WordWithMaxNumberOfVowelsTest

# Run a specific test method
mvn test -Dtest=P_WordWithMaxNumberOfVowelsTest#testNumberOfVowels

# Compile only (no tests)
mvn compile

# Clean build artifacts
mvn clean

# Full clean + test
mvn clean test
```

**Note:** The Maven Surefire configuration runs all `.java` files as tests except `module-info.java`. A Maven profile `enable-upto-jdk17-testcases` conditionally excludes gatherer tests for JDK versions below 19.

## Repository Structure

```
src/test/java/com/github/streams/
├── learn/                              # Educational content
│   ├── concepts/                       # Core Stream fundamentals (markdown notes)
│   ├── intermediate_operations/        # Notes on filter, map, flatMap, etc. (11 operations)
│   ├── terminal_operations/            # Notes on count, collect, reduce, etc. (13 operations)
│   └── gatherers/                      # Gatherer examples (Java 19+ feature)
└── practice/                           # Hands-on exercises
    ├── a_easy_problems/                # Numbers and strings
    ├── b_medium_problems/              # Numbers, strings, employee aggregations
    ├── c_hard_problems/                # Prime streams, consecutive sequences
    ├── functional_interfaces/          # Predicate, Function, Consumer, Supplier, BiFunction, Runnable exercises
    └── gatherers/                      # Gatherer-based exercises
```

**Key Files:**
- `ProblemSolutions.java` (in `practice/b_medium_problems/`) - Contains reference implementations for all exercises. Learners compare their solutions against these.
- Concept notes are markdown files in `learn/` directories (not Java classes)

## Exercise Pattern

All practice exercises follow this pattern:

1. **Location:** `src/test/java/com/github/streams/practice/{difficulty}/{domain}/{ProblemTest}.java`
2. **Structure:**
   - Test method marked with `@Disabled` annotation
   - Problem description in JavaDoc comment
   - `final var mySolution = ProblemSolutions.someMethod(...)` calls the reference implementation
   - `final var yourSolution = ...` (TODO) is where learners implement their solution
   - `Assertions.assertEquals(mySolution, yourSolution)` compares the two
3. **Workflow:**
   - Remove `@Disabled` to enable the test
   - Implement the solution in the `yourSolution` variable
   - Run `mvn test -Dtest=TestClassName` to verify
   - Update the `yourSolution` line with the actual Stream API solution code

Example:
```java
@Disabled
@Test
void testExample() {
    var input = List.of(1, 2, 3);
    final var mySolution = ProblemSolutions.someMethod(input);
    final var yourSolution = input.stream()
        .filter(x -> x > 1)
        .collect(Collectors.toList());
    Assertions.assertEquals(mySolution, yourSolution);
}
```

## Important Architectural Notes

- **No main source code:** All code lives in `src/test/java/`. This is intentional for a learning project.
- **Shared test resources:** `src/test/resources/` is available for test data.
- **Employee domain classes:** Located in `practice/b_medium_problems/employee/ignore/domain_related/` (Employee, Department, Identity classes with record-like structure).
- **DataFaker usage:** Tests use `new Faker()` to generate random test data, ensuring solutions are robust.
- **Solution verification:** Reference implementations in `ProblemSolutions` demonstrate best-practice Stream API patterns.

## Development Notes

- **Gatherers:** Java 19+ feature for intermediate/terminal stream operations. Tests are conditionally excluded for JDK < 19 via Maven profile.
- **Lazy Evaluation:** Many concept notes explain stream laziness and terminal vs. intermediate operations—key to understanding correctness.
- **Functional Interfaces:** Exercises cover standard Java functional interfaces (`Predicate`, `Function`, `Consumer`, `Supplier`, `BiFunction`, `Runnable`).
- **When modifying exercises:** Ensure the reference solution in `ProblemSolutions` is updated to match, so learners can verify their work.

## Common Workflows

**Adding a new easy problem:**
1. Create a test class in `src/test/java/com/github/streams/practice/a_easy_problems/{domain}/`
2. Add a corresponding method to `ProblemSolutions` with the reference implementation
3. Write the test with a `@Disabled` annotation and a TODO for learners
4. Use `DataFaker` or realistic test data

**Running a single exercise:**
```bash
mvn test -Dtest=L_ConvertListOfCharactersToStringTest
```

**Debugging a failing test:**
```bash
mvn test -Dtest=TestClassName -e
```
(The `-e` flag provides full stack traces)

## Out of scope
- src/main/**.*