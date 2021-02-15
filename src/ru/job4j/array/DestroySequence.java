package ru.job4j.array;

public class DestroySequence {
    public static char[] destroy(char[] seq) {
        for (int i = 0; i < seq.length; i++) {
            if (i <= 4) seq[i] = '0';
            if (i >= seq.length - 5) seq[i] = '1';
        }
        return seq;
//        return new StringBuilder(String.valueOf(seq)).replace(0, 4, "00000").replace(seq.length - 1, seq.length, "11111").toString();
    }
}