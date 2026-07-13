package com.emexo.refelection;

import lombok.extern.log4j.Log4j2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Log4j2
public class LoanMain {
    public static void main(String[] args) throws Exception {
        Loan loan = new Loan(76575785, "Dee");
        // get the class object
        Class loanClass = loan.getClass();

        // access the private variable
      Field field = loanClass.getDeclaredField("loanId");
      field.setAccessible(true);
      field.set(loan, 888888);

     // log.info(field.get(loan));

      // access  private method
        Method method = loanClass.getDeclaredMethod("getLoanId", Integer.class);
        method.setAccessible(true);
        Integer response  = (Integer) method.invoke(loan, 90);
        log.info(response);

       Field[] fields = loanClass.getDeclaredFields();
       for(Field field1: fields){
           log.info(field1);
       }

       Method[] methods = loanClass.getDeclaredMethods();
       for (Method method2: methods){
           log.info(method2);
       }
    }
}
