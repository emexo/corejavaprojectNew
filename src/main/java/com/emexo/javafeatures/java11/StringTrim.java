package com.emexo.javafeatures.java11;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class StringTrim {
    public static void main(String[] args) {
        String s = "\u2003test string\u205F";
        System.out.println(s.strip());

    }
}
