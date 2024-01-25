# Dockerfile
FROM openjdk:11-jre-slim

COPY build/libs/java-webserver-0.0.1-SNAPSHOT.jar java-webserver.jar

EXPOSE 8080

CMD ["java", "-Xmx64M", "-jar", "java-webserver.jar"]