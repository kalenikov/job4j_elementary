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
}