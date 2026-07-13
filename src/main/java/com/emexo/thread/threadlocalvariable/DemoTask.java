package com.emexo.thread.threadlocalvariable;


import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class DemoTask implements Runnable {
    // Atomic integer containing the next thread ID to be assigned
    private static final AtomicInteger nextId = new AtomicInteger(0);

    // Thread local variable containing each thread's ID
    private static final ThreadLocal<Integer> threadId = ThreadLocal.withInitial(() -> nextId.getAndIncrement());

    // Returns the current thread's unique ID, assigning it if necessary
    public int getThreadId() {
        return threadId.get();
    }

    // Returns the current thread's starting timestamp
    private static final ThreadLocal<Date> startDate = ThreadLocal.withInitial(() -> new Date());

    @Override
    public void run() {
        System.out.printf("Starting %s Thread: %s : %s\n",Thread.currentThread().getName(), getThreadId(),startDate.get());
        try {
            TimeUnit.SECONDS.sleep((int) Math.rint(Math.random() * 10));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.printf("Thread %s Finished: %s : %s\n",Thread.currentThread().getName(), getThreadId(),startDate.get());
    }
}
