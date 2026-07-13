package com.emexo.thread1.notify;

public class OddEvenPrinter {

    private int number = 1;
    private final int limit;

    public OddEvenPrinter(int limit) {
        this.limit = limit;
    }

    public void printOdd() {
        synchronized (this) {
            while (number <= limit) {
                if (number % 2 == 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " -> " + number);
                    number++;
                    notify();
                }
            }
        }
    }

    public void printEven() {
        synchronized (this) {
            while (number <= limit) {
                if (number % 2 != 0) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                } else {
                    System.out.println(Thread.currentThread().getName() + " -> " + number);
                    number++;
                    notify();
                }
            }
        }
    }

    public static void main(String[] args) {

        OddEvenPrinter printer = new OddEvenPrinter(10);

        Thread t1 = new Thread(() -> printer.printOdd(), "Thread-1 (Odd)");
        Thread t2 = new Thread(() -> printer.printEven(), "Thread-2 (Even)");

        t1.start();
        t2.start();
    }
}