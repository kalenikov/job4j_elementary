package ru.job4j.array;

import java.util.Arrays;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int s = (int) Math.sqrt(array.length) + 1;
        int[][] rsl = new int[s][];
        int index = 0;
        for (int row = 0; row < s; row++) {
            rsl[row] = new int[s];
            for (int column = 0; column < s; column++) {
                if (index >= array.length) break;
                rsl[row][column] = array[index++];
            }
        }
        System.out.println(Arrays.deepToString(rsl));
        return rsl;
    }
}
