package com.emexo.generics;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class GenericMethod {

    public <T extends Number> void print(T msg){
        log.info(msg);
    }

    public static void main(String[] args) {
        GenericMethod method = new GenericMethod();
        method.print(10.4f);
        method.print(234);
    }
}
