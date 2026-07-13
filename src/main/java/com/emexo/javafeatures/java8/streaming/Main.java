package com.emexo.javafeatures.java8.streaming;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> electronicsProducts = List.of(
                new Product("iPhone", 80000),
                new Product("Samsung TV", 50000),
                new Product("Laptop", 90000)
        );

        List<Product> fashionProducts = List.of(
                new Product("Nike Shoes", 7000),
                new Product("T-Shirt", 1500)
        );

        Category electronics = new Category(1, "Electronics", electronicsProducts);
        Category fashion = new Category(2, "Fashion", fashionProducts);

        List<Category> categories = List.of(electronics, fashion);

        List<Product> result = categories.stream()
                .filter(c -> c.getName().equalsIgnoreCase("Electronics"))
                .findFirst()
                .map(Category::getProducts)
                .orElse(Collections.emptyList());

        //Get top 3 expensive products across all categories
        List<Product> topProducts = categories.stream()
                .flatMap(c -> c.getProducts().stream())
                .sorted(Comparator.comparing(Product::getPrice).reversed())
                .limit(3)
                .toList();

        //Get products above a price in a specific category
        List<Product> result1 = categories.stream()
                .filter(c -> c.getName().equalsIgnoreCase("Electronics"))
                .flatMap(c -> c.getProducts().stream())
                .filter(p -> p.getPrice() > 60000)
                .toList();

        //Map Category → Product Names
        Map<String, List<String>> result2 = categories.parallelStream()
                .collect(Collectors.toMap(
                        Category::getName,
                        c -> c.getProducts().stream()
                                .map(Product::getName)
                                .toList()
                ));
    }
}
