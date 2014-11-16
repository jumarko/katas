package com.example.jumar.katas.bowlinggame;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BowlingGameTest {

    private Game game;

    @Before
    public void setUp() throws Exception {
        game = new Game();
    }

    @Test
    public void gutterGame() {
        rollMany(20, 0);

        checkScore(0);
    }

    @Test
    public void allOnes() {
        rollMany(20, 1);

        checkScore(20);
    }

    @Test
    public void oneSpare() {
        rollSpare();

        game.roll(3);

        rollMany(17, 0);

        checkScore(16);
    }

    @Test
    public void oneStrike() {
        rollStrike();

        game.roll(3);
        game.roll(4);

        rollMany(16, 0);

        checkScore(24);
    }

    @Test
    public void twoSpares() {
        rollSpare();

        rollSpare();

        game.roll(3);

        rollMany(15, 1);

        checkScore(46);
    }

    @Test
    public void perfectGame() {
        rollMany(12, 10);

        checkScore(300);
    }



    private void rollSpare() {
        game.roll(5);
        game.roll(5);
    }

    private void rollStrike() {
        game.roll(10); // strike
    }


    private void rollMany(int rolls, int pins) {
        for (int i = 0; i < rolls; i++) {
            game.roll(pins);
        }
    }

    private void checkScore(int expectedScore) {
        assertThat(game.score(), is(expectedScore));
    }

}