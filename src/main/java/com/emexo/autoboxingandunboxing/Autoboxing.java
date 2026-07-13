package com.emexo.autoboxingandunboxing;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Autoboxing {
    public static void main(String[] args) {
        int i = 10; // primitive int
        Autoboxing autoboxing = new Autoboxing();
        autoboxing.print(i); // Autoboxing: primitive int is automatically converted to Integer
    }

    public void print(Integer i) {
        log.info("Integer value: {}", i);
    }


}
