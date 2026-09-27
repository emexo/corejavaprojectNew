package com.emexo.string;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MutableString {
    public static void main(String[] args) {

      StringBuffer buffer =  new StringBuffer();
      buffer.append("amit");
      buffer.append(" singh");

      log.info(buffer); //

    }

}
