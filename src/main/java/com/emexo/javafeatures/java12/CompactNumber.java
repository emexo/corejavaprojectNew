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

            shortFormat.setMaximumFractionDigits(1);

            NumberFormat longFormat =
                    NumberFormat.getCompactNumberInstance(
                            Locale.US,
                            NumberFormat.Style.LONG
                    );

            longFormat.setMaximumFractionDigits(1);

            System.out.println("SHORT : " + shortFormat.format(number));
            System.out.println("LONG  : " + longFormat.format(number));
        }
    }
