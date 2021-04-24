# HackerRank repository

This is a repository of all the practices I have worked on. 

## Description

Every practice can be found in its own branch. I have added some extra layers to every single practice to cover more phases of the software engineering cycle. very single practice will be:
- Tested using **JUnit**
- Deployed as a pipeline in **Heroku**
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
  - Creates an executable **jar** of the application
- docker
  - Creates a **Docker** containerof the application  
- test
  - Runs all unit tests 
