package com.emexo.lambdaexpression;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TestMain {
    public static void main(String[] args) {
        TestInterface test = str -> log.info("Test Functional interface:{}", str);

        test.print("test");


        Addition addition = (input1, input2)-> input1+input2;

        int response = addition.add(5, 4);
        System.out.println(response);

        int response1 = addition.add(15, 14);
        System.out.println(response1);
    }
}
