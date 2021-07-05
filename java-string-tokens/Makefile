all:
	echo "Run via Makefile"

jar:
	mvn clean && mvn package
	java -jar target/java-string-tokens-0.0.1.jar

docker:
	mvn clean && mvn package
	docker build --tag java-string-tokens .
	docker run -d --name java-string-tokens -p 8080:8080 java-string-tokens:latest
	docker ps
test:
	mvn test

clean:
	docker stop java-string-tokens
	docker system prune --force