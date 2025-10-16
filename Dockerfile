FROM openjdk:20-jdk
WORKDIR /app
COPY . /app
RUN javac Test.java
CMD ["java", "Test"]