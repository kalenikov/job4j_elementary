package ru.job4j.array;

import java.util.Arrays;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int[] rsl = new int[left.length];
        int i = 0;
        for (int l : left) {
            for (int r : right) {
                if (l == r) rsl[i++] = l;
            }
        }
        return Arrays.copyOf(rsl, i);
    }
}