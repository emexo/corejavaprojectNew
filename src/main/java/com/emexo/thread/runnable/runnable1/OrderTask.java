package com.emexo.thread.runnable.runnable1;
//Main thread   -- Child Thread- will not return any data
public class OrderTask implements Runnable{
    private int orderId;
    private String deliveryAddress;

    public OrderTask(int orderId, String deliveryAddress) {
        this.orderId = orderId;
        this.deliveryAddress = deliveryAddress;
    }

    @Override
    public void run() {
        System.out.println("Start " + Thread.currentThread().getName() + " and priority "+ Thread.currentThread().getPriority());

        try {
            Thread.sleep(3000); // halt the execution of the script
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("End " + Thread.currentThread().getName());
    }
}
