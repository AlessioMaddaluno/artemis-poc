# Artemis POC

This is a minimal Spring Boot application that demonstrates how to use Artemis Active MQ as a messaging broker. This application uses the Spring Boot Starter for Apache Artemis, which provides the necessary dependencies and configurations to use Artemis.

## Prerequisites

To run this application, you need the following:

- Java 11 or higher
- Maven
- Active MQ Artemis 

## Getting started

To get started with this application, follow these steps:

1. Clone this repository: `git clone https://github.com/AlessioMaddaluno/artemis-poc.git`
2. Navigate to the project directory: `cd artemis-poc`
3. Edit the `application.yml` file according to your Artemis Configuration
4. Run the application: `mvn spring-boot:run`

This will start the Spring Boot application listening on the default port 8080. 

At this point you should already installed Artemis Active MQ with the default settings.

## How it works

This application defines a single ENDPOINT:

- `/message`: When called, passing a text as request body, it will send the message on the message broker queue. The message then, will be logged on the console.

The messaging functionality is implemented using a `JmsTemplate` bean provided by the `spring-boot-starter-artemis` dependency. The `JmsTemplate` sends messages to the `TestQueue` queue and receives messages from the same queue.

The Artemis Active MQ broker is configured using the `application.yml` file. The `spring.artemis.host` and `spring.artemis.port` properties define the host and port of the Artemis broker.

Can be easly tested using cURL:

`curl -d "Hello World" localhost:8080/message`

## References

- [Spring Boot Starter for Apache Artemis documentation](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-artemis)
- [Apache Artemis documentation](https://activemq.apache.org/artemis/)
