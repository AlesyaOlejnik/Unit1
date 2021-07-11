package com.company;

import java.util.Scanner;

public class Unit1Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число a: ");
        int a =in.nextInt();
        System.out.println("Введите число b: ");
        int b =in.nextInt();
        if (a > b) {
            System.out.println("Большее a " + a);
        } else if (b > a) {
            System.out.println("Большее b " + b);
        } else {
            System.out.println("a = b");
        }
    }
}
