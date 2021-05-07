all:
	echo "Run via Makefile..."

jar:
	mvn clean && mvn package
	java -jar target/java-datatypes-0.0.1.jar

docker:
	mvn clean && mvn package
	docker build --tag java-datatypes .
	docker run -d --name java-datatypes -p 8080:8080 java-datatypes:latest
	docker ps

test:
	mvn test

clean:
	docker stop java-datatypes
	docker system prune --force