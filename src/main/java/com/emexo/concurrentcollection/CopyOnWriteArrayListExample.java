package com.emexo.concurrentcollection;

import lombok.extern.log4j.Log4j2;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;


@Log4j2
public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("TN", "Chennai"); // Entry
        map.put("KL", "Trivandrum");

      Map<String, String> unmodifiableMap =  Collections.unmodifiableMap(map);

        unmodifiableMap.put("KA", "Bangalore");

        log.info(unmodifiableMap.size());

        // segment 1

        // segment 2
    }
}
