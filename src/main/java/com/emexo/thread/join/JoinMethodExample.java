package com.emexo.thread.join;

/**
 * One thread wait for other thread to finish the execution
 * T2 wait for T1 to finish the execution
 */
public class JoinMethodExample {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread( () -> {
            System.out.println(Thread.currentThread().getName() + " Started");
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " End");
        });

        t1.setName("Child Thread1");
        t1.start();

       t1.join();

        Thread t2 = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " Started");
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " End");
        });
        t2.setName("Child Thread2");
        t2.start();


    }
}
