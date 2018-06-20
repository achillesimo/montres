#use openjdk
FROM openjdk:8

#pour générer le jar mvn clean package 
#Copy jar file
ADD target/nomDuJar.jar nomDuJar.jar

#Jar port
EXPOSE 9090

#Execution
ENTRYPOINT ["sh", "-c", "java -jar nomDuJar.jar"]