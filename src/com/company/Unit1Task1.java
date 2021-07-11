package com.company;

public class Unit1Task1 {
    public static void main(String[] args) {
        int a =0;
        if (a < 0) {
            System.out.print("Это отрицательное ");
        } else if (a > 0) {
            System.out.print("Это положительное ");
        } else {
            System.out.print("Это ноль ");
        }
        if ((a > 99 && a < 1000) || (a < -99 && a > -1000)){
            System.out.println("трехзначное число");
        } else if ((a > 9 && a < 100) || (a < -9 && a > -100)){
            System.out.println("двузначное число");
        } else {
            System.out.println("однозначное число");
        }

    }
}
