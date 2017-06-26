FROM java:8
EXPOSE 8080
ADD /target/demoserver.jar demoserver.jar
ENTRYPOINT ["java","-Dspring.data.mongodb.uri=mongodb://mongodb/testdb", "-jar","demoserver.jar"]