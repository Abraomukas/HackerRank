all:
	echo "Run via Makefile..."

jar:
	mvn clean && mvn package
	java -jar target/java-regex-ii-duplicate-words-0.0.1.jar

docker:
	mvn clean && mvn package
	docker build --tag java-regex-ii-duplicate-words .
	docker run -d --name java-regex-ii-duplicate-words -p 8080:8080 java-regex-ii-duplicate-words:latest
	docker ps

test:
	mvn test

clean:
	docker stop java-regex-ii-duplicate-words
	docker system prune --force