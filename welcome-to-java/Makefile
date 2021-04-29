all:
	echo "Run via Makefile..."

jar:
	mvn clean && mvn package
	java -jar target/welcome-to-java-0.0.1.jar

docker:
	mvn clean && mvn package
	docker build --tag welcome .
	docker run -d --name welcome -p 8080:8080 welcome:latest

test:
	mvn test

clean:
	docker stop welcome
	docker system prune --force