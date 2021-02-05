package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ArrayCharTest {
    @Test
    public void whenStartWithPrefixThenTrue() {
        Character[] word = {'H', 'e', 'l', 'l', 'o'};
        Character[] pref = {'H', 'e'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(true));
    }

    @Test
    public void whenNotStartWithPrefixThenFalse() {
        Character[] word = {'H', 'e', 'l', 'l', 'o'};
        Character[] pref = {'H', 'i'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result, is(false));
    }
}