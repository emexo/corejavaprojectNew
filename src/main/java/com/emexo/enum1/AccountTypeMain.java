package com.emexo.enum1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class AccountTypeMain {
    public static void main(String[] args) {
       log.info(AccountType.CURRENT.getAccType());

      for ( AccountType acc: AccountType.values()){
          log.info(acc);
      }
    }
}
