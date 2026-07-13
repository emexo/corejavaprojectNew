package com.emexo.string;

import lombok.extern.log4j.*;

import java.util.*;
import java.util.HashMap;

@Log4j2
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        CustomImmutable customImmutable = new CustomImmutable("John Doe", 123, new java.util.Date(), map);
        log.info("Employee Name: " + customImmutable.getEmpName());
        log.info("Employee ID: " + customImmutable.getEmpId());
        log.info("Date: " + customImmutable.getDate());
        log.info("Map: " + customImmutable.getMap());

        Date originalDate = customImmutable.getDate();
        originalDate.setTime(0); // Attempt to modify the date

        log.info("Modified Date: " + customImmutable.getDate());
    }
}
