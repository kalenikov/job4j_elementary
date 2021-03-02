package ru.job4j.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Pangram {
    public static boolean checkString(String s) {
        return s.length() != new HashSet<>(Arrays.asList(s.split(""))).size();
    }
}