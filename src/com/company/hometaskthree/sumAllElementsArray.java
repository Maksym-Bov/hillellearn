package com.company.hometaskthree;

public class sumAllElementsArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        int sum = 0;
        for (int i : arr) sum = sum + i;
        System.out.println("Sum of all the elements of an array:");
        System.out.println(sum);
    }
}
