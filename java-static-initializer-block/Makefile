all:
	echo "Run via Makefile..."

jar:
	mvn clean && mvn package
	java -jar target/java-static-initializer-block-0.0.1.jar

docker:
	mvn clean && mvn package
	docker build --tag java-static-initializer-block .
	docker run -d --name java-static-initializer-block -p 8080:8080 java-static-initializer-block:latest
	docker ps

test:
	mvn test

clean:
	docker stop java-static-initializer-block
	docker system prune --force