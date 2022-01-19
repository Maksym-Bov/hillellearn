package com.company.hometaskfour;

import java.util.Scanner;

public class checkDayOrMorningOrEveningMethod {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input hour: ");
        int hour = scanner.nextInt();
        checkDayOrMorningOrEvening(hour);
    }
    public static void  checkDayOrMorningOrEvening(int hour){
            String textMessage = ( hour > 18 && hour <= 24 ) ? "Good evening"
                    : (hour > 0 && hour < 10) ? "Good morning"
                    :(hour > 10 && hour < 18 ) ? "Good day"
                    : "Error hour, input valid hour from 1 to 24." ;
            System.out.println(textMessage);
        }
}
