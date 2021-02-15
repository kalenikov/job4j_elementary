package ru.job4j.array;

import java.util.Arrays;

public class RightShift {

    public static void shift(int[] nums, int count) {
        while (count > 0) {
            int lastValue = nums[nums.length - 1];
            for (int i = 0; i < nums.length; i++) {
                int curValue = nums[i];
                nums[i] = lastValue;
                lastValue = curValue;
            }
            count--;
        }
    }

    // метод делает сдвиг с шагом 1
    private static void shift(int[] nums) {
        RightShift.shift(nums, 1);
    }

}
