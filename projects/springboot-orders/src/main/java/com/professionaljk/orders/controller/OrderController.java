package com.professionaljk.orders.controller;

import com.professionaljk.orders.model.Order;
import com.professionaljk.orders.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/orders")
    public List<Order> getOrders() {
        return orderService.getAllOrders();
    }

    @GetMapping("/orders/{id}")
    public ResponseEntity<Order> getOrdersById(@PathVariable int id) {
        return orderService.getOrderById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping("/orders")
    public ResponseEntity<Order> createOrder(@RequestBody Order orderRequest) {
        Optional<Order> createdOrder = orderService.createOrder(orderRequest);
        return createdOrder.map(order -> ResponseEntity.status(HttpStatus.CREATED).body(order)).orElseGet(() -> ResponseEntity.badRequest().build());
    }

}
