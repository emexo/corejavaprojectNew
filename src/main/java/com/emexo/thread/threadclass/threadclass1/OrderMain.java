package com.emexo.thread.threadclass.threadclass1;

public class OrderMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " Started");
        OrderTask orderTask = new OrderTask();
        orderTask.start();
        System.out.println(Thread.currentThread().getName() + " End");
    }
}
