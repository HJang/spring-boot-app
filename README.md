# Spring Boot Application

This is a simple Spring Boot application that serves two REST API endpoints: `/service` and `/account`.

## Project Structure

```
spring-boot-app
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           ├── SpringBootApp.java
│   │   │           ├── controller
│   │   │           │   ├── AccountController.java
│   │   │           │   └── ServiceController.java
│   │   │           └── model
│   │   │               ├── Account.java
│   │   │               └── Service.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── static
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── SpringBootAppTests.java
├── pom.xml
└── README.md
```

## Setup Instructions

1. Clone the repository or download the project files.
2. Ensure you have Java and Maven installed on your machine.
3. Set the environment variable `DOMAIN_NAME` to your desired domain name.
4. Navigate to the project directory and run the following command to start the application:

   ```
   mvn spring-boot:run
   ```

## API Endpoints

### Service Endpoint

- **GET /service**
  - Returns: `Hello, Raymond. I am service agent`

- **POST /service**
  - Request Body: JSON payload with `service name` and `service description`
  - Returns: `{service name} is registered`

### Account Endpoint

- **GET /account**
  - Returns: `account balance is {balance}` (default balance is 0)

- **POST /account**
  - Request Body: JSON payload with `credit` and `debit` (both are numbers)
  - Updates the account balance by adding credit and subtracting debit.

## Testing

To run the tests, use the following command:

```
mvn test
```

This will execute the test cases defined in `SpringBootAppTests.java` to ensure the application behaves as expected.