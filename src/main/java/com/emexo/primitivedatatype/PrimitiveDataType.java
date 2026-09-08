package com.emexo.primitivedatatype;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class PrimitiveDataType {

    private Byte byteValue;
    private Short shortValue;

    public PrimitiveDataType(Byte byteValue, Short shortValue){
        this.byteValue = byteValue;
        this.shortValue = shortValue;
    }

    public void print(){
        log.info("byte value:{} and short value:{}", byteValue, shortValue);
    }

    static void main() {
        Integer i = 90;
        PrimitiveDataType primitiveDataType = new PrimitiveDataType(i.byteValue(), i.shortValue());
        primitiveDataType.print();
    }
}
