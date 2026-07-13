package com.emexo.javafeatures.java11;

import lombok.extern.log4j.Log4j2;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Log4j2
public class StringLines {
     public static void main(String[] args) 
    {
      String string = """
              apple
              orange
              banana
              apricot
              """;

      Stream<String> stringStream = string.lines();

      //stringStream.forEach(log::info);
       // List<String> list = stringStream.toList();
        //log.info(list);

       List<String>  list =  stringStream.filter(data -> data.startsWith("a")).toList();
       log.info(list);



    }

}
