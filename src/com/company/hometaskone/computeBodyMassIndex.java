package com.company.hometaskone;

import java.util.Scanner;

public class computeBodyMassIndex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final  int NUMBERTIMES = 703;

        System.out.print("Input weight in pounds: ");
        double weightPounds = scanner.nextInt();
        System.out.print("Input height in inches: ");
        double heightPounds = scanner.nextInt();
        double bodyMassIndex = (weightPounds / (heightPounds * heightPounds) ) * NUMBERTIMES ;

        System.out.println("Body Mass Index is " + bodyMassIndex);

        System.out.println("Bovsunivskyi");
        System.out.println("Date getting homework 30.12.2021 11:49");
        System.out.println("Date done homework 03.03.2022 15:57");

    }
}
