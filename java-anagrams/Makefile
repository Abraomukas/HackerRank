all:
	echo "Run via Makefile"

jar:
	mvn clean && mvn package
	java -jar target/java-anagrams-0.0.1.jar

docker:
	mvn clean && mvn package
	docker build --tag java-anagrams .
	docker run -d --name java-anagrams -p 8080:8080 java-anagrams:latest
	docker ps
test:
	mvn test

clean:
	docker stop java-anagrams
	docker system prune --force