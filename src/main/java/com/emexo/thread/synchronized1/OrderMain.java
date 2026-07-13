package com.emexo.thread.synchronized1;

public class OrderMain {
    public static void main(String[] args) {
        OrderDAO orderDAO = new OrderDAO();

        Thread t1 = new Thread(()-> {
            orderDAO.save();
        });
        t1.start();

        Thread t2 = new Thread(() -> {
            orderDAO.save();
        });
        t2.start();

    }
}
