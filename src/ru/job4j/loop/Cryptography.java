package ru.job4j.loop;

public class Cryptography {
    public static String code(String s) {
        if (s.isEmpty()) return "empty";
        if (s.length() < 5) return s;
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length() -4; i++) {
            sb.setCharAt(i, '#');
        }
        return sb.toString();
    }

}
