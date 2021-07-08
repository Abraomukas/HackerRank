all:
	echo "Run via Makefile"

jar:
	mvn clean && mvn package
	java -jar target/java-regex-0.0.1.jar

docker:
	mvn clean && mvn package
	docker build --tag java-regex .
	docker run -d --name java-regex -p 8080:8080 java-regex:latest
	docker ps
test:
	mvn test

clean:
	docker stop java-regex
	docker system prune --force