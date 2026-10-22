package com.emexo.string;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MutableString {
    public static void main(String[] args) {

        MutableString mutableString = new MutableString();
        mutableString.print("Hi", "Hello");

        mutableString.print1("welcome", " to java");

    }

    public void print(String str1, String str2){
        StringBuilder builder = new StringBuilder();
        builder.append(str1);
        builder.append(str2);
        log.info(builder);
    }

    public void print1(String str1, String str2){
        StringBuffer buffer = new StringBuffer();
        buffer.append(str1);
        buffer.append(str2);
        log.info(buffer.toString()); // convert to String
    }

}
