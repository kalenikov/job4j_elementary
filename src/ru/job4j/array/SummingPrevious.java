package ru.job4j.array;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] rsl = new int[n];
        rsl[0] = a;
        rsl[1] = b;
        rsl[2] = a + b;
        int sum = rsl[2] ;
        for (int i = 3; i < n; i++) {
            sum += rsl[i - 1];
            rsl[i] = sum;
        }
        return rsl;
    }
}