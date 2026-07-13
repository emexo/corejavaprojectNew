package com.emexo.thread.reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantExample {

    private final ReentrantLock lock = new ReentrantLock();

    public void print() {
        lock.lock();  // acquire lock
        try {
            System.out.println(Thread.currentThread().getName() + " acquired lock");

            // Reentrant call
            nestedMethod();

        } finally {
            lock.unlock();  // release lock
        }
    }

    private void nestedMethod() {
        lock.lock();  // same thread can lock again
        try {
            System.out.println(Thread.currentThread().getName() + " inside nested method");
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantExample obj = new ReentrantExample();

        Runnable task = obj::print;

        new Thread(task).start();
        new Thread(task).start();
    }
}
