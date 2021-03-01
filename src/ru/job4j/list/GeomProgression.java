package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class GeomProgression {
    public static int generateAndSum(int first, int denominator, int count) {
        int sum = 0;
        for (int i = 1; i <= count; i++) {
            int b = (int) (first * Math.pow(denominator, i - 1));
            System.out.println(b);
            sum += b;
        }
        return sum;
    }
}