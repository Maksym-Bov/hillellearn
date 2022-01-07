package com.company.hometasktwo;

import java.util.Scanner;

public class checkDayOrEvening {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 1;) {
            System.out.print("Input hour: ");
            int hour = scanner.nextInt();
            if (hour < 24 && hour > 0) {

                String textHour = (hour > 18) ? "Good evening." : "Good day.";
                System.out.println(textHour);
                i++;
            } else {

                System.out.println("Error hour, input valid hour from 1 to 24.");
            }
        }
    }
}
