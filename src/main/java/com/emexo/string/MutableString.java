package com.emexo.string;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class MutableString {
    public static void main(String[] args) {
        MutableString ms = new MutableString();
        StringBuilder sb = ms.stringBuilderExample("Hello", "World");
        log.info("StringBuilder example: " + sb.toString()); // convert mutable to immutable string

        StringBuffer sfb = ms.stringBufferExample("Hello", "Java");
        log.info("StringBuffer example: " + sfb.toString()); // convert mutable to immutable string
    }

    public StringBuilder stringBuilderExample(String str1, String str2){
        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.append(" ");
        sb.append(str2);
        return sb;
    }

    public StringBuffer stringBufferExample(String str1, String str2){
        StringBuffer sb = new StringBuffer();
        sb.append(str1);
        sb.append(" ");
        sb.append(str2);
        return sb;
    }
}
