package ru.job4j.array;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class Anomaly {

    public static void main(String[] args) {
//        int[][] expect = {new int[]{1, 2}, new int[]{5, 6}};
//        int[] data = {5, 16, 17, 15, 10, 1, 2};
//        int up = 16;
//        int down = 4;
//        int[][] expect = {new int[]{1, 2}, new int[]{5, 6}};
//        int[] data = {1, 20, 25, 1, 1, 0, -1};
//        int up = 16;
//        int down = 0;
        int[][] expect = {new int[]{1, 1}};
        int[] data = {1, 20, 1};
        int up = 10;
        int down = 0;

        int[][] out = Anomaly.found(data, up, down);

        System.out.println(Arrays.deepToString(expect));
        System.out.println(Arrays.deepToString(out));
        assertArrayEquals(expect, out);
    }

    public static int[][] found(int[] data, int up, int down) {
        int[][] rsl = new int[data.length][];
        int[] range = new int[data.length];

        int row = 0;
        int rangeIndex = 0;
        boolean startedRange = false;
        for (int i = 0; i < data.length; i++) {
            if (data[i] <= down || data[i] >= up) {
                range[rangeIndex++] = i;
                startedRange = true;
                continue;
            }
            if (startedRange) {
                if (rangeIndex == 1) {
                    rangeIndex++;
                    range[1] = range[0];
                }
                rsl[row] = new int[rangeIndex];
                rsl[row] = Arrays.copyOf(range, rangeIndex);
                row++;
                rangeIndex = 0;
                startedRange = false;
            }
        }

        if (startedRange) {
            rsl[row] = new int[rangeIndex];
            rsl[row++] = Arrays.copyOf(range, rangeIndex);
        }

        return Arrays.copyOf(rsl, row);
    }
}