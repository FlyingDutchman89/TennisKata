package score;

public class Equals extends Score2 {
    public Equals(int p1point, int p2point) {
        super(p1point, p2point);
    }

    @Override
    public Score2 player1Scores() {
        super.player1Scores();
        return decideNextState();
    }

    @Override
    public Score2 player2Scores() {
        super.player2Scores();
        return decideNextState();
    }

    @Override
    public String getScore() {
        return convertScore(getP1point()) + "-All";
    }

    private Score2 decideNextState() {
        if (isRegular()) {
            return new Regular(getP1point(), getP2point());
        }
        return this;
    }

    private boolean isRegular() {
        return getP1point() != getP2point() && Math.max(getP1point(),getP2point())<=3;
    }

    private String convertScore(int point) {
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

    private boolean isEqualScore() {
        return getP1point() == getP2point();
    }
}
