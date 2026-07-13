package com.emexo.string;


import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public final class CustomImmutable {
    private final String empName;
    private final Integer empId;
    private final Date date;
    private final Map<String, String> map;

    public CustomImmutable(String empName, Integer empId, Date date, Map<String, String> map) {
        this.empName = empName;
        this.empId = empId;
        this.date = new Date(date.getTime());
        this.map = Map.copyOf(map);
    }

    public String getEmpName() {
        return empName;
    }
    public Integer getEmpId() {
        return empId;
    }
    public Date getDate() {
        return new Date(date.getTime());
    }
    public Map<String, String> getMap() {
        return map;
    }
}
