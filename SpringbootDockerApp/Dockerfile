FROM openjdk:17-jdk-alphine
COPY ./target/SpringbootDockerApp-0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch SpringbootDockerApp-0.0.1-SNAPSHOT.jar'
ENTRYPOINT [ "java","-jar","SpringbootDockerApp-0.0.1-SNAPSHOT.jar" ]
