package com.emexo.loopingstatement;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class LoopingStatementExample {
    public static void main(String[] args) {
       LoopingStatementExample example = new LoopingStatementExample();
         example.iterateWithForLoop(5);
    }

    public void iterateWithForLoop(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*" +" ");
            }
            System.out.println();
        }
    }
}



