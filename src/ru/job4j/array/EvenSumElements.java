package ru.job4j.array;

public class EvenSumElements {
    public static boolean checkArray(int[] data) {
        int sum = 0;
        for (int n : data) sum += n;
        return sum % 2 == 0;
    }
}
