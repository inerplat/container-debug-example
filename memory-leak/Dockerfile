FROM eclipse-temurin:11-jdk as builder

WORKDIR /build
COPY . .
RUN chmod +x ./gradlew
RUN ./gradlew clean build -x test

FROM eclipse-temurin:11-jdk
WORKDIR /run
COPY --from=builder /build/build/libs/memory-leak.jar .

CMD ["java", "-Xms64m", "-Xmx64m", "-jar", "memory-leak.jar"]
