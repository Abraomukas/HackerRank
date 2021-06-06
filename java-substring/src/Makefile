all:
	echo "Run via Makefile..."

jar:
	mvn clean && mvn package
	java -jar target/java-substring-0.0.1.jar

docker:
	mvn clean && mvn package
	docker build --tag java-substring .
	docker run -d --name java-substring -p 8080:8080 java-substring:latest
	docker ps

test:
	mvn test

clean:
	docker stop java-substring
	docker system prune --force