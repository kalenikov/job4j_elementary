package ru.job4j.array;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        for (int l : left) {
            rsl[i++] = l;
        }
        for (int r : right) {
            boolean exist = false;
            for (int m : rsl) {
                if (m == r) {
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                rsl[i++] = r;
            }
        }
        return Arrays.copyOf(rsl, i);
    }
}
