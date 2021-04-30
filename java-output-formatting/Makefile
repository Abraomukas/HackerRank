all:
	echo "Run via Makefile..."

jar:
	mvn clean && mvn package
	java -jar target/java-output-formatting-0.0.1.jar

docker:
	mvn clean && mvn package
	docker build --tag java-output-formatting .
	docker run -d --name java-output-formatting -p 8080:8080 java-output-formatting:latest
	docker ps

test:
	mvn test

clean:
	docker stop java-output-formatting
	docker system prune --force