package com.emexo.javafeatures.java11;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class StringIsBlank {
    public static void main(String[] args) {
        String str = " ";
        log.info(str.length()); //0
       log.info(str.isEmpty());  //true
       log.info(str.isBlank()); // true
    }
}
