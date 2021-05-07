all:
	echo "Run via Makefile..."

jar:
	mvn clean && mvn package
	java -jar target/java-end-of-file-0.0.1.jar

docker:
	mvn clean && mvn package
	docker build --tag java-end-of-file .
	docker run -d --name java-end-of-file -p 8080:8080 java-end-of-file:latest
	docker ps

test:
	mvn test

clean:
	docker stop java-end-of-file
	docker system prune --force