package com.emexo.serialization;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Externalizable;
import java.io.Serializable;

@ToString
@Getter
@Setter
public class Employee implements Serializable {
    private static final long serialVersionUID = 3242353245345L;

    public static final String ORG_NAME = "Intel";

    private int empId;
    private String empName;
    private transient String address;
    private int mob;
}
