package com.company.hometaskfour;

import java.util.Scanner;

public class convectorInchMeterMethod {

    public static void main(String[] args) {

        convectorInchMeter();
    }
    public static void  convectorInchMeter (){
        Scanner scanner = new Scanner(System.in);
        final double CHONEMETER = 0.0254;
        System.out.print("Please, Input a value for inch:");
        double inch = scanner.nextDouble();
        double resultConvector = inch * CHONEMETER;
        String  nameMeter = "meters";
        if(resultConvector <= 1) nameMeter = "meter";
        System.out.println(inch + " inch is " + resultConvector + " " + nameMeter);
    }
}
