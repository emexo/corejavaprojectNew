package com.emexo.serialization;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Getter
@Setter
public class Account implements Serializable {
    private static final long serialVersionUID = 3452345345L;

    public static final String BANK_NAME = "SBI";

    private  int accountNo;
    private transient String accountName;
}
