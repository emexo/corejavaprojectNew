package com.emexo.generics;

import lombok.extern.log4j.Log4j2;

//type parameter
@Log4j2
public class Box<T> {
   private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setData("regu");
        log.info(box.getData());

        Box<Integer> box1 = new Box<>();
        box1.setData(1);
        log.info(box1.getData());
    }
}
