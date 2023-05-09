# creates a layer from the openjdk:17-alpine Docker image.
FROM openjdk:17-alpine

MAINTAINER boottechnologies.ci@gmail.com

# cd /app
WORKDIR /app

# Refer to Maven build -> finalName
ARG JAR_FILE=target/spring-gitlab-ci-*.jar

# cp target/spring-gitlab-ci-0.0.1-SNAPSHOT.jar /app/spring-gitlab-ci.jar
COPY ${JAR_FILE} spring-gitlab-ci.jar

# java -jar /app/spring-gitlab-ci.jar
CMD ["java", "-jar", "-Xmx1024M", "/app/spring-gitlab-ci.jar"]

# Make port 8080 available to the world outside this container
EXPOSE 8080
