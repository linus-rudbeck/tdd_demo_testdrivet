package se.distansakademin;

public class PointsGame {

    private int score = 0;

    public int getScore() {
        return score;
    }

    public void addScore(int score) {
        this.score += score;
    }

    public void reset() {
        score = 0;
    }
}
