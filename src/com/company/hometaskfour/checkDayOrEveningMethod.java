package com.company.hometaskfour;

import java.util.Scanner;

public class checkDayOrEveningMethod {

    public static void main(String[] args) {

        dayOrEvening();
    }

    public static void dayOrEvening() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input hour: ");
        int hour = scanner.nextInt();
        String textMessage = ( hour >= 18 && hour <= 24 ) ? "Good evening"
                :(hour > 0 && hour < 18 ) ? "Good day" : "Error hour, input valid hour from 1 to 24.";
        System.out.println(textMessage);
    }
}