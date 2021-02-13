package ru.job4j.array;

public class Sorted {
    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++)
            if (array[i + 1] < array[i]) return false;
        return true;
    }
}