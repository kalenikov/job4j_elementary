package ru.job4j.loop;

import static org.junit.Assert.assertEquals;

public class SectionCount {
    public static void main(String[] args) {
        assertEquals(1, SectionCount.count(1, 1));
        assertEquals(2, SectionCount.count(2, 1));
        assertEquals(1, SectionCount.count(3, 2));
        assertEquals(2, SectionCount.count(4, 2));
    }

    public static int count(int length, int section) {
        return length/section;
    }
}
