package com.emexo.thread.threadclass.threadclass1;

public class OrderTask extends Thread{

    public void run(){
        System.out.println(Thread.currentThread().getName() + " Started");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName() + " End");
    }
}
