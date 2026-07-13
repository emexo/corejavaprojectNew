package com.emexo.thread.runnable;

public class RunnableThreadWithLambda {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Runnable runnable = ()-> {
            System.out.println(Thread.currentThread().getName()+ " Start");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName()+ " End");
        };

        Thread thread1 = new Thread(runnable);
        thread1.start();

        Thread thread2 = new Thread(runnable);
        thread2.start();
    }
}
