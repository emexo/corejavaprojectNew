package com.emexo.oops.abstract1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public abstract class Report {
    public static final String BANK_NAME = "JPMC";

    private String reportType;
    public String regulatory;

    public Report(String reportType, String regulatory){
        this.reportType = reportType;
        this.regulatory = regulatory;
    }

    public abstract void report();

    public void sendEmail(String report){
        log.info("sending an email:{}", report);
    }
}
