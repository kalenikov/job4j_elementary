package ru.job4j.list;

import java.util.*;

public class Alphabet {
    public static String reformat(String s) {
        System.out.println(s);
        String[] ss = s.split("");
        List<String> ll = Arrays.asList(ss);
        ll.sort(Comparator.naturalOrder());
        StringBuilder sb = new StringBuilder();
        System.out.println(String.join("", ll));
        return String.join("", ll);
    }
}