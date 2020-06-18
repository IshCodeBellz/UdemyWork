package com.company;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class App {

    public static void main(String[] args) {


        // year month day format for date
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        ld = LocalDate.parse("2019-01-01");
        System.out.println(ld);

        ld = LocalDate.parse("02/07/2019", DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        System.out.println(ld);

        String isoDate = ld.toString();
        System.out.println(isoDate);
        ld = LocalDate.parse(isoDate);
        System.out.println(ld);

        //month day year formatt
        String formatted = ld.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"));
        System.out.println(formatted);

        //day month year format

        formatted = ld.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println(formatted);

        formatted = ld.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(formatted);

        formatted = ld.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println(formatted);

        formatted = ld.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(formatted);

        LocalDate past = ld.minusDays(8);
        formatted = past.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(formatted);

        past = ld.minusMonths(3);
        formatted = past.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(formatted);

        Period diff = ld.until(past);
        System.out.println(diff);

    }
}
