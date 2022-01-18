package com.company.hometaskthree;

public class elementsArrayReverseOrder {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        System.out.println("Original Array:");
        for (int j : arr) System.out.println(j);
        System.out.println("Array in reverse order:");
        for (int i = arr.length-1; i >= 0; i--) System.out.println(arr[i]);

    }
}
