package com.emexo.thread.runnable.runnable1;

public class RunnableTaskWithLambda {
    public static void main(String[] args) {

        Runnable runnable = () -> System.out.println("Start " + Thread.currentThread().getName());

        Thread t1 = new Thread(runnable);

        t1.start();

    }
}
