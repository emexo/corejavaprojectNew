package com.emexo.loopingstatement;

public class LoopingStatement2 {
    public static void main(String[] args) {
        LoopingStatement2 loopingStatement = new LoopingStatement2();
        //loopingStatement.printNumbers(5);
        loopingStatement.printNumbers2(5);
    }

    public void printNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }

    public void printNumbers2(int n){
        int i = 1;

        while (i<=n){
            System.out.println(i);
            i++;
        }
    }

    public void printNumbers3(int n){
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i<=n);
    }
}
