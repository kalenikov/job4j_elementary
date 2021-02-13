package ru.job4j.loop;

import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class ModWithLoop {

    public static void main(String[] args) {
        assertEquals(0, ModWithLoop.mod(4, 2));
        assertEquals(1, ModWithLoop.mod(3, 2));
        assertEquals(2, ModWithLoop.mod(8, 3));
        assertEquals(0, ModWithLoop.mod(0, 3));
    }


    public static int mod(int n, int d) {
        return n - (n/d)*d;
    }

}
