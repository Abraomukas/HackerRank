# HackerRank repository

This is a repository of all the practices I have worked on. 

## Description

Every practice can be found in its own branch. Every practice will be:

- Available via an online GUI hosted in Heroku
- Available locally once the repository is cloned
- Ready to be run as a **Docker** container

### For Java practices
  - Their branch starts with:

    ```
    java-[name-of-the-exercise]
    ```

  - They adhere to **Spring Boot**'s MVC pattern
  - If there are input parameters, **JUnit 5** covers the functionality with unit tests
<!--
### For Python practices

### For JavaScript practices
-->
## Stats

![Submissions](https://img.shields.io/badge/Submissions-26-darkgreen)
![Badge-Java](https://img.shields.io/badge/Java-GOLD-gold)
<!--
![Badge-Python](https://img.shields.io/badge/Python-GOLD-gold)
![Badge-JavaScript](https://img.shields.io/badge/JavaScript-GOLD-gold)
-->

## Stack used

![Java 8](https://img.shields.io/badge/-Java_8-informational?style=flat&logo=java&logoColor=white&color=darkgreen)
![Spring Boot](https://img.shields.io/badge/-Spring_Boot-informational?style=flat&logo=spring&logoColor=white&color=darkgreen)
![Apache Maven](https://img.shields.io/badge/Apache_Maven-informational?style=flat&logo=apache-maven&logoColor=white&color=darkgreen)
![JUnit 5](https://img.shields.io/badge/-JUnit_5-informational?style=flat&logo=junit5&logoColor=white&color=darkgreen)
![Makefile](https://img.shields.io/badge/-Makefile-informational?style=flat&logo=&logoColor=white&color=darkgreen)
![Docker](https://img.shields.io/badge/-Docker-informational?style=flat&logo=docker&logoColor=white&color=darkgreen)
![Heroku](https://img.shields.io/badge/-Heroku-informational?style=flat&logo=heroku&logoColor=white&color=darkgreen)


## Online GUI

Click <a href="">here</a>.

## For local use

Switch branches to check different solutions.

```
git checkout <branch-name>
```

By the **Makefile** provided, several features can be showcased.

```
make <command>
```

Possibilities for `<command>`:

- #### `jar`
  - Creates and executes a **jar** of the application

- #### `test`
  - Runs all unit tests

- #### `docker`
  - Builds and runs a **Docker** container of the application

- #### `clean`
  - Stops the **Docker** container and purges all unused images and containers
