package com.emexo.enum1;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {
    public static void main(String[] args) {
       log.info(Region.APAC);
       log.info(Region.APAC.getRegion());

       for (Region region: Region.values()){
           log.info(region);
       }
    }
}
