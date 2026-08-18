package com.emexo.enum1;

import lombok.Getter;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Getter
public class Main {
    private static final Logger log = LogManager.getLogger(Main.class);

    static void main() {
        Report report = new Report();
        report.setRegion("APAC");
        report.setRunType(RunType.EOD);


        log.info(report);
    }
}
