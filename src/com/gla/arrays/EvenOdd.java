package com.gla.arrays;

import java.util.Scanner;

public class EvenOdd {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (int index = 0; index < arr.length; index++) {
            System.out.print(index + " indexed number: ");
            if(arr[index] == 0){
                System.out.println("Zero");
            }
            else if(arr[index] > 0){
                System.out.println("Positive");
                if(arr[index] % 2 == 0){
                    System.out.println("And it's Even");
                }
                else{
                    System.out.println("And it's odd.");
                }
            }
            else{
                System.out.println("Negative");
            }
        }

        if(arr[0] == arr[arr.length-1]){
            System.out.println("First and last elements are equal");
        }
        else{
            System.out.println("They're not equal.12 ");
        }
    }
}
