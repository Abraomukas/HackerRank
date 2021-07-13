all:
	echo "Run via Makefile..."

jar:
	mvn clean && mvn package
	java -jar target/valid-username-regular-expression-0.0.1.jar

docker:
	mvn clean && mvn package
	docker build --tag valid-username-regular-expression .
	docker run -d --name valid-username-regular-expression -p 8080:8080 valid-username-regular-expression:latest
	docker ps

test:
	mvn test

clean:
	docker stop valid-username-regular-expression
	docker system prune --force