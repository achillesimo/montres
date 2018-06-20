FROM maven:3.5-jdk-8 as MAVEN

COPY src /usr/src/config-server/src
COPY pom.xml /usr/src/config-server
RUN mvn -f /usr/src/config-server/pom.xml clean package -DskipTests


#use openjdk
FROM openjdk:8
COPY --from=MAVEN /usr/src/config-server/target/*.jar /maven/
CMD java $JAVA_OPTS -jar maven/*.jar


#pour générer le jar mvn clean package 
#Copy jar file
#ADD target/nomDuJar.jar nomDuJar.jar

#Jar port
#EXPOSE 9090

#Execution
#ENTRYPOINT ["sh", "-c", "java -jar nomDuJar.jar"]