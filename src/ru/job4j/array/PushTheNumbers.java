package ru.job4j.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PushTheNumbers {

    public static void push_old(int[][] array, int row, int column) {
        int prev = 0;
        boolean startShift = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i == row && j == column) startShift = true;
                if (startShift) {
                    int temp = array[i][j];
                    array[i][j] = prev;
                    prev = temp;
                }
            }
        }
    }

    public static void push(int[][] array, int row, int column) {
        int prev = 0;
//        сдвинуть вперед по строке (откуда, куда, сколько)
        System.arraycopy(array[row], column, array[row], column + 1, array.length - column - 1);
//        сдвинуть назад по строке
        System.arraycopy(array[row], 1, array[row], 0, column);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (j == column && (i < row)) {
                    array[i][j] = array[i + 1][j];
                }
                if (j == column && (i >= row)) {
                    int temp = array[i][j];
                    array[i][j] = prev;
                    prev = temp;
                }
            }
        }
        System.out.println(Arrays.deepToString(array).replace("],", "],\n"));
    }
}
