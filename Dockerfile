FROM openjdk:17-oracle

COPY target/Booking-1.0-SNAPSHOT.jar Booking.jar
ENTRYPOINT ["java","-jar","/Booking.jar"]