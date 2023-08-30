package api_annotation;

import java.time.LocalTime;

public class dtTm {
    public static void main(String[] args) {
        java.util.Date dt = new java.util.Date();
        // System.out.println(dt);

        // with using sql package
        long timeInMin = dt.getTime();
        java.sql.Date dt1 = new java.sql.Date(timeInMin);
        System.out.println("Date is \n" + dt1);

        LocalTime time = LocalTime.now();
        int hours = time.getHour();
        int min = time.getMinute();
        int sec = time.getSecond();

        System.out.println("\nTime is \n" + hours + " : " + min + " : " + sec);
    }

}
