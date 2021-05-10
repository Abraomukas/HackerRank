all:
	echo "Run via Makefile..."

jar:
	mvn clean && mvn package
	java -jar target/java-date-and-time-0.0.1.jar

docker:
	mvn clean && mvn package
	docker build --tag java-date-and-time .
	docker run -d --name java-date-and-time -p 8080:8080 java-date-and-time:latest
	docker ps

test:
	mvn test

clean:
	docker stop java-date-and-time
	docker system prune --force