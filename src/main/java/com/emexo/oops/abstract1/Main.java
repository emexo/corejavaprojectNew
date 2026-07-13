package com.emexo.oops.abstract1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {
    public static void main(String[] args) {
        SavingAccount savingAccount = new SavingAccount("SA123", 1000.0);
        savingAccount.deposit(500.0);
        savingAccount.withdraw(200.0);
        savingAccount.savingAccount();

        log.info("Final balance in Saving Account: " + savingAccount.getBalance());

}
}
