package com.emexo.thread.semaphore;

import java.util.concurrent.Semaphore;

public class Order {
    Semaphore semaphore = new Semaphore(2);

    public static void main(String[] args) {
        Order order = new Order();

        Thread t1 = new Thread(() -> {
            try {
                order.sharedResource(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t1.start();

        Thread t2 = new Thread(()->{
            try {
                order.sharedResource(9000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t2.start();

        Thread t3 = new Thread(()->{
            try {
                order.sharedResource(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t3.start();

        Thread t4 = new Thread(()->{
            try {
                order.sharedResource(9000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        t4.start();


    }

    public void sharedResource(long value) throws InterruptedException {
        semaphore.acquire();
        System.out.println(Thread.currentThread().getName() + " Inside");
        Thread.sleep( value);
        semaphore.release();
        System.out.println(Thread.currentThread().getName() + " Outside");
    }
}
