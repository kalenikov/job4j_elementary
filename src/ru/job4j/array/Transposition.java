package ru.job4j.array;

public class Transposition {
    public static int[][] convert(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
        int[][] result = new int[column][row];

        for (int x = 0; x < row; x++) {
            for (int y = 0; y < column; y++) {
                result[y][x] = matrix[x][y];
            }
        }
        return result;
    }
}
