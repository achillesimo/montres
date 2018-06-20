#Génératin du jar
#FROM maven:3.5-jdk-8 as MAVEN

#WORKDIR /usr/src/directory
#COPY . /usr/src/directory/
#RUN ls -al
#RUN pwd
#RUN mvn install

# Gération de l'image openjdk
#FROM openjdk:8
#WORKDIR /usr/src/directory
#COPY --from=MAVEN /usr/src/directory/target/*.jar ./directory.jar

#Execution
#ENTRYPOINT ["sh", "-c", "java -jar directory.jar"]

#use openjdk
FROM openjdk:8


#Copy jar file
ADD target/config-server.jar directory.jar

#Execution
ENTRYPOINT ["sh", "-c", "java -jar directory.jar"]