package com.gla.arrays;

import java.util.Scanner;

public class MeanHeightOfPlayers {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double[] height = new double[11];

        System.out.println("Enter players' height in cms: ");
        for (int i = 0; i < height.length; i++) {
            height[i] = in.nextDouble();
        }

        double mean = 0;

        for (int i = 0; i < height.length; i++) {
            mean += (height[i]/11);
        }

        System.out.println(mean);
    }
}
