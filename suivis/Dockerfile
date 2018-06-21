# #Génératin du jar
# FROM maven:3.5-jdk-8 as MAVEN

# WORKDIR /usr/src/suivis
# COPY . /usr/src/suivis/
# RUN mvn clean package -DskipTests

# # Gération de l'image openjdk
# FROM openjdk:8
# WORKDIR /usr/src/suivis
# COPY --from=MAVEN /usr/src/suivis/target/*.jar ./suivis.jar

# #Execution
# ENTRYPOINT ["sh", "-c", "java -jar suivis.jar"]

FROM openjdk:8
COPY . .
#Copy jar file
ADD ./target/suivis.jar suivis.jar

#Execution
ENTRYPOINT ["sh", "-c", "java -jar suivis.jar"]