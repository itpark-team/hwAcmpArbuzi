package com.company;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите символ:");
        char z = scan.next().charAt(0);

        System.out.println("Указать ширину прямоугольника:");
        int a = scan.nextInt();
        System.out.println("Указать высоту прямоугольника:");
        int b = scan.nextInt();

        for (int i = 0; i < b; i++) {
            for (int j = 1; j < a; j++) {
                System.out.print(z);
            }
            System.out.println(z);
        }
    }
}

