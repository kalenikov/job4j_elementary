package ru.job4j.array;

//        int[] left =     {1, ..... 5};
//        int[] middle =   {6, 7, 8, 9, 10};
//        int[] right =    {11, 12, 13, 14, 15, 16};
//        int[] expected = {1, 11, 7, 13, 29, 15, 5};

//        int[] left = {1, 2, 3};
//        int[] middle = {4, 5, 6};
//        int[] right = {7, 8, 9, 10};
//        int[] expected = {1, 7, 5, 9, 3};

//2. Элементы с нечетными индексами из второго массива
// должны находиться в результирующем массиве на местах с четными индексами.

//3. Элементы с четными индексами из третьего массива,
// должны находиться в результирующем массиве на местах с нечетными индексами.

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] rsl = new int[1 + right.length];
        rsl[0] = left[0];
        rsl[rsl.length - 1] = left[left.length - 1];
        for (int i = 1; i < rsl.length - 1; i++) {
            rsl[i] = i % 2 == 0 ? middle[i - 1] : right[i - 1];
        }
        return rsl;
    }
}