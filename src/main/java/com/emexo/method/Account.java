package com.emexo.method;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Account {
    /**
     * Static method
     * @param name
     * @return
     */
    public static String getBankName(String name){
        return name;
    }

    public static void getBankName(){
        var bankName = "SBI";
        log.info("Bank Name:{}", bankName);
    }
}
