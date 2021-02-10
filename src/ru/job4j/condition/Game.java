package ru.job4j.condition;

// checkGame(0.2, 50, 9); 10>9 exp 1
// checkGame(0.9, 1, 2); 0.9 < 2 exp 0

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class Game {

    public static void main(String[] args) {
        int rsl = Game.checkGame(0.9, 1, 2);
        assertThat(rsl, is(0));

        rsl = Game.checkGame(0.2, 50, 9);
        assertThat(rsl, is(1));
    }


    public static int checkGame(double percent, int prize, int pay) {

        if (percent * prize > pay) {
            return percent * prize - pay < 0 ? 0 : (int) (percent * prize - pay);
        }
        return 0;

    }
}