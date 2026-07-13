package com.emexo.javafeatures.java12;

import lombok.Setter;
import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.List;
@Log4j2
public class StringTransform {
    public static void main(String[] args) {
        String name = "   Alex   ";

        String name2 = name.strip().toUpperCase();

        String name1 = name.transform(str -> str.strip().toUpperCase());

        log.info(name1);
        log.info(name2);

    }
}
