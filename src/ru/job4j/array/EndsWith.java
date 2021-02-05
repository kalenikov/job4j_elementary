package ru.job4j.array;

import static ru.job4j.array.Turn.back;

public class EndsWith {
    public static boolean endsWith(Character[] word, Character[] post) {
        return ArrayChar.startsWith(back(word), back(post));
    }
}