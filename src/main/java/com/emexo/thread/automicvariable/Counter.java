package com.emexo.thread.automicvariable;

import lombok.extern.log4j.Log4j2;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;

@Log4j2
public class Counter {
    private AtomicInteger value = new AtomicInteger();

    public  void increment() {
       value.incrementAndGet();
    }

    public  void decrement() {
        value.decrementAndGet();
    }

    public int get() {
        return value.get();
    }
}