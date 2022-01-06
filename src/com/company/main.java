package com.company;
import java.util.Scanner;


public class main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input day ");
        int DayNumber = scanner.nextInt();
        //int hour = scanner.nextInt();
        /*
        String textHour =  (hour > 18) ? "Good evening"  : "Good day" ;

        System.out.println(textHour);

        if(hour < 24 && hour > 0){
        if (hour > 18) {
            System.out.println("Good evening");

        }
        else if (hour > 10) {

            System.out.println("Good morning");

        }
        else {
            System.out.println("Good day");
        }
       }
        else {
            System.out.println("error" + hour + "is not more 24 hour");
        }*/
        switch (DayNumber){
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error day");
        }


    }


}