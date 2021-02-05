package ru.job4j.array;

public class StartsWith {
    public static boolean startsWith(char[] word, char[] pref) {
        int minLength = Math.min(pref.length, word.length);
        for (int i = 0; i < minLength; i++) {
            if (word[i] != (pref[i])) {
                return false;
            }
        }
        return true;
    }
}