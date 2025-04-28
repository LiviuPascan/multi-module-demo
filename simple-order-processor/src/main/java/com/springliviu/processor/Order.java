package com.springliviu.processor;

/** Простая модель заказа */
public class Order {
    private final String userId;
    private final double amount;

    public Order(String userId, double amount) {
        this.userId = userId;
        this.amount = amount;
    }
    public String getUserId() { return userId; }
    public double getAmount() { return amount; }
}