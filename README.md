# Desafio_Uno: Spring Boot REST Service for Data Consolidation

This repository contains a Java 8 Spring Boot RESTful web service developed to address the requirements of "Desafio 1" (Challenge 1). The service focuses on consolidating data and exposes its functionalities via a REST API, complete with Swagger documentation.

## Project Structure

- `src/`: Standard Maven source directory containing Java source code (`main`, `test`).
- `vars/`: Likely contains configuration files or environment-specific variables.
- `Dockerfile`: Defines the steps to build a Docker image for containerizing the application.
- `pom.xml`: Maven Project Object Model file, defining project dependencies, build process, and metadata.
- `valoresInOut.json`: A JSON file likely used for input data, output data, or configuration related to data processing.
- `README.md`: This file, providing an overview, setup, and execution instructions.

## Technology and Libraries Used

*   **Java 8:** The core programming language.
*   **Spring Boot:** Framework for building production-ready, stand-alone Spring applications.
*   **Swagger/OpenAPI:** Tools for designing, building, documenting, and consuming RESTful web services.

## How It Works

The application provides a REST API endpoint (specifically `/base/consolidadatos`) to consolidate data. It's built with Spring Boot, making it a self-contained, executable service. The `application.properties` file (likely within `src/main/resources`) controls application settings, including port numbers and external service dependencies.

## Compilation and Execution

To compile and run the application, ensure you have Maven installed.

### Compilation

Navigate to the project's root directory and execute:

```bash
mvn compile
```

### Execution

After compilation, from the project's root directory, execute:

```bash
mvn spring-boot:run
```

**Important Notes:**

*   **Access URL:** Once running, the service can be accessed at `http://127.0.0.1:8081/base/consolidadatos`.
*   **Swagger Documentation:** API documentation is available at `http://127.0.0.1:8081/swagger-ui.html#!`.
*   **Port Configuration:** The application listens on port `8081` and attempts to connect to a service on port `8080` (likely "GDD service"). These ports can be modified in the `application.properties` file.

## Containerization

A `Dockerfile` is provided for building a Docker image of the application, enabling easy deployment in containerized environments.

## Contribution

Feel free to fork this repository, make improvements, and submit pull requests.