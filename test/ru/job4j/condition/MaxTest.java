package ru.job4j.condition;

import static org.hamcrest.core.Is.is;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1To2To7Then7() {
        int result = Max.max(1, 2, 7);
        assertThat(result, is(7));
    }

    @Test
    public void whenMax1To2To7to3Then7() {
        int result = Max.max(1, 2, 7, 3);
        assertThat(result, is(7));
    }
}