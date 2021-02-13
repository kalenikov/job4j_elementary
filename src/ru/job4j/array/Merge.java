package ru.job4j.array;

import java.lang.reflect.Array;
import java.util.Arrays;

import static java.lang.System.arraycopy;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Merge {

    public static void main(String[] args) {
        int[] expect = {2, 2, 4, 4};
        int[] result = Merge.merge(
                new int[]{1, 2},
                new int[]{3, 4}
        );
        assertThat(result, is(expect));
    }

    public static int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int l = 0, r = 0, i = 0;
        while (l < left.length && r < right.length) {
           rsl[i++] = left[l] < right[r] ? left[l++] : right[r++];
        }
        if (l < left.length) {
            System.arraycopy(left, l, rsl, i, left.length - l);
        } else if (r < right.length) {
            System.arraycopy(right, r, rsl, i, right.length - r);
        }
        return rsl;
    }
}
