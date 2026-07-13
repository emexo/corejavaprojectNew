package com.emexo.scanner;

import java.util.Scanner;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;


@Log4j2
public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter(",");

        log.info(scanner.next());
        log.info(scanner.next());

    }

}
