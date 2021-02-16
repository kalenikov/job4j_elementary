package ru.job4j.array;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class Anomaly {

    public static void main(String[] args) {
         int[][] expect = {new int[]{1, 2}, new int[]{5, 6}};
        int[] data = {5, 16, 17, 15, 10, 1, 2};
        int up = 16;
        int down = 4;
        int[][] out = Anomaly.found(data, up, down);
        assertArrayEquals(expect, out);
    }

    public static int[][] found(int[] data, int up, int down) {
        int[][] rsl = new int[data.length][data.length];
        int[][] rsl2 = new int[data.length][];

        int count = 0;
        int column = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] <= down || data[i] >= up) {
                rsl[count][column++] = i;
            } else {
                count++;
                column = 0;
            }
        }
        column = 0;
        for (int i = 0; i < rsl.length; i++) {
            if (rsl[i][0] == 0) continue;
            int lenDia = 0;
            while (rsl[i][lenDia] != 0) lenDia++;
            rsl2[column] = new int[lenDia];
            rsl2[column] = Arrays.copyOf(rsl[i], lenDia);
            column++;
        }
        return rsl2;

    }
}