package com.emexo.javafeatures.java8.lambda;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AdditionMain {
    public static void main(String[] args) {
       Addition addition = (a, b)->{
            int output = a + b;
           return output;
       };

       int response = addition.add(10, 5);
       log.info("Response:{}", response);
    }
}
