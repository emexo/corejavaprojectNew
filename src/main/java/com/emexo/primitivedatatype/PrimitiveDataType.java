package com.emexo.primitivedatatype;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PrimitiveDataType {

    public int add(int a, int b) {
        return a + b;
    }

    static void main() {
        PrimitiveDataType primitiveDataType = new PrimitiveDataType();
        Integer a = 10;
        Integer b = 20;
        Integer result = primitiveDataType.add(a, b);
        log.info("The sum of {} and {} is {}", a, b, result);
    }
}
