FROM eclipse-temurin:11-jdk as builder

WORKDIR /build
COPY . .
RUN chmod +x ./gradlew
RUN ./gradlew clean build -x test

FROM eclipse-temurin:11-jdk
WORKDIR /run
COPY --from=builder /build/build/libs/wrong-db-port.jar .

CMD ["java", "-jar", "wrong-db-port.jar"]