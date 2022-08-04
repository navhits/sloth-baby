FROM openjdk:11
COPY . /sast/example1
WORKDIR /
RUN javac sast/example1/*.java
CMD ["java", "sast/example1/Main"]
