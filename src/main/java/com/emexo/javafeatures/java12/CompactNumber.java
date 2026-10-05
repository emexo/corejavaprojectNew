package com.emexo.javafeatures.java12;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumber {

        public static void main(String[] args) {

            long number = 250000;

            NumberFormat shortFormat =
                    NumberFormat.getCompactNumberInstance(
                            Locale.US,
                            NumberFormat.Style.SHORT
                    );

            System.out.println("SHORT : " + shortFormat.format(number));

        }
    }
