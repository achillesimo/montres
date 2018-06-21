# #Génératin du jar
# FROM maven:3.5-jdk-8 as MAVEN

# WORKDIR /usr/src/srv-discovery
# COPY . /usr/src/srv-discovery/
# RUN mvn clean package -DskipTests

# # Gération de l'image openjdk
# FROM openjdk:8
# WORKDIR /usr/src/srv-discovery
# COPY --from=MAVEN /usr/src/srv-discovery/target/*.jar ./srv-discovery.jar

# #Execution
# ENTRYPOINT ["sh", "-c", "java -jar srv-discovery.jar"]

#use openjdk
FROM openjdk:8
COPY . .

#Copy jar file
ADD ./srv-discovery.jar srv-discovery.jar

#Execution
ENTRYPOINT ["sh", "-c", "java -jar srv-discovery.jar"]