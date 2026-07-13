package com.emexo.javafeatures.java8.datetime;

import lombok.extern.log4j.Log4j2;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@Log4j2
public class TestMain {
    public static void main(String[] args) {
        log.info(LocalDate.now());

        log.info(LocalDate.of(2026,05,21));
        log.info(LocalDate.parse("2026-04-26"));

        log.info(LocalDate.now().plusDays(1));
        log.info(LocalDate.now().plusMonths(1));
        log.info(LocalDate.now().plusYears(1));
        log.info(LocalDate.now().plus(1, ChronoUnit.MONTHS));

        log.info(LocalDate.now().minusDays(1));
        log.info(LocalDate.now().minusMonths(1));
        log.info(LocalDate.now().minus(1,ChronoUnit.DAYS));

        log.info(LocalDate.now().getDayOfWeek());
        log.info(LocalDate.now().getYear());
        log.info(LocalDate.now().getDayOfMonth());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        log.info(LocalDate.now().format(formatter));


        log.info(LocalTime.now());
        log.info(LocalTime.of(10,30, 53));
        log.info(LocalTime.parse("06:30"));
        log.info(LocalTime.now().plus(1, ChronoUnit.HOURS));
        log.info(LocalTime.now().plusHours(2));
        log.info(LocalTime.now().minusHours(1));
        log.info(LocalTime.now().minus(1, ChronoUnit.HOURS));
        log.info(LocalTime.now().getHour());

         log.info(LocalDateTime.now());
         log.info(LocalDateTime.of(2025, 05,01, 04, 05, 50));
         log.info(LocalDateTime.parse("2026-04-26T07:27:41.914783"));
         log.info(LocalDateTime.now().plus(2, ChronoUnit.DAYS));
         log.info(LocalDateTime.now().minus(1, ChronoUnit.DAYS));
         log.info(LocalDateTime.now().getDayOfWeek());

         log.info(ZonedDateTime.now(ZoneId.of("UTC")));
         log.info(ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
    }
}
