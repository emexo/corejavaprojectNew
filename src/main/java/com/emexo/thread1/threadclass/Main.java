package com.emexo.thread1.threadclass;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(1, "Order 1");
        Order order2 = new Order(2, "Order 2");
        Order order3 = new Order(3, "Order 3");

        order1.start();
        order2.start();
        order3.start();
    }
}
