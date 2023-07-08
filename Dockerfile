FROM maven:3.8.7-openjdk-18-slim AS build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package
#
# Package stage
#
FROM openjdk:21-slim-buster
RUN mkdir /app && chmod 777 /app
COPY --from=build /home/app/target/movieappEureka-0.0.1-SNAPSHOT.jar /app/movieappEureka.jar
COPY /uploads /uploads
RUN chmod 777 /uploads
EXPOSE 8000
ENTRYPOINT ["java","-jar","/app/movieappEureka.jar"]