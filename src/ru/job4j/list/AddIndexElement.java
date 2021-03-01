package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class AddIndexElement {
    public static boolean addNewElement(List<String> list, int index, String str) {
        List<String> rsl = new ArrayList<>(list);
        if (!list.contains(str)) rsl.add(index, str);
        return rsl.size() != list.size();
    }
}