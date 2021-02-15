package ru.job4j.array;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int sum = 0;
        for (int n : data) {
            if (n == el) break;
            sum += n;

        }
        return sum % 2 == 0 ? sum : 0;

    }
}