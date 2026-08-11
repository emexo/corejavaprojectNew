package com.emexo.refelection;

import lombok.extern.log4j.Log4j2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Log4j2
public class Main {
    static void main() throws Exception {
        Account account = new Account();

        Class accountClass = account.getClass();

        // access private variable
       Field field = accountClass.getDeclaredField("accountNo");
       field.setAccessible(true);
       field.set(account, 22322);

       log.info(field.get(account));

       // access public variable
        Field field1 = accountClass.getDeclaredField("accountName");
        field1.set(account, "Raghu");
        log.info(field1.get(account));

        // access private method
        Method method = accountClass.getDeclaredMethod("getAccountNo", int.class);
        method.setAccessible(true);
        int accNo = (int) method.invoke(account, 8999);
        log.info(accNo);

        // get the variables
        Field[] fields = accountClass.getDeclaredFields();
        for(Field field2: fields){
            log.info(field2.getName());
        }

        Method[] methods = accountClass.getDeclaredMethods();
        for(Method method1: methods){
            log.info(method1.getName());
        }
    }
}
