package com.company;

import java.util.Scanner;

public class ConvectorInchMeter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final double CHONEMETER = 0.0254;

        System.out.println("Please, Input a value for inch:");
        double inch = scanner.nextDouble();
        double resultConvector = inch * CHONEMETER;
        String  nameMeter = "meters";
        if(resultConvector <= 1) nameMeter = "meter";
        System.out.println(inch + " inch is " + resultConvector + " " + nameMeter);

        System.out.println("Bovsunivskyi");
        System.out.println("Date getting homework 30.12.2021 11:49");
        System.out.println("Date done homework 03.03.2022 15:57");

    }
}
