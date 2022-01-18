package com.company.hometaskfour;
import java.util.Scanner;


public class randomNumberLimitMethod {

    public static void main(String[] args) {

        randomNumberLimit();
    }
    public  static  void randomNumberLimit(){
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
            }
        }
    }

}
