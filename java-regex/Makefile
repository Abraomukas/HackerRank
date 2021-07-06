all:
	echo "Run via Makefile"

jar:
	mvn clean && mvn package
	java -jar target/pattern-syntax-checker-0.0.1.jar

docker:
	mvn clean && mvn package
	docker build --tag pattern-syntax-checker .
	docker run -d --name pattern-syntax-checker -p 8080:8080 pattern-syntax-checker:latest
	docker ps
test:
	mvn test

clean:
	docker stop pattern-syntax-checker
	docker system prune --force