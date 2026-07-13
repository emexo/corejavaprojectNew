package com.emexo.generics;

import lombok.extern.log4j.Log4j2;

import java.util.Arrays;
import java.util.List;

@Log4j2
public class WildCard {
    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list)
            s += n.doubleValue();
        return s;
    }

    public static void main(String[] args) {
        List<Float> list = Arrays.asList(1.0f,1.2f);
        log.info( WildCard.sumOfList(list));
    }
}
