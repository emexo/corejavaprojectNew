package com.emexo.javafeatures.java8.default1;

public class XYImpl implements X, Y{
    @Override
    public void foo() {

    }

    @Override
    public void bar() {
        Y.super.bar();
    }

    @Override
    public void doo() {

    }
}
