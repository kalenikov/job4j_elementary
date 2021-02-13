package ru.job4j.array;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int entry = 0;
        for (int i = 0; i < string.length; i++) {
            if (c == string[i]) entry++;
            if (entry == number) return i;
        }
        return -1;
    }
}