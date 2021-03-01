package ru.job4j.array;

//int[][] array = {{1}, {2, 3, 4}, {5, 6}, {7, 8, 9, 10, 11}};
//int[][] expected = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 0}, {0, 0, 0, 0}};

//0 1 2 3 4 5 6 7 8 9 10 11 - счетчик по значениям
//индекс строки - вычисляется на основании счетчика
//индекс колонки - вычисляется на основании счетчика

public class Converter {

    public static int[][] convertInSquareArray(int[][] array) {
        int size = 0;
        for (int[] row : array) size += row.length;
        size = (int) Math.ceil(Math.sqrt(size));
        int[][] rsl = new int[size][size];
        int i = 0;
        for (int[] row : array) {
            for (int column : row) {
                rsl[i / size][i++ % size] = column;
            }
        }
        return rsl;
    }
}
