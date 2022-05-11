package com.company;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countWatermelons = 0;
        int currentWeight = 0;
        int minWeight = 0;
        int maxWeight = 0;

        System.out.print("input count watermelons: ");
        countWatermelons = scanner.nextInt();

        for (int i = 0; i < countWatermelons; i++) {
            System.out.print("input weigh watermelon #" + (i + 1)+" ");
            currentWeight = scanner.nextInt();

            if (i == 0) {
                minWeight = currentWeight;
                maxWeight = currentWeight;
            } else {
                if (currentWeight > maxWeight) {
                    maxWeight = currentWeight;
                }
                if (currentWeight < minWeight) {
                    minWeight = currentWeight;
                }
            }
        }

        System.out.println("max = " + maxWeight + " min = " + minWeight);
    }
}
