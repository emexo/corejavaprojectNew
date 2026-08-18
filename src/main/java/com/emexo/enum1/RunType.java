package com.emexo.enum1;

public enum RunType {
    EOD("End of day"), EOW("End of week"), EOM ("End of Month");

    private String runType;

    RunType(String type){
        this.runType = type;
    }

    public String getRunType(){
        return runType;
    }
}
