package com.emexo.method;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Account {
   public  void getBankName(){
       String bankName = "SBI";
       log.info("Bank name:{}", bankName);
   }

   public  String getBankName(String name){
       return name;
   }


    static void main() {
        Account account = new Account();
        account.getBankName();
        log.info(account.getBankName("sss"));
    }
}
