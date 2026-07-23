package com.emexo.collection.list;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Log4j2
public class Main {
    static void main() {
        List<Employee> employees = new ArrayList<>();

        Employee employee1 = new Employee();
        employee1.setEmpId(1);
        employee1.setEmpName("Regu");

        Employee employee2 = new Employee();
        employee2.setEmpId(2);
        employee2.setEmpName("Raju");

        employees.add(employee1);
        employees.add(employee2);

       // log.info(employees.get(0));

        // lambda
        if(CollectionUtils.isNotEmpty(employees)){
           // employees.forEach(data -> log.info(data.getEmpName()));
        }

        // stream
        employees.stream().map(data -> {
           data.setEmpName(data.getEmpName().toUpperCase());
            return data;
        }).forEach(data1 -> log.info(data1));

        // for each
        for(Employee emp: employees){
            log.info(emp);
        }

        // iterator
        Iterator<Employee> iterator = employees.iterator();
        while (iterator.hasNext()){
            log.info(iterator.next());
        }

        ListIterator<Employee> listIterator = employees.listIterator();

        while (listIterator.hasNext()){
            log.info(listIterator.next());
        }

        while (listIterator.hasPrevious()){
            log.info(listIterator.hasPrevious());
        }
    }
}
