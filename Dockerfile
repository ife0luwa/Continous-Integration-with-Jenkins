FROM openjdk:21-oracle

COPY target/Flutterwave-task-0.0.1-SNAPSHOT.jar /Flutterwave-task.jar

CMD ["java", "-jar", "/Flutterwave-task.jar"]