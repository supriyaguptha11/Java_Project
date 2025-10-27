package collections;
// to manage Date , we have date class available
// time package - present inside util package and sql package
// util package - for regular operations
// SQL package  - jdbc operations

//import java.util.Date;

import java.sql.Date;

public class LaunchDate1 {
    public static void main(String[] args) {
        // Date --> inside util , sql packages
        // util - for normal operations
        // sql -  for jdbc operations
        // from java 8 -- joda api came --> new date time api -->inside time package
        // old in util and sql

//        Date date = new Date(); // Date class of util package will return both current date and time
//        System.out.println(date);
//
//        int year = date.getYear();
//        System.out.println(year);
//
//        long timeInMs = date.getTime();
//        System.out.println(timeInMs);

        // in sql
        long timeInMs = 1761597250889L;
        Date date = new Date(timeInMs);
        System.out.println(date); // return only date


    }
}
