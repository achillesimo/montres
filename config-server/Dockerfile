FROM maven:3.5-jdk-8 as MAVEN

COPY . .
RUN mvn clean package -DskipTests

#use openjdk
FROM openjdk:8

#Repertoire pour le stockage des informations
#VOLUME /var/docker/lf-backend

#Copy jar file
COPY --from=MAVEN target/config-server.jar config-server.jar

#Jar port
EXPOSE 8888

#Execution
ENTRYPOINT ["sh", "-c", "java -jar config-server.jar"]

#FROM maven:3.5-jdk-8 as MAVEN

#COPY . .
#RUN mvn clean package -DskipTests


#use openjdk
#FROM openjdk:8
#COPY --from=MAVEN target/config-server.jar config-server.jar
#ENTRYPOINT ["sh", "-c", "java -jar config-server.jar"]


#pour générer le jar mvn clean package 
#Copy jar file
#ADD target/nomDuJar.jar nomDuJar.jar

#Jar port
#EXPOSE 9090

#Execution
#ENTRYPOINT ["sh", "-c", "java -jar nomDuJar.jar"]