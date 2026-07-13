package com.emexo.javafeatures.java12;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class SwitchExpression {
    static void main() {
        String day = "MONDAY";

     String result =   switch (day){
         case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> {
             log.info("This is a weekday");
             yield "Weekday";
         }
            case "SATURDAY", "SUNDAY"-> "Weekend";
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };

     log.info("Result: {}", result);
    }
}
