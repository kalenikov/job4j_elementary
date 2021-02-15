package ru.job4j.array;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int[] rsl = new int[data.length];
        int i = 0;
        for (int n : data) {
            if (n % 2 != 0) rsl[i++] = n;
        }
        return Arrays.copyOf(rsl, i);
    }
}