package com.emexo.method;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {
    static void main() {
        var res = Account.getBankName("AXIS");
        log.info(res);

        Account.getBankName();
    }
}
