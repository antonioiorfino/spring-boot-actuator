# spring-boot-actuator

# ACTION

- Build the application (mvn clean install)
- Run the application (java -jar target/spring-boot-actuator-1.0.0-SNAPSHOT.jar)
- Check availability the health endpoint on actuator (http://localhost:8090/actuator/health)
- Launch "long-run" API (http://localhost:8080/long-run)
- Launch kill -SIGTERM pid

# EXPECTATION

- Application after the SIGTERM signal wait to complete the request and the actuator/health is available

# RESULT

- Application wait to complete the request but the management port is unavailable