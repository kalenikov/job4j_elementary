package ru.job4j.array;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int[] rsl = new int[left.length * left.length];
        int index = 0;
        for (int x = 0; x < left.length; x++) {
            for (int y = 0; y < right.length; y++) {
                rsl[index++] = Math.max(left[x][y], right[x][y]);
            }
        }
        return rsl;
    }
}
