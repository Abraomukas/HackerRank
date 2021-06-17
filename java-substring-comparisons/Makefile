all:
	echo "Run via Makefile"

jar:
	mvn clean && mvn package
	java -jar target/java-substring-comparisons-0.0.1.jar

docker:
	mvn clean && mvn package
	docker build --tag java-substring-comparisons .
	docker run -d --name java-substring-comparisons -p 8080:8080 java-substring-comparisons:latest
	docker ps
test:
	mvn test

clean:
	docker stop java-substring-comparisons
	docker system prune --force