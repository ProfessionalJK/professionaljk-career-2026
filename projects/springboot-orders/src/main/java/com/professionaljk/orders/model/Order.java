package com.professionaljk.orders.model;

import lombok.Getter;

@Getter
public class Order {

    private final int id;
    private final String itemName;
    private final int quantity;
    private final double price;

    public Order(int id, String itemName, int quantity, double price) {
        this.id = id;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
    }

}
