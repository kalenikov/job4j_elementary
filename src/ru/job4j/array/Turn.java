package ru.job4j.array;

public class Turn {
    public static Object[] back(Object[] array) {
        for (int i = 0; i < (array.length) / 2; i++) {
            Object temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
}