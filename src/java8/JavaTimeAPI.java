package java8;

import java.time.LocalDate;
import java.time.Month;

public class JavaTimeAPI {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Current Date = " +today);


        LocalDate firstDay_2020 = LocalDate.of(2020, Month.AUGUST, 1);
        System.out.println("Specific Date="+firstDay_2020);

    }
}
