package com.emexo.loopingstatement;

public class NestedForLoop {
    public static void main(String[] args) {
        int numRows = 5;

        outer:
        for(int i=1; i<=numRows; i++){
            inner:
            for(int j=i; j<=numRows; j++){
                if(j == 3)
                    continue inner;
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

// 1 2 4 5
