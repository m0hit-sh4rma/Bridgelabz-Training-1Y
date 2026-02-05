package com.gla.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Factors {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int count = 0;

        for (int i = 1; i <= num; i++) {
            if(num % i == 0){
                count++;
            }
        }

        int[] factors = new int[count];
        int a = 0;

        for (int i = 1; i <= num; i++) {
            if(num % i == 0){
                factors[a] = i;
                a++;
            }
        }

        System.out.println(Arrays.toString(factors));
    }
}
