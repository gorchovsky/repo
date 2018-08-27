package com.gorchovsky;

public class Main {

    public static void main(String[] args) {
        System.out.println(printYearsAndDays(525600));
        System.out.println(printYearsAndDays(1051200));
        System.out.println(printYearsAndDays(561600));
        System.out.println(printYearsAndDays(-525600));
        System.out.println(printYearsAndDays(0));
    }

    public static String printYearsAndDays(long minutes) {
        if(minutes < 0) {
            System.out.println("Invalid Value");
        }

        long hour = minutes / 60;
        long day = hour / 24;
        long year = day / 365;


        String yearString = year + " y";
        if(day % 365 == 0) {
            day = 0;
        } else {
            day = day - 365;
        }
        return minutes + " min = " + yearString + " " + day + " d";
    }


}
