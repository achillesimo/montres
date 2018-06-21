# #Génératin du jar
# FROM maven:3.5-jdk-8 as MAVEN

# WORKDIR /usr/src/config-server
# COPY . /usr/src/config-server/
# RUN mvn clean package -DskipTests

# # Gération de l'image openjdk
# FROM openjdk:8
# WORKDIR /usr/src/config-server
# COPY --from=MAVEN /usr/src/config-server/target/*.jar ./config-server.jar

# #Execution
# ENTRYPOINT ["sh", "-c", "java -jar config-server.jar"]

#use openjdk
FROM openjdk:8
COPY . .

#Copy jar file
ADD ./config-server.jar config-server.jar

#Execution
ENTRYPOINT ["sh", "-c", "java -jar config-server.jar"]