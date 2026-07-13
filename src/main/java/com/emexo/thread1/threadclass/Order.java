package com.emexo.thread1.threadclass;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Order extends Thread {
    private int orderId;
    private String orderName;

    public Order(int orderId, String orderName) {
        this.orderId = orderId;
        this.orderName = orderName;
    }

    @Override
    public void run() {
        log.info("Thread started:{}, Order ID:{}, Order Name:{}", Thread.currentThread().getName(), orderId, orderName);
        try {
            Thread.sleep(6000); // Simulate time taken to process the order
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("Thread completed:{}, Order ID:{}, Order Name:{}", Thread.currentThread().getName(), orderId, orderName);
    }

}
