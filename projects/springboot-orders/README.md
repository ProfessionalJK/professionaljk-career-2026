# Spring Boot Orders API


### Purpose
A backend microservice built using Spring Boot to manage orders.
This service will be used for full-stack system design, CI/CD, Docker and cloud deployment practice.

### Run locally
mvn spring-boot:run

### End points
- `GET /health` -> Returns "OK"
- `GET /orders`-> Returns list of mock orders.
```
Example Response
[
    {"id": 1, "itemName": "Laptop", "quantity": 1, "price": 70000.00},
    {"id": 2, "itemName": "Mouse", "quantity": 2, "price": 1500.5},
    {"id": 3, "itemName": "Keyboard", "quantity": 1, "price": 3200.00},
]
```
- `GET /orders/{id}`

Fetch a single order by id.

**Request**
GET http://localhost:8080/orders/1

**Success (200)**
```json
{
  "id": 1,
  "itemName": "Laptop",
  "quantity": 1,
  "price": 70000.0
}
```

### Tech Stack
- Java 25
- Spring Boot
- Maven
- REST API