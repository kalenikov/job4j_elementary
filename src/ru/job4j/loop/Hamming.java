package ru.job4j.loop;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Hamming {
    public static void main(String[] args) {
        int rsl = Hamming.checkStrings("abcde", "bcdef");
        assertThat(rsl, is(5));
    }

    public static int checkStrings(String left, String right) {
        int l = 0;
        for (int i = 0; i < left.length(); i++) {
            if (left.charAt(i) != right.charAt(i)) l++;
        }
        return l;
    }
}
