package com.emexo.javafeatures.java11;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Log4j2
public class ConvertToArray{
    public static void main(String[] args){
    List<String> names=new ArrayList<>();
      names.add("alex");
      names.add("brian");
      names.add("charles");

      String[] namesArr1=names.toArray(new String[names.size()]);  //BeforeJava11
  
      String[] namesArr2=names.toArray(String[]::new);  // from java11
      log.info(namesArr2[0]);
      log.info(namesArr2[1]);
      log.info(namesArr2[2]);
    }
}
