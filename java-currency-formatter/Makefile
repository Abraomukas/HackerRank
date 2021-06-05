all:
 	echo "Run via Makefile..."

 jar:
 	mvn clean && mvn package
 	java -jar target/java-currency-formatter-0.0.1.jar

 docker:
 	mvn clean && mvn package
 	docker build --tag java-currency-formatter .
 	docker run -d --name java-currency-formatter -p 8080:8080 java-currency-formatter:latest
 	docker ps

 test:
 	mvn test

 clean:
 	docker stop java-currency-formatter
 	docker system prune --force