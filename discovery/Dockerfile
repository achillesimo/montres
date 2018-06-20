#Génératin du jar
FROM maven:3.5-jdk-8 as MAVEN

WORKDIR /usr/src/directory
COPY . /usr/src/directory/
SHELL ["/bin/bash", "-c", "ls -al"]
RUN mvn clean package -DskipTests

# Gération de l'image openjdk
FROM openjdk:8
WORKDIR /usr/src/directory
COPY --from=MAVEN /usr/src/directory/target/*.jar ./directory.jar

#Execution
ENTRYPOINT ["sh", "-c", "java -jar directory.jar"]
