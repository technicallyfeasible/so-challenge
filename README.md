Plushies Inc Data Store
=======================

The project was initially generated using https://start.spring.io/


## Setup

Install project dependencies:

    ./mvnw install


## Development

Spring Boot dev tools automatically reload the project when changes are made.

    ./mvnw spring-boot:run

The application will be available on

    http://localhost:8081/

At the moment an in-memory database (H2) is used and an inspection tool can be accessed here:

    http://localhost:8081/h2-console


## Testing

To run unit tests

    ./mvnw test


## Description

This service exposes multiple endpoints. Live documentation is automatically generated by Swagger2.

Swagger-UI: http://localhost:8081/swagger-ui.html

API Docs:   http://localhost:8081/v2/api-docs
