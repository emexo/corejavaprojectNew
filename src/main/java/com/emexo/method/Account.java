package com.emexo.method;

import lombok.extern.log4j.Log4j2;

import java.util.Date;

@Log4j2
public class Account {
    /**
     * Static method
     * @param name
     * @return
     */
    public String getBankName(String name){
        return name;
    }

    public void getBankName(){
        Date date = new Date();
        var bankName = "SBI";
        log.info("Bank Name:{}", bankName);
    }
}
