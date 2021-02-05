package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort8Num() {
        int[] input = new int[]{1000, 100, 1, 2, 4, 5, 8, 7};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{1, 2, 4, 5, 7, 8, 100, 1000};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3Num() {
        int[] input = new int[]{4, 1, 0};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[]{0, 1, 4};
        assertThat(result, is(expect));
    }

}