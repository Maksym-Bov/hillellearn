package com.company.hometasktwo;

import java.util.Scanner;

public class checkNamePassword {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int lengthPassword = 8;
        String passwordDB = "12345678";
        String nameDB = "Maksym";
        int lengthPasswordLogin;
        String passwordLogin;
        String nameLogin;
        boolean checkNamePassword = false;
        do  {
            System.out.println("Enter your name: ");
            nameLogin = scanner.next();
            System.out.println("Enter your password: ");
            passwordLogin = scanner.next();
            lengthPasswordLogin = passwordLogin.length();
            if (lengthPassword < lengthPasswordLogin){

                System.out.println("Error length password");
            }
            else {

                if(nameDB.equals(nameLogin)  &&  passwordDB.equals(passwordLogin) ){

                    checkNamePassword = false;
                    System.out.println("Log in");
                }
                else {
                    checkNamePassword = true;
                    System.out.println("Error password or name");
                }
            }

        } while (lengthPassword < lengthPasswordLogin || checkNamePassword);


    }
}
