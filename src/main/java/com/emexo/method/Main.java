package com.emexo.method;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Main {
    static void main() {
        Account account = new Account();
        var res = account.getBankName("HDFC");
        log.info(res);
        account.getBankName();
    }
}
