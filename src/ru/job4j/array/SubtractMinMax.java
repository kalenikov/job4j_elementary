package ru.job4j.array;

public class SubtractMinMax {
    public static int calculate(int[] ints) {
        int max = 0;
        int min = 9999;
        for (int n : ints) {
            min = Math.min(n, min);
            max = Math.max(n, max);
        }
        return max - min;
    }
}
