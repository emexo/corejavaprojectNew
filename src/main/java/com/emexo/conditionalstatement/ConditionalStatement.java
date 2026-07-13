package com.emexo.conditionalstatement;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConditionalStatement {

    public static void main() {

        ConditionalStatement conditionalStatement = new ConditionalStatement();
        conditionalStatement.transfer(1234567890L, 9876543210L, 1000.00);
    }

    public void transfer(long fromAccount, long toAccount, double amount){
        double balance = 500.00; // Assume this is the balance of the fromAccount

        if(balance>= amount) {
            log.info("Money has been transferred from account {} to account {} with amount {}", fromAccount, toAccount, amount);
        } else {
            log.info("Insufficient balance in account {} to transfer amount {}", fromAccount, amount);
        }
    }

    public void transfer1(long fromAccount, long toAccount, double amount){
        double balance = 500.00; // Assume this is the balance of the fromAccount

        if(balance< amount) {
            log.info("Insufficient balance in account {} to transfer amount {}", fromAccount, amount);

        } else if(balance == amount){
            log.info("Exact balance matched for account {} to transfer amount {}", fromAccount, amount);
        }
        else {
            log.info("Money has been transferred from account {} to account {} with amount {}", fromAccount, toAccount, amount);
        }
    }
}
