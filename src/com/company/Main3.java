package com.company;

public class Main3 {
    public static void main(String[] args) {
        int countRows = 5;
        for (int i = 1; i <= countRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
