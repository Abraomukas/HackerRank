# HackerRank repository

This is a repository of all the practices I have worked on. 

## Description

Every practice can be found in its own branch. I have added some extra layers to every single practice to cover more phases of the software engineering cycle.
Every practice will be:
- Tested using **JUnit** if there are input parameters
- **Dockerized**

## Stack used

- Java 8+
- Maven
- JUnit 5


## Usage

Switch branches to check different solutions.

```
git checkout <branch-name>
```

By the **Makefile** provided, several features can be showcased.

```
make <command>
```

Possibilities for `<command>`
- jar
  - Creates and executes a **jar** of the application
- docker
  - Builds and runs a **Docker** container of the application
- test
  - Runs all unit tests
