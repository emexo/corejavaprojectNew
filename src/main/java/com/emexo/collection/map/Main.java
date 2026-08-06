package com.emexo.collection.map;

import lombok.extern.log4j.Log4j2;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map.Entry;

@Log4j2
public class Main {
    public static void main(String[] args) {


        Account account = new Account();
        account.setAccountNo(456);
        account.setAccountName("Gary");

        Account account1 = new Account();
        account1.setAccountNo(456);
        account1.setAccountName("Gary");

        Customer customer = new Customer();
        customer.setCustomerId("24234dsf");
        customer.setCustomerName("Gary");

        Customer customer1 = new Customer();
        customer1.setCustomerName("Natalia");
        customer1.setCustomerId("234523dsf");

        Map<Account, Customer> map = new HashMap<>();
        map.put(account, customer);
        map.put(account1, customer1);

        map.forEach((k, v) -> log.info("key:{} and value:{}", k, v));
    }

}
