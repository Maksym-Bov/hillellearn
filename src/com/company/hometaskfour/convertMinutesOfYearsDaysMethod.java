package com.company.hometaskfour;

import java.util.Scanner;

public class convertMinutesOfYearsDaysMethod {

    public static void main(String[] args) {
        convertMinutesOfYearsDays();
    }
    public  static  void  convertMinutesOfYearsDays(){
        Scanner scanner = new Scanner(System.in);
        final int MINUTESOFHOUR = 60;
        final int HOUROFDAY = 24;
        final int DAYOFYEAR = 365;
        System.out.println("Input the number of minutes: ");
        int minuteNumber = scanner.nextInt();
        int minuteOfDay = MINUTESOFHOUR * HOUROFDAY;
        int minuteOfYear = minuteOfDay * DAYOFYEAR;
        int resultMinutesOfYears = minuteNumber / minuteOfYear;
        int resultMinutesOfDays = (minuteNumber % minuteOfYear) / minuteOfDay;
        System.out.print(minuteNumber + " minutes is approximately " + resultMinutesOfYears +" years and ");
        System.out.println(resultMinutesOfDays + " days");
    }
}
