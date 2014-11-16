package com.example.jumar.katas.bowlinggame;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class BowlingGameTest {

    @Test
    public void gutterGame() {
        final Game game = new Game();

        for (int i = 0; i < 20; i++) {
            game.roll(0);
        }

        assertThat(game.score(), is(0));
    }
}