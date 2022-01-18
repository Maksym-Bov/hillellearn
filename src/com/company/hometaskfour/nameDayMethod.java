package com.company.hometaskfour;

import java.util.Scanner;

public class nameDayMethod {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day ");
        int dayNumber = scanner.nextInt();
        nameDay(dayNumber);
    }
    public static  void  nameDay (int dayNumber){
        String nameDay = "null";
        switch (dayNumber){
            case 1 :
                nameDay = "Monday";
                break;
            case 2 :
                nameDay = "Tuesday";
                break;
            case 3 :
                nameDay = "Wednesday";
                break;
            case 4 :
                nameDay = "Thursday";
                break;
            case 5 :
                nameDay = "Friday";
                break;
            case 6 :
                nameDay = "Saturday";
                break;
            case 7 :
                nameDay = "Sunday";
                break;
            default:
                System.out.println("Error number day " + dayNumber + " input valid number from 1 to 7");
        }
        if (!nameDay.equals("null"))System.out.println(nameDay);
    }
}
