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

        Account account1= new Account();
        account1.setAccountNo(566);
        account1.setAccountName("Natalia");

        Customer customer = new Customer();
        customer.setCustomerId("24234dsf");
        customer.setCustomerName("Gary");

        Customer customer1 = new Customer();
        customer1.setCustomerName("Natalia");
        customer1.setCustomerId("234523dsf");

        Map<Account, Customer> map = new HashMap<>();
        map.put(account, customer);
        map.put(account1, customer1);

        // sort map by Customer name (value) and preserve order in a LinkedHashMap
        List<Entry<Account, Customer>> entries = new ArrayList<>(map.entrySet());
        entries.sort(Comparator.comparing(e -> e.getValue().getCustomerName()));

        Map<Account, Customer> sortedByValue = new LinkedHashMap<>();
        for (Entry<Account, Customer> e : entries) {
            sortedByValue.put(e.getKey(), e.getValue());
        }

        // print sorted map
        sortedByValue.forEach((acc, cus) -> log.info("Account:{} and customer:{}", acc, cus));
    }
}
