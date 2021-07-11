package com.company;

public class Unit1Task5 {
    public static void main(String[] args) {
        int a = 8;
        int b = -9;
        int c = 9;
        int plusCounter = 0;
        int minusCounter = 0;
        if (a > 0) {
            plusCounter++;

        }
        if (a < 0) {
            minusCounter++;
        }
        if (b > 0) {
            plusCounter++;
        }
        if (b < 0) {
            minusCounter++;
        }
        if (c > 0) {
            plusCounter++;
        }
        if (c < 0) {
            minusCounter++;
        }
        System.out.println("Количество положительных " + plusCounter);
        System.out.println("Количество отрицательных " + minusCounter);
    }
}
