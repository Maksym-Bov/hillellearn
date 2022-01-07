package com.company.hometasktwo;

import java.util.Scanner;

public class checkDayOrMorningOrEvening {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 1;) {
            System.out.print("Input hour: ");
            int hour = scanner.nextInt();
            if (hour <= 24 && hour > 0) {
                if (hour > 18) {

                    System.out.println("Good evening");
                }
                else if (hour < 10) {

                    System.out.println("Good morning");
                }
                else {

                    System.out.println("Good day");
                }
                i++;
            }
            else {

                System.out.println("Error hour, input valid hour from 1 to 24.");
            }
        }
    }
}
