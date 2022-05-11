package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int currentJumpLength = 0;
        int currentPersonNumber = 0;
        int totalSum = 0;
        int totalCount = 0;
        double result = 0;

        do {
            currentPersonNumber++;
            System.out.print("input person #" + currentPersonNumber + " jump: ");
            currentJumpLength = scanner.nextInt();

            if (currentJumpLength != -1) {
                totalSum += currentJumpLength;
                totalCount++;
            }

        } while (currentJumpLength != -1);

        result = totalSum / (double) totalCount;

        System.out.println("avg  Jump Length = " + result);
    }
}
