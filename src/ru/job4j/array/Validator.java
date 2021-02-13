package ru.job4j.array;

public class Validator {
    public static boolean checkArray(int[] data, int value) {
        int sum = 0;
        for (int n : data) if (n == value) sum++;
        return sum < data.length / 2;
    }

}
