package ru.job4j.set;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Firewall {

    private enum FirewallText {
        GOOD("Вы сделали правильный выбор!"),
        BAD("Выберите другую статью...");
        private String message;

        private FirewallText(String message) {
            this.message = message;
        }

        @Override
        public String toString() {
            return message;
        }
    }

    public static String checkName(String s, Set<String> words) {
        Set<String> bset = new HashSet<>(Arrays.asList(s.split(" ")));
        bset.retainAll(words);
        return bset.size() > 0 ? FirewallText.BAD.message : FirewallText.GOOD.message;
    }
}