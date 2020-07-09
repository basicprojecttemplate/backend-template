To Build Project
Eclipse
	./mvnw -U clean install -DskipTests eclipse:eclipse
IntelliJ IDEA
	./mvnw -U clean install -DskipTests idea:idea

To Start Application
	java -jar target/springboot-backend-template-0.0.1-SNAPSHOT.jar

To Run Sample API
	http://localhost:8080/test

To Create a new docker image
	docker build .  													[Without Tag]
	docker run -p 8080:8080 5cf5ecebda70
	
	docker build . -t basicprojecttemplate/springboot-backend-template 	[With Tag]
	docker run -p 8080:8080 basicprojecttemplate/springboot-backend-template
	
