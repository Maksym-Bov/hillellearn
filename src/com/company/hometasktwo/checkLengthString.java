package com.company.hometasktwo;

import java.util.Scanner;

public class checkLengthString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int lengthText = 8;
        int lengthInputText;
        String text;
        do  {
            System.out.println("Input text: ");
            text = scanner.next();
            lengthInputText = text.length();
            if (lengthText < lengthInputText) System.out.println("Error length text");

        } while (lengthText < lengthInputText);


    }
}
