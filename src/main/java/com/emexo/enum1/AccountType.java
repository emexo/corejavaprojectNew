package com.emexo.enum1;

public enum AccountType {
    SAVING("saving account"), CURRENT("Current account"),LOAN("Loan account");

    private String accType;

    AccountType(String accType){
        this.accType = accType;
    }

    public String getAccType(){
        return this.accType;
    }
}
