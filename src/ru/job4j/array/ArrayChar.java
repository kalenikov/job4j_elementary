package ru.job4j.array;

public class ArrayChar {
    public static boolean startsWith(Object[] word, Object[] pref) {
        int minLength = Math.min(pref.length, word.length);
        for (int i = 0; i < minLength; i++) {
            if (!word[i].equals(pref[i])) {
                return false;
            }
        }
        return true;
    }
}