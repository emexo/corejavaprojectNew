package com.emexo.constructor;

import lombok.extern.log4j.Log4j2;

/**
 * Constructor class for Account
 * @author Emexo
 */
// single line comment
@Log4j2
public class Account {
    private long accountNumber;
    private String accountHolderName;

    /**
     * Default constructor for Account class
     */
    public Account(){
       this.accountNumber = 0;
       this.accountHolderName = null;
    }

    /**
     * Parameterized constructor for Account class
     * @param accNo account number
     * @param accName account holder name
     */
    public Account(int accNo, String accName){
        this.accountNumber = accNo;
        this.accountHolderName = accName;
    }

    static void main() {
        Account account1 = new Account();
        log.info("Account 1: " + account1.accountNumber + ", " + account1.accountHolderName);
        Account account2 = new Account(123456, "John Doe");
        log.info("Account 2: " + account2.accountNumber + ", " + account2.accountHolderName);
    }
}
