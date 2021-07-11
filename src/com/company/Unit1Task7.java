package com.company;

public class Unit1Task7 {
    public static void main(String[] args) {
        int programmerCount = 10006;
        int lastDigit = programmerCount % 10;
        if (lastDigit == 1 && programmerCount != 11) {
            System.out.println(programmerCount + " программист");
        } else if (lastDigit >= 2 && lastDigit <= 4) {
            System.out.println(programmerCount + " программиста");
        } else {
            System.out.println(programmerCount + " программистов");
        }

    }
}
