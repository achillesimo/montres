# #Génératin du jar
# FROM maven:3.5-jdk-8 as MAVEN

# WORKDIR /usr/src/utilisateurs
# COPY . /usr/src/utilisateurs/
# RUN mvn clean package -DskipTests

# # Gération de l'image openjdk
# FROM openjdk:8
# WORKDIR /usr/src/utilisateurs
# COPY --from=MAVEN /usr/src/utilisateurs/target/*.jar ./utilisateurs.jar

# #Execution
# ENTRYPOINT ["sh", "-c", "java -jar utilisateurs.jar"]

FROM openjdk:8
COPY . .
#Copy jar file
ADD ./utilisateurs.jar utilisateurs.jar

#Execution
ENTRYPOINT ["sh", "-c", "java -jar utilisateurs.jar"]