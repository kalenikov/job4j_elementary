package ru.job4j.list;

import java.util.List;

public class ArProgression {
    public static int checkData(List<Integer> data) {
        int sum = data.get(0);
        for (int i = 1; i < data.size() - 1; i++) {
            sum += data.get(i);
            if (data.get(i) != 0.5 * (data.get(i + 1) + data.get(i - 1))) return 0;
        }
        sum += data.get(data.size()-1);
        return sum;
    }
}