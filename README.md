# Spring Boot, Mysql and Docker
Demo project for Spring Boot, Spring Security, JWT Authentication & Authorization, Mysql &amp; Docker

## Prerequisites

Before you begin, ensure you have the following installed:

- [JavaJDK 17](https://openjdk.org/projects/jdk/17)
- [Docker](https://docs.docker.com/get-docker/)
- [Docker Compose](https://docs.docker.com/compose/install/)

## Getting Started

Follow these steps to get the Microservices Architecture up and running:

1. Clone the repository:

   ```bash
   git clone https://github.com/zrg19/spring-boot-mysql-docker.git
   ```

2. Navigate to the project directory:

   ```bash
   cd spring-boot-microservice-docker
   ```
3. Build the Maven Project:

   ```bash
   mvn clean package
   ```
4. Build the Docker images:

   ```bash
   docker-compose build
   ```

5. Start the services:

   ```bash
   docker-compose up -d
      ```

   The `-d` flag runs the services in the background.

6. Monitor the logs:

   ```bash
   docker-compose logs -f
   ```

   Use `Ctrl + C` to exit the log monitoring.

## Accessing Services

Once the services are up and running, you can access the following services:

- **Spring Security, Mysql:**
    - http://localhost:9090

## Stopping the Services

To stop the services and remove the containers, run:

```bash
docker-compose down
```

## Contributing

Feel free to contribute and enhance this Spring Security Mysql Architecture. Submit pull requests, report issues, or share your feedback.

Happy coding! 🚀