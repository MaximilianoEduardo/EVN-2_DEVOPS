# ==========================================
# ETAPA 1: Compilación y Construcción (Builder)
# ==========================================
FROM maven:3.9.6-eclipse-temurin-17-alpine AS builder


WORKDIR /app


COPY pom.xml .


RUN mvn dependency:go-offline -B


COPY src ./src


RUN mvn clean package -DskipTests


FROM eclipse-temurin:17-jre-alpine


WORKDIR /app


RUN addgroup -S devopsgroup && adduser -S devopsuser -G devopsgroup
USER devopsuser


COPY --from=builder /app/target/microservicio-evaluacion-0.0.1-SNAPSHOT.jar app.jar


EXPOSE 8080


ENTRYPOINT ["java", "-jar", "app.jar"]