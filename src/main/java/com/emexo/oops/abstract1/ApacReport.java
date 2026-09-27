package com.emexo.oops.abstract1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ApacReport extends Report{

    public ApacReport(String reportType, String regulatory) {
        super(reportType, regulatory);
    }

    @Override
    public void report() {
        log.info("Apac report");
        sendEmail("APAC");
    }
}
