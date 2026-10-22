package com.emexo.conditionalstatement;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConditionalStatement {

    public static final String REGION_APAC = "APAC";
    public static final String REGION_EMEA = "EMEA";

    static void main() {
        ConditionalStatement statement = new ConditionalStatement();
        statement.getReport("NA");
    }

   public void getReport(String region){
       if(REGION_APAC.equals(region)) {
           log.info("APAC Report");
       } else if (REGION_EMEA.equals(region)) {
           log.info("EMEA Region");
       } else {
           log.info("Invalid Region");
       }
   }
}
