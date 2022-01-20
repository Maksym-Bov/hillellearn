package com.company;
import java.util.Scanner;


public class main {

    public static void main(String args[]) {
        String str = "S[AM HARRIS]";
        str = str.toUpperCase();

        String []  arrstr = str.split(" ");
        System.out.print(arrstr[0].substring(0,1) + "." + arrstr[1].substring(0,1) + "." );
    }
}



