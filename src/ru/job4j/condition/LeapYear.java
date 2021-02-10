package ru.job4j.condition;

public class LeapYear {
    public static boolean checkYear(int year) {
        boolean rsl = false;
        if (year % 400 == 0) {
            rsl = true;
        } else if (year % 100 == 0) {
            rsl = false;
        } else if (year % 4 == 0) {
            rsl = true;
        }
        return rsl;
    }
}