package ru.job4j.array;

import java.util.Arrays;

//12345 => {5, 4, 3, 2, 1}
public class NumberToArray {
    public static int[] resolve(int number) {
        String s = Integer.toString(number);
        int[] rsl = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            rsl[s.length() - i - 1] = Integer.parseInt(s.substring(i, i + 1));
        }
        return rsl;

    }
}
