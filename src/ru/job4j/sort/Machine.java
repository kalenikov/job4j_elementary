package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];

        int changeRemains = money - price;
        int coinCount = 0;

        for (int coin : coins) {
            while (changeRemains >= coin) {
                changeRemains -= coin;
                result[coinCount] = coin;
                coinCount++;
            }
        }
        return Arrays.copyOf(result, coinCount);
    }
}