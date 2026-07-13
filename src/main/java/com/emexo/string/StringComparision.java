package com.emexo.string;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class StringComparision {
    public static void main(String[] args) {

        String country = "india";
        String country1 = new String("komala");

        StringComparision stringComparision = new StringComparision();
        stringComparision.compareWithDoubleEquals(country1, country);

    }

    public void compareWithDoubleEquals(String str1, String str2){
        if(str1.compareTo(str2) == 0){
            log.info("Both strings are equal str1: {} and str2: {}", str1, str2);
        } else {
            log.info("Both strings are not equal ");
        }
    }


}
