# Spring Form (Java + Spring Boot + Thymeleaf)

A tiny data-entry app with one form.

**Fields:** Name* (required), Title* (required), Age, Hometown  
**After submit:** shows a table of all previous entries (in-memory)

## Run
```bash
mvn spring-boot:run
# then open http://localhost:8080
```

## Build Jar
```bash
mvn clean package
java -jar target/spring-form-0.0.1-SNAPSHOT.jar
```

## Structure
```
src/main/java/com/example/form/...     # Java code
src/main/resources/templates/index.html # View
src/main/resources/static/style.css    # Minimal CSS
```
