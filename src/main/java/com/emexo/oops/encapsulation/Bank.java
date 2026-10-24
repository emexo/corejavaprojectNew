package com.emexo.oops.encapsulation;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Bank {
    private double balance;

    public void deposit(double amount){
        if (balance > 100){
            balance = balance+amount;
        } else {
            log.info("Invalid amount");
        }
    }


    public double withdraw(){
        return balance;
    }
}
