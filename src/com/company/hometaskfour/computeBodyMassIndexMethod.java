package com.company.hometaskfour;

import java.util.Scanner;

public class computeBodyMassIndexMethod {

    public static void main(String[] args) {

        bodyMassIndex();
    }
    public  static  void  bodyMassIndex(){
        Scanner scanner = new Scanner(System.in);
        final  int NUMBERTIMES = 703;
        System.out.print("Input weight in pounds: ");
        double weightPounds = scanner.nextInt();
        System.out.print("Input height in inches: ");
        double heightPounds = scanner.nextInt();
        double bodyMassIndex = (weightPounds / (heightPounds * heightPounds) ) * NUMBERTIMES ;
        System.out.println("Body Mass Index is " + bodyMassIndex);
    }
}
