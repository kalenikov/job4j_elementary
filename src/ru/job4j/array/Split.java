package ru.job4j.array;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class Split {

    public static void main(String[] args) {
        char[] s = "one two ".toCharArray();
        char[][] splitted = Split.split(s, ' ');
        System.out.println(Arrays.deepToString(splitted));
        String[] str = convert(splitted);
        String[] expected = new String[]{"one", "two"};
        assertArrayEquals(expected, str);
    }

    private static String[] convert(char[][] splitted) {
        String[] result = new String[splitted.length];
        int ri = 0;
        for (char[] row : splitted) {
            result[ri++] = new String(row);
        }
        return result;
    }

    public static char[][] split(char[] str, char c) {
        char[][] rsl = new char[str.length][];
        int row = 0;
        char[] word = new char[str.length];
        int wordLen = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] != c) {
                word[wordLen++] = str[i];
            } else {
                rsl[row] = new char[wordLen];
                rsl[row] = Arrays.copyOf(word, wordLen);
                row++;
                word = new char[str.length];
                wordLen = 0;
            }
        }
        rsl[row] = new char[wordLen];
        rsl[row] = Arrays.copyOf(word, wordLen);
        return Arrays.copyOf(rsl, row + 1);
    }
}