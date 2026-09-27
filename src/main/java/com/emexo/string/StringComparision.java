package com.emexo.string;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class StringComparision {
    public static void main(String[] args) {
        String str1 = "amit"; // string pool
        String str2 = new String("amit"); // heap area

        StringComparision comparision = new StringComparision();
         String response = comparision.compare(str1, str2);
         log.info("Response:{}", response);
    }


    public String compare(String str1, String str2) {
        String response;
        if (str1.compareTo(str2) == 0) {
            response = "Both the strings are equal";
        } else{
            response = "Both the strings are not equal";
        }

        return response;
    }

}
