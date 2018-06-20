#Génératin du jar
FROM maven:3.5-jdk-8 as MAVEN

WORKDIR .
COPY . .
RUN mvn clean package -DskipTests

# Gération de l'image openjdk
FROM openjdk:8
WORKDIR .
COPY --from=MAVEN ./target/*.jar ./directory.jar

#Execution
ENTRYPOINT ["sh", "-c", "java -jar directory.jar"]
