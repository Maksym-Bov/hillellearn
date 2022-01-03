package com.company;

import java.util.Scanner;

public class ConvertMinutesOfYearsDays {

    public static void main(String[] args) {

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

        System.out.println("Bovsunivskyi");
        System.out.println("Date getting homework 30.12.2021 11:49");
        System.out.println("Date done homework 03.03.2022 15:57");

    }
}
