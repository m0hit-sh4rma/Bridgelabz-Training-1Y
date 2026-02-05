package com.gla.arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StudentOver18 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];

        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }

        for (int index = 0; index < arr.length; index++) {
            System.out.println((index) + "indexed student can vote or not? ....");
            if(arr[index] >= 18){
                System.out.println("Yes");
            }
            else if(arr[index] < 18){
                System.out.println("No");
            }
            else{
                System.out.println("Invalid age entered.");
            }
        }
    }
}
