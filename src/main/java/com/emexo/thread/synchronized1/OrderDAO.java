package com.emexo.thread.synchronized1;

public class OrderDAO {
    public synchronized void save(){
        System.out.println(Thread.currentThread().getName() + " Start");
        try {
            wait(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " End");
    }
}
