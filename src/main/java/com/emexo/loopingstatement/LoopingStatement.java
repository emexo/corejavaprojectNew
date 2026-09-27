package com.emexo.loopingstatement;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class LoopingStatement {
    static void main() {
        LoopingStatement statement=new LoopingStatement();
        //statement.forLoop(5);
       // statement.forLoop(10);
       // statement.nestedForLoop(5);
       // statement.whileLoop(5);
        statement.doWhile(-5);
    }

    public void forLoop(int n){
       for(int k=1; k<=n; k++){
           log.info(k);
       }
    }

    public void nestedForLoop(int n){
        outer:
        for (int i=1; i<=n; i++){
            inner:
            for(int j=1; j<=i; j++){
                if (i == 3){
                    break outer;
                }
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public void whileLoop(int n){
        int i = 1;

        while (i<=n){
            log.info(i);
            i++;
        }
    }

    public void doWhile(int n){
        int i=1;

        do{
            log.info(i);
            i++;
        } while (i<=n);
    }
}
