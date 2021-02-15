package ru.job4j.array;

import java.util.StringJoiner;

public class WordsToText {
    public static String convert(String[] words) {
        StringJoiner sb = new StringJoiner(" ");
        for (String word : words) sb.add(word);
        return sb.toString();
    }
}
