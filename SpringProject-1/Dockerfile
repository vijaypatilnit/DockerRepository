FROM java:8-jdk-alphine
COPY ./target/SpringProject-1.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch SpringProject-1.jar'
ENTRYPOINT [ "java","-jar","SpringProject-1.jar" ]