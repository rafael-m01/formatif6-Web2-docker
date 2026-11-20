FROM eclipse-temurin:21-jdk-noble
WORKDIR /app
COPY target/*.jar app.jar
EXPOSE 8080 5005

ENTRYPOINT  ["java","-jar","app.jar"]

LABEL authors="2001889"

