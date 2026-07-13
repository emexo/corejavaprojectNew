package com.emexo.string;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class StringExample {
    public static void main(String[] args) {
       String str = "hello";
       String str1 = new String("Hello");

       StringExample stringExample = new StringExample();
       stringExample.stringCompare(str, str1);

    }

    public void stringCompare(String str1, String str2) {
        if (str1.compareToIgnoreCase(str2) == 0) {
            log.info("Strings are equal");
        } else {
            log.info("Strings are not equal");
        }
    }
}
