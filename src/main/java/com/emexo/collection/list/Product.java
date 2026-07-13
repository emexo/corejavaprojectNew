package com.emexo.collection.list;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * sorting
 * Comparable - natural sorting order
 * Comparator - custom sorting order
 */

@Getter
@Setter
@ToString
public class Product implements Comparable<Product> {
    private int productId;
    private String productName;

    @Override
    public int compareTo(Product product){
        //return this.getProductId() - product.getProductId();
        return  this.getProductName().compareTo(product.getProductName());
    }
}
