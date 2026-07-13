package com.emexo.loopingstatement;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class LoopingExample1 {
    public static void main(String[] args) {
        LoopingExample1 example1 = new LoopingExample1();
        example1.print(5);
    }

    public void print(int n){
     int i=1;

     while (i<=n){
         log.info(i);
         i++;
     }
    }

    public void print1(int n){
        int i=1;

        do{
            log.info(i);
            i++;
        }while (i<=n);
    }
}
