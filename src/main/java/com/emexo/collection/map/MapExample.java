package com.emexo.collection.map;

import lombok.extern.log4j.Log4j2;

import java.util.*;

@Log4j2
public class MapExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("tamilnadu", "chennai"); // Entry
        map.put("kerala", "trivandrum");
        map.put("karnataka", "bengaluru");
        map.put("karnataka", "bangalore");
        map.put(null, "mumbai");
        map.put(null, "kolkata");

        map.get("tamilnadu");

       Set<Map.Entry<String, String>>  entrySet = map.entrySet();

       for (Map.Entry<String, String> set: entrySet){
           log.info("key:{} and value:{}", set.getKey(), set.getValue());
       }
    }
}
