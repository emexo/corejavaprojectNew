package com.emexo.thread1.autamicvariable;


import java.util.concurrent.atomic.AtomicInteger;

public class Counter {

    AtomicInteger value = new AtomicInteger();

    public  void increment() {
       value.incrementAndGet();
    }

    public synchronized void decrement() {
      value.decrementAndGet();
    }

    public int get() {
        return value.get();
    }
}

