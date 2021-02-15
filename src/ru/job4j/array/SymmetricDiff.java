package ru.job4j.array;

import java.util.Arrays;

//Симметрическая разность - это такая операция,
// когда в результирующее множество попадают все элементы из обоих множеств,
// кроме тех, которые есть и в том и в другом множествах.

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int i = 0;
        for (int l : left) {
            boolean exist = false;
            for (int r : right) {
                if (l == r) {
                    exist = true;
                    break;
                }
            }
            if (!exist) rsl[i++] = l;
        }

        for (int l : right) {
            boolean exist = false;
            for (int r : left) {
                if (l == r) {
                    exist = true;
                    break;
                }
            }
            if (!exist) rsl[i++] = l;
        }

        return Arrays.copyOf(rsl, i);
    }
}