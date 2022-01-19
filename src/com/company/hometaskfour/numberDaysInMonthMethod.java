package com.company.hometaskfour;

import java.util.Scanner;

public class numberDaysInMonthMethod {

    public static void main(String[] args) {

        numberDaysInMonth();

    }
    public  static void numberDaysInMonth(){
        Scanner scanner = new Scanner(System.in);
        String[] arrMonths = {
                "","January","February","March","April","May","June",
                "July","August","September","October","November","December"
        };
        int numberDayMonth = 0;
        System.out.print("Input a month number: ");
        int monthNumber = scanner.nextInt();
        System.out.print("Input a year: ");
        int year = scanner.nextInt();
        int leapYear = (year % 400 == 0 || year % 100 != 0) &&(year % 4 == 0) ? 29:28;
        if(monthNumber >= 1 && monthNumber <= 12 && year > 0 ) {
            if (monthNumber <= 7 && monthNumber != 2) {
                numberDayMonth = (monthNumber % 2 > 0) ? 31 : 30;
            }
            else if (monthNumber == 2) {
                numberDayMonth = leapYear;
            }
            else {
                numberDayMonth = (monthNumber % 2 > 0) ? 30 : 31;
            }
            System.out.println( arrMonths[monthNumber] + " " + year + " has " + numberDayMonth +  " days");
        }
        else {
            System.out.println("Error number month or year");
        }
    }
}
