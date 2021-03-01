package ru.job4j.list;

import java.util.List;

public class UniqueElement {
    public static boolean checkList(List<String> list, String str) {
        int i = list.indexOf(str);
        int j = list.lastIndexOf(str);
        return i > -1 && i == j;
    }
}