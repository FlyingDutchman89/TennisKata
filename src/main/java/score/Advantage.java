package score;

public class Advantage extends Score2 {
    public Advantage(int p1point, int p2point) {
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
        if (getP1point() > getP2point())
            return "Advantage player1";
        return "Advantage player2";
    }

    private Score2 decideNextState() {
        if (isWinPlayer()) {
            return new Win(getP1point(), getP2point());
        }
        return new Deuce(getP1point(), getP2point());
    }
}
