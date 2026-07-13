package com.emexo.designpattern.abstractfactory1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class LoanFactory {
    private static final Map<String, Supplier<Loan>> loanMap = new HashMap<>();

    static {
        loanMap.put("home", HomeLoan::new);
        loanMap.put("car", CarLoan::new);
    }

    public static Loan getLoan(String type) {
        Supplier<Loan> loan = loanMap.get(type.toLowerCase());
        if (loan != null) {
            return loan.get();
        }
        throw new IllegalArgumentException("Invalid Loan Type: " + type);
    }
}