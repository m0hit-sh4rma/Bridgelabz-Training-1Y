package com.gla.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplicationFrom6TO9 {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = in.nextInt();

        int[] arr = new int[4];
        int a = 0;

        for (int i = 6; i <= 9; i++) {
            arr[a] = n * i;
            a++;
            System.out.println(n + " * " + i + " = " + n*i);
        }

        System.out.println(Arrays.toString(arr));
    }
}
