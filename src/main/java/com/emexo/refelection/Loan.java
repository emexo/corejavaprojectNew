package com.emexo.refelection;

public class Loan {
    private int loanId;
    public String customerName;

    public Loan(int loanId, String customerName) {
        this.loanId = loanId;
        this.customerName = customerName;
    }


    private int getLoanId(int id){
        return id;
    }

    public String getCustomerName(String custName){
        return custName;
    }
}
