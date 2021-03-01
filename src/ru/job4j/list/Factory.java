package ru.job4j.list;

import java.util.List;

public class Factory {
    public static void main(String[] args) {
        String[] s = {"first", "second", "third", "fourth", "fifth"};
        List<String> list = List.of(s);
        for (int i = 0; i < s.length; i++) {
            System.out.println(list.get(i));
        }
    }
}