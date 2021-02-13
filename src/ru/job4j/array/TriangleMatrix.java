package ru.job4j.array;

import java.util.Arrays;

public class TriangleMatrix {

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(rows(4)));
    }

    public static int[][] rows(int count) {
        int[][] triangle = new int[count][];
        int index = 1;
        for (int i = 0; i < count; i++) {
            triangle[i] = new int[i + 1];
            for (int j = 0; j < i + 1; j++) {
                triangle[i][j] = index++;
            }
        }
        return triangle;
    }
}