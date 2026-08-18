package com.emexo.enum1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Report {
    private RunType runType;
    public String region;
}
