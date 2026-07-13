package com.emexo.conditionalstatement;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class SwitchCase {
    public static void main(String[] args) {
        SwitchCase switchCase = new SwitchCase();
        switchCase.generateRegulatoryReport("APAC");
        switchCase.generateRegulatoryReport("EMEA");
        switchCase.generateRegulatoryReport("NA");
        switchCase.generateRegulatoryReport("LATAM");

    }

    public void generateRegulatoryReport(String region) {
        switch (region){
            case "APAC":
                log.info("Generating regulatory report for APAC region");
                break;
            case "EMEA":
                log.info("Generating regulatory report for EMEA region");
                break;
            case "NA": 
            case "LATAM":
                log.info("Generating regulatory report for North America region");
                break;
            default:
                log.info("Region not supported for regulatory report generation");
                break;
        }
    }
    
    public int calculateInterestRate(String loanType){
        int interestRate;
        switch (loanType){
            case "Home Loan":
                interestRate = 6;
                break;
            case "Car Loan":
                interestRate = 8;
                break;
            case "Personal Loan":
                interestRate = 10;
                break;
            default:
                interestRate = 12;
                break;
        }
        return interestRate;
    }
    
    public int calculateInterestRateWithLambda(String loanType){
        return switch(loanType) {
            case "Home Loan" -> 6;
            case "Car Loan" -> 8;
            case "Personal Loan" -> {
                print();
                int interestRate = personalLoanInterestRate();
                yield interestRate;
            }
            default -> 12;
        };
        
    }
    
    
    public int personalLoanInterestRate(){
        return 10;
    }

    public void print(){
        log.info("Calculating interest rate for Personal Loan");
    }
}
