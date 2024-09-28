FROM java:17-jdk-alphine
COPY ./target/SpringProject-2.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch SpringProject-1.jar'
ENTRYPOINT [ "java","-jar","SpringProject-2.jar" ]