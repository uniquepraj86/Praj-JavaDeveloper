package java8;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Date;

public class JavaTimeAPI {
    public static void main(String[] args) {
        System.out.println("Date");
        Date date = new Date();
        System.out.println(date);


        System.out.println("*************************");


        System.out.println("LocalDate");
        LocalDate today = LocalDate.now();
        System.out.println("Current Date = " +today);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println(dateTimeFormatter.format(today));

        LocalDate firstDay_2020 = LocalDate.of(2020, Month.AUGUST, 1);
        System.out.println("Specific Date="+firstDay_2020);
        System.out.println("******************************");

        System.out.println(today.getDayOfWeek());
        System.out.println(today.getDayOfMonth());
        System.out.println(today.atStartOfDay());


        System.out.println("******************************");

        ZoneId zoneId = ZoneId.of("Asia/Dhaka");

        LocalDate localDate = LocalDate.now(zoneId);
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);


        System.out.println("*************************");


    }
}
