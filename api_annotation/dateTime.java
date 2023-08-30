package api_annotation;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

public class dateTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        // System.out.println(date);
        int day = date.getDayOfMonth();
        int month = date.getMonthValue();
        int year = date.getYear();

        System.out.println(day + " / " + month + " / " + year);

        // LocalTime time = LocalTime.now();
        // int hours = time.getHour();
        // int min = time.getMinute();
        // int sec = time.getSecond();

        // System.out.println(hours + " : " + min + " : " + sec);
    }
}
