package com.example.jumar.katas.bowlinggame;

public class Game {

    public static final int FRAMES_IN_GAME = 10;

    private int[] rolls = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    public int score() {
        int score = 0;

        // TODO: Following iteration is too complex
        int frameIndex = 0;
        for (int frame = 0; frame < FRAMES_IN_GAME; frame++) {
            if (isStrike(frameIndex)) {
                score += 10 + strikeBonus(frameIndex);
                frameIndex++;
            } else {
                if (isSpare(frameIndex)) {
                    score += 10 + spareBonus(frameIndex);
                } else {
                    score += sumOfBallsInFrame(frameIndex);
                }
                frameIndex += 2;
            }
        }

        return score;
    }

    private boolean isStrike(int frameIndex) {
        return rolls[frameIndex] == 10;
    }

    private boolean isSpare(int frameIndex) {
        return sumOfBallsInFrame(frameIndex) == 10;
    }

    private int strikeBonus(int frameIndex) {
        return rolls[frameIndex + 1] + rolls[frameIndex + 2];
    }

    private int spareBonus(int frameIndex) {
        return rolls[frameIndex+2];
    }

    private int sumOfBallsInFrame(int frameIndex) {
        return rolls[frameIndex] + rolls[frameIndex+1];
    }

}
