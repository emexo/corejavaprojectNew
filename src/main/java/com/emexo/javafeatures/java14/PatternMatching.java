package com.emexo.javafeatures.java14;

public class PatternMatching {
    public static void main(String[] args) {
        Object obj = "Hello Java";

        if(obj instanceof String) {

            String str = (String) obj;
        }

        if(obj instanceof String str) {

            System.out.println(str.toUpperCase());
        } else{
            System.out.println();
        }
    }
}
