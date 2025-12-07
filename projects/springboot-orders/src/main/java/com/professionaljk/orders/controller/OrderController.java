package com.professionaljk.orders.controller;

import com.professionaljk.orders.model.Order;
import com.professionaljk.orders.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public List<Order> getOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrdersById(@PathVariable int id) {
        return orderService.getOrderById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Order> createOrder(@RequestBody Order orderRequest) {
        Optional<Order> createdOrder = orderService.createOrder(orderRequest);
        return createdOrder.map(order -> ResponseEntity.status(HttpStatus.CREATED).body(order)).orElseGet(() -> ResponseEntity.badRequest().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateOrder(@PathVariable int id, @RequestBody Order req) {
        // basic validation: itemName non-empty, quantity > 0, price >= 0
        if (req.getItemName() == null || req.getItemName().trim().isEmpty()) {
            return ResponseEntity.badRequest().body("itemName is required");
        }
        if (req.getQuantity() <= 0) {
            return ResponseEntity.badRequest().body("quantity must be > 0");
        }
        if (req.getPrice() < 0) {
            return ResponseEntity.badRequest().body("price must be >= 0");
        }

        return orderService.updateOrder(id, req)
                .map(updated -> ResponseEntity.ok(updated))
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

}
