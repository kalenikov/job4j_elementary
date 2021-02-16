package ru.job4j.array;


public class Divider {
    public static boolean check(int num, int[] ints) {
        for (int n : ints) {
            if (n % num != 0) return false;
        }
        return true;
    }
}