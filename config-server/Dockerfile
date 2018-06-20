#Génératin du jar
FROM maven:3.5-jdk-8 as MAVEN

WORKDIR /usr/src/config-server
COPY . /usr/src/config-server
RUN mvn clean package -DskipTests

# Gération de l'image openjdk
FROM openjdk:8
COPY /usr/src/config-server/target/config-server.jar config-server.jar

#Execution
ENTRYPOINT ["sh", "-c", "java -jar config-server.jar"]
