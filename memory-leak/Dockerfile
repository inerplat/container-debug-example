FROM eclipse-temurin:11-jre
WORKDIR /run
COPY build/libs/memory-leak.jar .

CMD ["java", "-Xms64m", "-Xmx64m", "-jar", "memory-leak.jar"]
