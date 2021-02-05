package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenEndWithPrefixThenTrue() {
        Character[] word = {'H', 'e', 'l', 'l', 'o'};
        Character[] post = {'l', 'o'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotEndWithPrefixThenFalse() {
        Character[] word = {'H', 'e', 'l', 'l', 'o'};
        Character[] post = {'l', 'a'};
        boolean result = EndsWith.endsWith(word, post);
        assertThat(result, is(false));
    }
}