package com.example.jumar.katas.bowlinggame;

public class Game {

    private int score;

    public void roll(int pins) {
        score += pins;
    }

    public int score() {
        return score;
    }

}
