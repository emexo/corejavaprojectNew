package com.emexo.autoboxingandunboxing;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Unboxing {
    public static void main(String[] args) {
        Unboxing unboxing = new Unboxing();
        Integer i = 10;
        unboxing.print(i);
    }
    public void print(int i) {
        log.info("Integer value: {}", i);
    }

}
