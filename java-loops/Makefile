all:
	echo "Run via Makefile..."

jar:
	mvn clean && mvn package
	java -jar target/java-loops-0.0.1.jar

docker:
	mvn clean && mvn package
	docker build --tag loops .
	docker run -d --name loops -p 8080:8080 loops:latest
	docker ps

test:
	mvn test

clean:
	docker stop loops
	docker system prune --force