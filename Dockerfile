FROM alpine
WORKDIR /root/hello-world
COPY HelloWorld.java /root/hello-world
RUN apk add openjdk8

RUN javac HelloWorld.java
ENTRYPOINT java HelloWorld