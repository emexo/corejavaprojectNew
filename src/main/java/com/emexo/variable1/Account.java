package com.emexo.variable1;

import lombok.extern.log4j.Log4j2;

/**
 * Static variable example
 * @Author Regu
 */
@Log4j2
public class Account {
    // static variable
    public static final String BANK_NAME = "SBI";

    static void main() {

        // invoke the static variable
        log.info(Account.BANK_NAME);
    }
}
