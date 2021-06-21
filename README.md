# HackerRank repository

This is a repository of all the practices I have worked on. 

## Description

Every practice can be found in its own branch. I have added some extra layers to every single practice to cover more phases of the software engineering cycle.
Every practice will be:

- Served using **Spring Boot's** MVC pattern
- Tested using **JUnit** if there are input parameters
- **Dockerized**

## Stats

![](https://img.shields.io/badge/badge-silver-silver)
<br>
![](https://img.shields.io/badge/submissions-16-darkgreen)

## Stack used

![](https://img.shields.io/badge/-Java-informational?style=flat&logo=java&logoColor=white&color=darkgreen)
![](https://img.shields.io/badge/-Spring_Boot-informational?style=flat&logo=spring&logoColor=white&color=darkgreen)
![](https://img.shields.io/badge/-Maven-informational?style=flat&logo=apache-maven&logoColor=white&color=darkgreen)
![](https://img.shields.io/badge/-JUnit-informational?style=flat&logo=junit5&logoColor=white&color=darkgreen)
![](https://img.shields.io/badge/-Makefile-informational?style=flat&logo=&logoColor=white&color=darkgreen)
![](https://img.shields.io/badge/-Docker-informational?style=flat&logo=docker&logoColor=white&color=darkgreen)

## Usage

Switch branches to check different solutions.

```
git checkout <branch-name>
```

By the **Makefile** provided, several features can be showcased.

```
make <command>
```

Possibilities for `<command>`:

- #### `make jar`
  - Creates and executes a **jar** of the application

- #### `make test`
  - Runs all unit tests

- #### `make docker`
  - Builds and runs a **Docker** container of the application

- #### `make clean`
  - Stops the **Docker** container and purges all unused images and containers
