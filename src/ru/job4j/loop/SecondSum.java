package ru.job4j.loop;

import static org.junit.Assert.assertEquals;

public class SecondSum {

    public static void main(String[] args) {
//        assertEquals(1, SecondSum.sum(1, 2));
//        assertEquals(4, SecondSum.sum(1, 3));
//        assertEquals(4, SecondSum.sum(1, 4));
//        assertEquals(9, SecondSum.sum(1, 5));
        assertEquals(12, SecondSum.sum(0, 6));
    }

    public static int sum(int a, int b) {
        int sum = 0;
        int index = 1;
        for (int i = a; i <= b; i++) {
            if (index % 2 != 0) sum += i;
            index++;
        }

        return sum;
    }
}