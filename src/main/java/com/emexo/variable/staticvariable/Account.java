package com.emexo.variable.staticvariable;

import lombok.extern.log4j.Log4j2;

/**
 * Account
 * static variable
 */
@Log4j2
public class Account {
    // static variable
    public static final String BANK_NAME = "Bank of America";

    public static void main(String[] args) {

        //invoke static variable
        log.info("Welcome to " + Account.BANK_NAME);
    }
}
