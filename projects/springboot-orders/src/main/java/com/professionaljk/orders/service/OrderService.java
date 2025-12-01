package com.professionaljk.orders.service;

import com.professionaljk.orders.model.Order;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class OrderService {

    public List<Order> getAllOrders() {
        return Arrays.asList(
                new Order(1, "Laptop", 1, 70000.00),
                new Order(2, "Mouse", 2, 1500.50),
                new Order(3, "Keyboard", 1, 3200.00)
        );
    }
}
