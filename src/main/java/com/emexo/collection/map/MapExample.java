package com.emexo.collection.map;

import lombok.extern.log4j.Log4j2;

import java.util.*;

@Log4j2
public class MapExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Tamilnadu", "Chennai");
        map.put("Karnataka", "Bengaluru");
        map.put("Karnataka", "BENGALORE");
        map.put("Kerala", "Trivandrum");
        map.put("AP", "Amaravathi");
 

        // Sort the map by value (city) case-insensitively and preserve order
        List<Map.Entry<String, String>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Map.Entry.comparingByValue(Comparator.nullsFirst(String.CASE_INSENSITIVE_ORDER)));

        Map<String, String> sortedByValue = new LinkedHashMap<>();
        for (Map.Entry<String, String> e : entries) {
            sortedByValue.put(e.getKey(), e.getValue());
        }

        // print sorted map
        sortedByValue.forEach((state, city) -> log.info("State: {} -> City: {}", state, city));

    }
}
