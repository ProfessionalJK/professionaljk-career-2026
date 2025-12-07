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

- `POST /orders` -> Create a new order.
**Request**
```json
{
  "itemName": "Monitor",
  "quantity": 1,
  "price": 15000.00
}
```
**Success (201)**
```json
{
  "id": 4,
  "itemName": "Monitor",
  "quantity": 1,
  "price": 15000.0
}
```
**Failure (400)**
```STATUS
400 Bad Request
```

- `PUT /orders/{id}` -> Update an existing order.
**Request**
```json
{
  "itemName": "Gaming Laptop",
  "quantity": 1,
  "price": 90000.00
}
```
**Success (200)**
```json
{
  "id": 1,
  "itemName": "Gaming Laptop",
  "quantity": 1,
  "price": 90000.0
}
```
**Failure (404)**
```STATUS
404 Not Found
```

- `DELETE /orders/{id}` -> Delete an order by id.
**Success (204)**
```STATUS
204 No Content
```
**Failure (404)**
```STATUS
404 Not Found
```

### Tech Stack
- Java 25
- Spring Boot
- Maven
- REST API