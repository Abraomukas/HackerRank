all:
	echo "Run via Makefile..."

jar:
	mvn clean && mvn package
	java -jar target/loops-ii-0.0.1.jar

docker:
	mvn clean && mvn package
	docker build --tag loops-ii .
	docker run -d --name loops-ii -p 8080:8080 loops-ii:latest
	docker ps

test:
	mvn test

clean:
	docker stop loops-ii
	docker system prune --force