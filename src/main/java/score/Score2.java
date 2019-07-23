package score;

public abstract class Score2 {
    private int p1point;
    private int p2point;

    public Score2(int p1point, int p2point) {
        this.p1point = p1point;
        this.p2point = p2point;
    }

    public Score2 player1Scores() {
        this.p1point++;
        return decideNextState();
    }

    public Score2 player2Scores() {
        this.p2point++;
        return decideNextState();
    }

    public abstract String getScore();

    protected abstract Score2 decideNextState();

    public int getP1point() { return p1point; }
    public int getP2point() { return p2point; }

    protected String convertScore(int point) {
        if (point == 0)
            return "Love";
        if (point == 1)
            return "Fifteen";
        if (point == 2)
            return "Thirty";
        if (point == 3)
            return "Forty";
        return "";
    }

    protected boolean isEqualScore() { return getP1point() == getP2point();
    }

    protected boolean isDeuce() {
        return isEqualScore() && getP1point()>=3;
    }

    protected boolean isWinPlayer() {
        return Math.max(getP1point(),getP2point())>=4 && Math.abs(getP1point()-getP2point())>=2;
    }
}