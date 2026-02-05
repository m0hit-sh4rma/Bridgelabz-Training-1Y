package com.gla.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimenArrayToSingleDimenArray {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = in.nextInt();

        int[][] arr = new int[rows][columns];

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }

        int[] array = new int[rows*columns];
        int index = 0;

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                array[index] = arr[row][col];
                index++;
            }
        }

        System.out.println("Elements in 1D array: " + Arrays.toString(array));
    }
}
