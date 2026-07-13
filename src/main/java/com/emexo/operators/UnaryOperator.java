package com.emexo.operators;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class UnaryOperator {
    public static void main(String[] args) {
       int i = 10;

       log.info(i--); // 11
       log.info(i);   //

    }
}
