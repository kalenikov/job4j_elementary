package ru.job4j.loop;

public class Abbreviation {
    public static String collect(String s) {
        StringBuilder sb = new StringBuilder();
        String[] ss = s.split(" ");
        for (String word : ss) {
            sb.append(word.substring(0, 1).toUpperCase());
        }
        return sb.toString();
    }
}