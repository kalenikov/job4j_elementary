package ru.job4j.loop;

import static org.junit.Assert.assertEquals;

public class DigitSum {
    public static void main(String[] args) {
        assertEquals(1, DigitSum.sum(1));
        assertEquals(3, DigitSum.sum(12));
        assertEquals(6, DigitSum.sum(123));
        assertEquals(10, DigitSum.sum(1234));
        assertEquals(15, DigitSum.sum(12345));
    }

    public static int sum(int num) {
        int sum = 0;
        while (num != 0){
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

}
