package com.emexo.oops.encapsulation;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class BankMain {
    static void main() {
       Bank bank = new Bank();
       bank.deposit(7000);
       log.info(bank.withdraw());
    }
}
