# #Génératin du jar
# FROM maven:3.5-jdk-8 as MAVEN

# WORKDIR /usr/src/gateway
# COPY . /usr/src/gateway/
# RUN mvn clean package -DskipTests

# # Gération de l'image openjdk
# FROM openjdk:8
# WORKDIR /usr/src/gateway
# COPY --from=MAVEN /usr/src/gateway/target/*.jar ./gateway.jar

# #Execution
# ENTRYPOINT ["sh", "-c", "java -jar gateway.jar"]
#use openjdk
FROM openjdk:8
COPY . .
#Copy jar file
ADD target/gateway.jar gateway.jar

#Execution
ENTRYPOINT ["sh", "-c", "java -jar gateway.jar"]