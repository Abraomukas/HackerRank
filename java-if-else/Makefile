all:
	echo "Run via Makefile..."

jar:
	mvn clean && mvn package
	java -jar target/java-if-else-0.0.1.jar

docker:
	mvn clean && mvn package
	docker build --tag if-else .
	docker run -d --name if-else -p 8080:8080 if-else:latest
	docker ps

test:
	mvn test

clean:
	docker stop if-else
	docker system prune --force