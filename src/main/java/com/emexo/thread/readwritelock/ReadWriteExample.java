package com.emexo.thread.readwritelock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteExample {

    private int value = 0;
    private final ReentrantReadWriteLock lock = new ReentrantReadWriteLock();

    // Read operation
    public int readValue() {
        lock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " reading: " + value);
            return value;
        } finally {
            lock.readLock().unlock();
        }
    }

    // Write operation
    public void writeValue(int newValue) {
        lock.writeLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + " writing: " + newValue);
            value = newValue;
        } finally {
            lock.writeLock().unlock();
        }
    }

    public static void main(String[] args) {
        ReadWriteExample obj = new ReadWriteExample();

        Runnable reader = () -> obj.readValue();
        Runnable writer = () -> obj.writeValue((int)(Math.random() * 100));

        // Multiple readers
        for (int i = 0; i < 3; i++) {
            new Thread(reader).start();
        }

        // One writer
        new Thread(writer).start();
    }
}
