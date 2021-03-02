package ru.job4j.set;

import java.util.Arrays;
import java.util.HashSet;

public class Isogram {
    public static boolean checkString(String s) {
        return new HashSet<>(Arrays.asList(s.split(""))).size() == s.length();
    }
}