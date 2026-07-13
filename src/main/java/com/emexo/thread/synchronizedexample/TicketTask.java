package com.emexo.thread.synchronizedexample;

public class TicketTask implements Runnable{

    private long ticketId;
    private String from;
    private String to;
    private Ticket ticket;

    public TicketTask(long ticketId, String from, String to, Ticket ticket) {
        this.ticketId = ticketId;
        this.from = from;
        this.to = to;
        this.ticket = ticket;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Started");
        try {
            ticket.bookTicket2();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
