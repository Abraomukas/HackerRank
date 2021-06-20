all:
	echo "Run via Makefile"

jar:
	mvn clean && mvn package
	java -jar target/java-string-reverse-0.0.1.jar

docker:
	mvn clean && mvn package
	docker build --tag java-string-reverse .
	docker run -d --name java-string-reverse -p 8080:8080 java-string-reverse:latest
	docker ps
test:
	mvn test

clean:
	docker stop java-string-reverse
	docker system prune --force