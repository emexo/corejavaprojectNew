package com.emexo.javafeatures.java13;

public class SwitchExpressionWithYield {
    public static void main(String[] args) {
        int day = 3;
       String dayName = switch(day){
            case 1:
                yield  "Monday";
            case 2:
                yield  "Tuesday";
            case 3:
                yield  "Wednesday";
            case 4:
                yield  "Thursday";
            case 5:
                yield  "Friday";
            case 6:
                yield  "Saturday";
            default:
                yield  "unknown day";
        };

        System.out.println(dayName);
    }
}
