package com.company;

public class Unit1Task2 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 10;
        if ((a > b + c) || (b > a + c) || (c > a+ b)){
            System.out.println("Треугольника с такими сторонами не существует");
        }else
            System.out.println("Треугольник существует");
    }
}
