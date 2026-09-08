package com.emexo.thread3;

import lombok.extern.log4j.Log4j2;

import java.util.concurrent.Callable;

@Log4j2
public class OrderTask implements Callable<String> {

    private int orderId;
    private String product;
    private float amount;

    public OrderTask(int orderId, String product, float amount) {
        this.orderId = orderId;
        this.product = product;
        this.amount = amount;
    }

    @Override
    public String call() throws Exception {
        log.info(Thread.currentThread().getName()+ " start");
        Thread.sleep(12000);
        log.info(Thread.currentThread().getName()+ " end");
        return orderId + " : " + product + " : "+ amount;

    }
}
