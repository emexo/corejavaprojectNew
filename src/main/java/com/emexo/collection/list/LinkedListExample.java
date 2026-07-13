package com.emexo.collection.list;

import lombok.extern.log4j.Log4j2;

import java.util.LinkedList;
import java.util.List;

@Log4j2
public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Bangalore");
        list.add("Mumbai");
        list.add("Chennai");
        list.add("Chennai");

        list.forEach(data -> log.info(data));
    }
}
