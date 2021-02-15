package ru.job4j.array;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int[] rsl = new int[(int) Math.pow(data.length, 2)];
        int idx = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (i + j != sum) rsl[idx++] = data[i][j];
            }
        }
        return Arrays.copyOf(rsl, idx);
    }
}