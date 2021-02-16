package ru.job4j.array;

import java.util.Arrays;

public class PushTheNumbers {

    public static void push(int[][] array, int row, int column) {

        int prev = 0;
        boolean startShift = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == row && j == column) {
                    startShift = true;
                }
                if (startShift) {
//                    System.out.println(prev);
                    int temp = array[i][j];
                    array[i][j] = prev;
                    prev = temp;
                }
            }
        }
    }
}