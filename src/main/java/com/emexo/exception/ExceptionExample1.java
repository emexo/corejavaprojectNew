package com.emexo.exception;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class ExceptionExample1 {

    public static void main(String[] args) {
        ExceptionExample1 example = new ExceptionExample1();
        log.info("Enter the input values for division: ");

        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();

        int result = example.divide(input1, input2);
        log.info("Final Result: {}", result);


    }
    public int divide(int input1, int input2){
       log.info("Input to divide method: input1 = {}, input2 = {}", input1, input2);
        int result = 0;
        try {
              result = input1 / input2;
        } catch (ArithmeticException | NullPointerException ex){
            log.error("ArithmeticException while dividing the no", ex);
        } catch (Exception ex2){
            log.error("Exception while dividing the no", ex2);
        } finally {
            log.info("Finally block executed");
        }
        log.info("Result of division: {}", result);

        return result;
    }
}
