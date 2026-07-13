package com.emexo.enum1;

public enum Region {
    APAC("apac"), EMEA("emea"), NA("na");

    private String region;

    Region(String region){
        this.region = region;
    }

    public String getRegion(){
        return region;
    }
}
