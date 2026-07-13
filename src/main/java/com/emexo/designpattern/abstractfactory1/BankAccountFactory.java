package com.emexo.designpattern.abstractfactory1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class BankAccountFactory {
    private static final Map<String, Supplier<BankAccount>> accountMap = new HashMap<>();

    static {
        accountMap.put("savings", SavingsAccount::new);
        accountMap.put("current", CurrentAccount::new);
    }

    public static BankAccount getAccount(String type) {
        Supplier<BankAccount> account = accountMap.get(type.toLowerCase());
        if (account != null) {
            return account.get();
        }
        throw new IllegalArgumentException("Invalid Account Type: " + type);
    }
}