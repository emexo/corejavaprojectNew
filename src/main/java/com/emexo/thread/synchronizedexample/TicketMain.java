package com.emexo.thread.synchronizedexample;

public class TicketMain {
    public static void main(String[] args) {

        Ticket ticket = new Ticket();
        Ticket ticket2 = new Ticket();

        TicketTask ticketTask1 = new TicketTask(1l, "Bangalore", "Chennai", ticket);
        TicketTask ticketTask2 = new TicketTask(2l, "Pune", "Bangalore", ticket2);

        Thread t1 = new Thread(ticketTask1);
        t1.start();

        Thread t2 = new Thread(ticketTask2);
        t2.start();
    }
}
