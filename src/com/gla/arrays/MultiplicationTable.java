package com.gla.arrays;

import java.util.Scanner;

public class MultiplicationTable {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        int[] arr = new int[10];

        for(int i=1; i<=10; i++){
            arr[i-1] = n * i;
        }

        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
    }
}
