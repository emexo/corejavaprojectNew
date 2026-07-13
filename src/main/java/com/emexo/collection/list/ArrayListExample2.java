package com.emexo.collection.list;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

@Log4j2
public class ArrayListExample2 {
    public static void main(String[] args) {
        ArrayListExample2 arrayListExample = new ArrayListExample2();
        List<String> list = arrayListExample.getCity();
        arrayListExample.iterateWithLambda(list);

    }


    public List<String> getCity(){
        List<String> list = new ArrayList<>();
        list.add("Chennai");
        list.add("Mumbai");
        list.add("Kolkata");



        ListIterator<String> iterator = list.listIterator();
        while (iterator.hasNext()){
            String city = iterator.next();
            log.info(city);
        }

        while (iterator.hasPrevious()){
            String city = iterator.previous();
            log.info(city);
        }

        //list.get(1);

        return list;
    }

    public void iterateWithLambda(List<String> list){
        if(CollectionUtils.isNotEmpty(list)){
            list.forEach(data -> log.info(data));
        }
    }
}


