package com.company;

public class Unit1Task0 {

    public static void main(String[] args) {
        int day = 2;
        int month = 8;
        //Операции арифметические
        System.out.println("month + day = " + (month + day));
        System.out.println("month - day = " + (month - day));
        System.out.println("month * day = " + (month * day));
        System.out.println("month / day = " + (month / day));
        System.out.println("month % day = " + (month % day));
        // Операции инкремантации и декрементации
        System.out.println("month++ = " + (month++));
        System.out.println("++month = " + (++month));
        System.out.println("--month = " + (--month));
        System.out.println("month-- = " + (month--));
        // Операции с присваиванием
        System.out.println("month %= day = " + (month %= day));
        System.out.println("month += day = " + (month += day));
        System.out.println("month *= day = " + (month *= day));
        System.out.println("month -= day = " + (month -= day));
        System.out.println("month /= day = " + (month /= day));

        //Операции битовые
        System.out.println("month | day = " + (month | day));
        System.out.println("month & day = " + (month & day));
        System.out.println("month ^ day = " + (month ^ day));
        System.out.println("~ month  = " + (~month));
        System.out.println("month >> day = " + (month >> day));
        System.out.println("month >>> day = " + (month >>> day));
        System.out.println("month << day = " + (month << day));
        System.out.println("month |= day = " + (month |= day));
        System.out.println("month &= day = " + (month &= day));
        System.out.println("month <<= day = " + (month <<= day));
        System.out.println("month >>= day = " + (month >>= day));
        System.out.println("month >>>= day = " + (month >>>= day));
        System.out.println("month ^= day = " + (month ^= day));
        //Операторы сравнения
        System.out.println("month < day = " + (month < day));
        System.out.println("month > day = " + (month > day));
        System.out.println("month == day = " + (month == day));
        System.out.println("month <= day = " + (month <= day));
        System.out.println("month >= day = " + (month >= day));
        System.out.println("month != day = " + (month != day));
        //Логические операции
        System.out.println("month >= 6 && month <= 8 || !(month == 9 && day == 14) = "+(month >= 6 && month <= 8 || !(month == 9 && day == 14) ));
    }
}
