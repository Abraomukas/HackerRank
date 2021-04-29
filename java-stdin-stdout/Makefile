all:
	echo "Run via Makefile..."

jar:
	mvn clean && mvn package
	java -jar target/java-stdin-stdout-0.0.1.jar

docker:
	mvn clean && mvn package
	docker build --tag stdin-stdout .
	docker run -d --name stdin-stdout -p 8080:8080 stdin-stdout:latest
	docker ps

test:
	mvn test

clean:
	docker stop stdin-stdout
	docker system prune --force