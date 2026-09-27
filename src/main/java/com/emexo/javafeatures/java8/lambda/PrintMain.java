package com.emexo.javafeatures.java8.lambda;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PrintMain {

    static void main() {
      Print var =  (str) -> log.info(str);


        var.print("helllo");
    }
}
