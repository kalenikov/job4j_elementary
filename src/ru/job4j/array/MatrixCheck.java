package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        for (int el : board[row]) {
            if (el != 'X') {
                return false;
            }
        }
        return true;
    }

    public static boolean monoVertical(char[][] board, int column) {
         for (char[] row : board) {
            if (row[column] != 'X') {
                return false;
            }
        }
        return true;
    }
}