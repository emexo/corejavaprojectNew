package com.emexo.refelection;

import lombok.extern.log4j.Log4j2;

import java.lang.reflect.Field;

@Log4j2
public class AccountMain {
    public static void main(String[] args) throws Exception {

        Account account = new Account();
        Class accountClass = account.getClass();

      Field field1 =  accountClass.getDeclaredField("accountNumber");
      field1.setAccessible(true);

      field1.set(account, 12);

      log.info(field1.get(account));

    }
}
