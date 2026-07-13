package com.emexo.javafeatures.java12;

import lombok.extern.log4j.Log4j2;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

@Log4j2
public class TeeingExample1 {
    static void main() {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    Map<String, Integer> result = numbers.stream().collect(Collectors.teeing(minBy(Integer::compareTo),
            maxBy(Integer::compareTo),
                (min, max) -> {
                    Map<String, Integer> map = new HashMap<>();
                    map.put("MIN", min.get());
                    map.put("MAX", max.get());
                    return map;
        }));

    log.info("Result: {}", result);
    }
}
