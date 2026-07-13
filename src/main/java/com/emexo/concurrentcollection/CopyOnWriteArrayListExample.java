package com.emexo.concurrentcollection;

import lombok.extern.log4j.Log4j2;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

@Log4j2
public class CopyOnWriteArrayListExample {
    public static void main(String[] args) {
       Set<String> list = new HashSet<>();
       list.add("Chennai");
       list.add("Mumbai");
       list.add("Bangalore");

       Collections.synchronizedSet(list);
       log.info(list);
    }
}
