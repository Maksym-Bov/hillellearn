package com.company.hometaskone;
import java.util.Scanner;


public class randomNumberLimit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i =2; i > 1;){

            System.out.println("Please, input upper limit ");
            int upperLimit = scanner.nextInt();
            System.out.println("Please, input lower limit ");
            int lowerLimit = scanner.nextInt();
            if (upperLimit < lowerLimit) System.out.println("Error, Should upperLimit < lowerLimit, repeat please input");
            else {
                i = i - 1;
                int randomNumberLimit = lowerLimit + (int)(Math.random() * (upperLimit - lowerLimit)) ;
                System.out.println("Random number : " + randomNumberLimit);

                System.out.println("Bovsunivskyi");
                System.out.println("Date getting homework 30.12.2021 11:49");
                System.out.println("Date done homework 03.03.2022 15:57");
            }
        }

    }

}
