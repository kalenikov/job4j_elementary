package ru.job4j.array;

public class EndsWith {

    public static boolean endsWith(char[] word, char[] post) {
        int offset = word.length - post.length;
        for (int i = 0; i < post.length; i++) {
            if (word[i + offset] != post[i]) {
                return false;
            }
        }
        return true;
    }

}