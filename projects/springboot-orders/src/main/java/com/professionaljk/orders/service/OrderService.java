package com.professionaljk.orders.service;

import com.professionaljk.orders.model.Order;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class OrderService {

    public final List<Order> orders = new ArrayList<>(Arrays.asList(
            new Order(1, "Laptop", 1, 70000.00),
            new Order(2, "Mouse", 2, 1500.50),
            new Order(3, "Keyboard", 1, 3200.00)
    ));

    public List<Order> getAllOrders() {
        return new ArrayList<>(orders);
    }

    public Optional<Order> getOrderById(int id) {
        return orders.stream().filter(e -> e.getId() == id).findFirst();
    }

    public Optional<Order> createOrder(Order orderRequest) {
        if (!isValidRequest(orderRequest)) {
            return Optional.empty();
        }
        int newId = orders.stream().mapToInt(Order::getId).max().orElse(0) + 1;
        Order newOrder = new Order(newId, orderRequest.getItemName(), orderRequest.getQuantity(), orderRequest.getPrice());
        orders.add(newOrder);
        return Optional.of(newOrder);
    }

    public boolean isValidRequest(Order o) {
        return o.getItemName() != null && !o.getItemName().isEmpty()
                && o.getQuantity() > 0
                && o.getPrice() >= 0;
    }

    public Optional<Order> updateOrder(int id, Order update) {
        for (int i = 0; i < orders.size(); i++) {
            Order existing = orders.get(i);
            if (existing.getId() == id) {
                // create new Order object with same id
                Order updated = new Order(id,
                        update.getItemName() != null ? update.getItemName() : existing.getItemName(),
                        update.getQuantity() != 0 ? update.getQuantity() : existing.getQuantity(),
                        update.getPrice() != 0.0 ? update.getPrice() : existing.getPrice()
                );
                orders.set(i, updated);
                return Optional.of(updated);
            }
        }
        return Optional.empty();
    }

    public boolean deleteOrderById(int id) {
        Iterator<Order> it = orders.iterator();
        while (it.hasNext()) {
            Order o = it.next();
            if (o.getId() == id) {
                it.remove();
                return true;
            }
        }
        return false;
    }
}
