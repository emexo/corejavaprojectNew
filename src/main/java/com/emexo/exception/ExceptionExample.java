package com.emexo.exception;


import lombok.extern.log4j.Log4j2;

import java.io.FileInputStream;
import java.io.IOException;

@Log4j2
public class ExceptionExample {

    public static void main(String[] args) {
        ExceptionExample obj = new ExceptionExample();
        int res = 0;
        try{
            obj.divide(10, 2);
        } catch (InvalidInput ex){
            ex.printStackTrace();
        }
        log.info("Response:{}", res);
    }

    public int divide(int a, int b) throws InvalidInput{
        if(a <=0 || b<=0){
            throw new InvalidInput("Invalid input");
        }
        int c = 0;
        try {
            c = a/b;

        } catch (ArithmeticException | NullPointerException ex){
            ex.printStackTrace();
        } finally {
            log.info("#######Finally#####");
        }
        log.info("output:{}", c);
        return c;
    }

}
