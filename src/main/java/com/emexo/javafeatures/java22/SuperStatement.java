package com.emexo.javafeatures.java22;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class SuperStatement {
    public SuperStatement(){
        log.info("Super statement");
        super();
    }

    static void main() {
        SuperStatement _ = new SuperStatement();
    }
}
