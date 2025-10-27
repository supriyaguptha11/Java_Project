package collections;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

// for custom date or time we use of method
// for local date and time use now method

public class LaunchDate2 {
    public static void main(String[] args) {
       LocalDate date = LocalDate.now();
        System.out.println(date);
        int dayOfMonth = date.getDayOfMonth();
        int dayOfYear = date.getDayOfYear();
        System.out.println("Day of year is " + dayOfYear);

        int month = date.getMonthValue();
        int year = date.getYear();
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        System.out.println(dayOfWeek);

        System.out.println(dayOfMonth+" / " + month+" / " + year);



        // for DOB

      LocalDate dob = LocalDate.of(1999,8,11); // for custom date or time we use of method
        System.out.println(dob);
        System.out.println("***********************");

        LocalTime time = LocalTime.now();  // current time
        System.out.println(time);

       int hour= time.getHour();
       int minutes =time.getMinute();
       int second = time.getSecond();
       int nano= time.getNano();

        System.out.println(hour +" hour " + minutes +" minutes "+second+" seconds "+ nano+" nano sec ");
        System.out.println("**************************");

       LocalDateTime timedate=  LocalDateTime.now();
        System.out.println(timedate);


    }
}
