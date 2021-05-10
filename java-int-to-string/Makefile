all:
	echo "Run via Makefile..."

jar:
	mvn clean && mvn package
	java -jar target/java-int-to-string-0.0.1.jar

docker:
	mvn clean && mvn package
	docker build --tag java-int-to-string .
	docker run -d --name java-int-to-string -p 8080:8080 java-int-to-string:latest
	docker ps

test:
	mvn test

clean:
	docker stop java-int-to-string
	docker system prune --force