package com.emexo.collection.queue;

import lombok.extern.log4j.Log4j2;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

@Log4j2
public class QueueExample {
    public static void main(String[] args) {
        Queue<String> strings = new PriorityQueue<>();
        strings.offer("chennai");
        strings.offer("mumbai");
        strings.offer("mumbai");

        strings.forEach(data -> log.info(data));

    }
}
