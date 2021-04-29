all:
	echo "Run via Makefile..."

jar:
	mvn clean && mvn package
	java -jar target/java-stdin-stdout-ii-0.0.1.jar

docker:
	mvn clean && mvn package
	docker build --tag stdin-stdout-ii .
	docker run -d --name stdin-stdout-ii -p 8080:8080 stdin-stdout-ii:latest
	docker ps

test:
	mvn test

clean:
	docker stop stdin-stdout-ii
	docker system prune --force