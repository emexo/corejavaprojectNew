/*
package com.emexo.javafeatures.java22;


import java.util.concurrent.StructuredTaskScope;

public class StructuredConcurrencyExample {

    static String fetchUser() throws InterruptedException {

        Thread.sleep(1000);

        return "Regu";
    }

    static int fetchAge() throws InterruptedException {

        Thread.sleep(1000);

        return 35;
    }

    public static void main(String[] args) throws Exception {

        try (var scope = StructuredTaskScope.open()) {

            var userTask = scope.fork(() -> fetchUser());

            var ageTask = scope.fork(() -> fetchAge());

            scope.join();

            System.out.println(userTask.get() + " : " + ageTask.get());
        }
    }
}

*/
