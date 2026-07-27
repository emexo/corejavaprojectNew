package com.emexo.collection.set;

import lombok.extern.log4j.Log4j2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

@Log4j2
public class SetExample {
    public static void main(String[] args) {

       Set<String> set = new TreeSet<>();
       set.add("chennai");
       set.add("mumbai");
       set.add("kolkata");
       set.add("kolkata");
       set.add("kolkata");
       set.add("kolkata");


       log.info(set.size());

       set.forEach(data -> log.info(data));
    }
}
