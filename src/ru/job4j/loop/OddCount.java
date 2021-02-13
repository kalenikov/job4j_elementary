package ru.job4j.loop;

import static org.junit.Assert.assertEquals;

public class OddCount {
    public static void main(String[] args) {
        assertEquals(1, OddCount.count(1, 2));
        assertEquals(2, OddCount.count(1, 3));
        assertEquals(2, OddCount.count(1, 4));
        assertEquals(3, OddCount.count(1, 5));
    }

    public static int count(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) sum++;
        }
        return sum;
    }
}
