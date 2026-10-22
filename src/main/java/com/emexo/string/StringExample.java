package com.emexo.string;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class StringExample {
    public static void main(String[] args) {
        String name = "meghana";
        String name1 = new String("Meghana");

        if(name.compareToIgnoreCase(name1) == 0){
            log.info("Both the strings are same");
        } else {
            log.info("Both the strings are not same");
        }
    }


}
