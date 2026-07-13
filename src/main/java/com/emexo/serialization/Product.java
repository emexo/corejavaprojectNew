package com.emexo.serialization;

import java.io.Serializable;

public class Product implements Serializable {
    public static final long serialVersionUID = 987987L;

    public static final String CATEGORY_ELECTRONICS = "Electronics";

    private int id;
    private transient String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
