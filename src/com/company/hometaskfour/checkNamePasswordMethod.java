package com.company.hometaskfour;

import java.util.Scanner;

public class checkNamePasswordMethod {

    public static void main(String[] args){

        int lengthPassword = 8;
        String passwordDB = "12345678";
        String nameDB = "Maksym";
        checkNamePasswordAndLength(lengthPassword,passwordDB,nameDB);
    }
    public static void checkNamePasswordAndLength(int lengthPassword, String passwordDB,String nameDB){
        Scanner scanner = new Scanner(System.in);
        int lengthPasswordLogin;
        String passwordLogin;
        String nameLogin;
        boolean checkNamePassword = false;
        do {
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
