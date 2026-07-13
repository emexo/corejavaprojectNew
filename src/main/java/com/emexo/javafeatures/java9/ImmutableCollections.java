package com.emexo.javafeatures.java9;

import lombok.extern.log4j.Log4j2;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Log4j2
public class ImmutableCollections {
     public static void main(String[] args) 
  {

    List<String> namesList = List.of("Lokesh", "Amit", "John", "Lokesh");




    Set<String> namesSet = Set.of("Lokesh", "Amit", "John");

    log.info(namesList);

    Map<String, String> namesMap = Map.ofEntries(
                                  Map.entry("1", "Lokesh"),
                                  Map.entry("2", "Amit"),
                                  Map.entry("3", "Brian"));
  }

}
