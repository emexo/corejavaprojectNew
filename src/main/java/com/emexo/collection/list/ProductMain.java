package com.emexo.collection.list;

import lombok.extern.log4j.Log4j2;
import org.apache.commons.collections4.CollectionUtils;

import java.util.*;

@Log4j2
public class ProductMain {
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setProductId(106);
        p1.setProductName("iPhone");

        Product p2 = new Product();
        p2.setProductId(104);
        p2.setProductName("oneplus");

       List<Product> productList = new ArrayList<>(20);
       productList.add(p1);
       productList.add(p2);


       // sort the elements in reverse (descending) order by product name
       Collections.sort(productList, new ProductNameComparator());

        // comparator with lambda
        productList.sort(Comparator.comparing(Product::getProductName).reversed());
        Collections.sort(productList, Comparator.comparing(Product::getProductName));




       //lambda
       productList.forEach(product -> log.info(product));


    }
}
