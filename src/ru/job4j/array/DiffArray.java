package ru.job4j.array;

import java.util.Arrays;


//Разность множеств это операция при которой в
//        результирующее множество попадают элементы из первого множества, но только если их нет во втором множестве.

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        int[] rsl = new int[left.length];
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
        return Arrays.copyOf(rsl, i);
    }
}