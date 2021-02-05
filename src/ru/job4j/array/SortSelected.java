package ru.job4j.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortSelected {

    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int indexMin = FindLoop.indexOf(data, min, i, data.length);
            int temp = data[i];
            data[i] = min;
            data[indexMin] = temp;
        }
        return data;
    }

}


