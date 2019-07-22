package score;

public class Regular extends Score2 {
    public Regular(int p1point, int p2point) {
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
        return convertScore(getP1point()) + "-" + convertScore(getP2point());
    }

    private Score2 decideNextState() {
        if (isDeuce()) {
            return new Deuce(getP1point(), getP2point());
        }
        if (isWinPlayer()){
            return new Win(getP1point(), getP2point());
        }
        if (isEqualScore()){
            return new Equals(getP1point(), getP2point());
        }
        return this;
    }
}
