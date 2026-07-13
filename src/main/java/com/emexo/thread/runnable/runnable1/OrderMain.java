package com.emexo.thread.runnable.runnable1;

public class OrderMain {
    public static void main(String[] args) {

        System.out.println("Start " + Thread.currentThread().getName());

        Thread t1 = new Thread(new OrderTask(1, "Bangalore"));
        t1.start();

        System.out.println("End " + Thread.currentThread().getName());
    }
}
