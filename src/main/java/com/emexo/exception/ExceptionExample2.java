package com.emexo.exception;

import lombok.extern.log4j.Log4j2;

import java.util.Scanner;

@Log4j2
public class ExceptionExample2 {
    public static void main(String[] args) {
        ExceptionExample2 example = new ExceptionExample2();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int result = example.divide(num1, num2);
        log.info("Final result of division is {}", result);
    }


    public int divide(int input1, int input2) {
        log.info("Dividing {} by {}", input1, input2);
        int result = 0;

        try{
            result = input1/input2;

        } catch (ArithmeticException | NullPointerException _ ){
            log.error("Error occurred while dividing numbers");
        } catch (Exception e2){
            log.error("Error occurred while dividing numbers: {}", e2);
        } finally {
            log.info("#######Finally#####");
        }
        return result;
    }
}
