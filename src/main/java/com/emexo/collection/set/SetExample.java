package com.emexo.collection.set;

import lombok.extern.log4j.Log4j2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

@Log4j2
public class SetExample {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("Python");
        set.add("Java"); // Duplicate, will not be added
        set.add("C++");
        //set.add(null); // Adding null value
       // set.add(null); // Duplicate null, will not be added

        log.info(set);
    }
}
