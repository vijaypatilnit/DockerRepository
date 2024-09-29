FROM openjdk:17-jdk-alphine
COPY ./target/SpringProject-1.0.0.1-SNAPSHOT.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch SpringProject-1.0.0.1-SNAPSHOT.jar'
ENTRYPOINT [ "java","-jar","SpringProject-1.0.0.1-SNAPSHOT.jar" ]