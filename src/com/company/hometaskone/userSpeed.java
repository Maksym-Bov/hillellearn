package com.company.hometaskone;

import java.util.Scanner;

public class userSpeed {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final  double SECONDMINUTE = 60;
        final double MINITEHOUR = 60;

        System.out.println("Input distance in meters: ");
        double distanceMeters = scanner.nextDouble();
        System.out.println("Input hour: ");
        double hour = scanner.nextDouble();
        System.out.println("Input minutes: ");
        double minute = scanner.nextDouble();
        System.out.println("Input seconds: ");
        double second = scanner.nextDouble();

        double convertMinutetoSecond = minute * SECONDMINUTE;
        double convertHourtoSecond = hour * MINITEHOUR * SECONDMINUTE;
        double time = convertMinutetoSecond + convertHourtoSecond + second;
        double scale = Math.pow(10, 8);
        double speedMetersSecond = Math.ceil((distanceMeters / time) * scale) / scale;
        double speedKilometrHour = Math.ceil(((distanceMeters / 1000) / (time / 3600)) * scale) / scale;

        System.out.println("Your speed in meters/second is " + speedMetersSecond);
        System.out.println("Your speed in km/h is " + speedKilometrHour);

        System.out.println("Bovsunivskyi");
        System.out.println("Date getting homework 30.12.2021 11:49");
        System.out.println("Date done homework 03.03.2022 15:57");



    }

}
