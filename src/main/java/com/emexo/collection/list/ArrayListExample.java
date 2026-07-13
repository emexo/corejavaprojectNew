package com.emexo.collection.list;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;

import java.util.*;
import java.util.stream.Collectors;

@Log4j2
public class ArrayListExample {
    public static void main(String[] args) {
      List<String> list = new ArrayList<>();
      list.add("Chennai");
      list.add("Mumbai");
      list.add("Bangalore");
      list.add("Bangalore");

      Collections.sort(list, Collections.reverseOrder());  // sort the elements in asc order

        //Collections.sort(list, Collections.reverseOrder()); // sort the elements in the decending order
        log.info(list);
      }
}
