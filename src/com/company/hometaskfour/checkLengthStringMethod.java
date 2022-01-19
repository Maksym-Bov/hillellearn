package com.company.hometaskfour;

import java.util.Scanner;

public class checkLengthStringMethod {

    public static void main(String[] args) {

        int lengthText = 8;
        checkLengthString(lengthText);
    }
    public  static  void  checkLengthString (int lengthText){
        Scanner scanner = new Scanner(System.in);
        int lengthInputText;
        do  {
            System.out.println("Input text: ");
            String text = scanner.next();
            lengthInputText = text.length();
            if (lengthText < lengthInputText) System.out.println("Error length text");

        } while (lengthText < lengthInputText);
    }
}
