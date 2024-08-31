#Building the application.
FROM maven:3.9.6-eclipse-temurin-21 AS build
WORKDIR /app
COPY pom.xml .
COPY src ./src
RUN mvn clean install

#Running the application.
FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /app/target/aws-0.0.1-SNAPSHOT.jar ./demo-aws.jar
EXPOSE 8080
CMD ["java", "-jar", "github-actions-demo.jar"]
