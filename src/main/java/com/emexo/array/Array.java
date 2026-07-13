package com.emexo.array;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Array {
    public static void main(String[] args) {
        Array array = new Array();
        array.arrayExample();
    }

    public void arrayExample(){
        String[] array = new String[3];
        array[0] ="Chennai";
        array[1] = "Mumbai";
        array[2] = "Kolkata";

       // log.info(array[0]);
        for(int i = 0; i<array.length; i++){
            log.info(array[i]);
        }

    }

    public void arrayExample1(){
        int[] array = {1, 2, 3};

        log.info(array[2]);
    }

    public void multiDimensionalArray() {
        int[][] array = new int[2][2];
        array[0][0] = 10;
        array[0][1] = 20;
        array[1][0] = 30;
        array[1][1] = 40;

        log.info(array[1][1]);
    }

}
