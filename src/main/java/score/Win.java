package score;

public class Win extends Score2 {
    public Win(int p1point, int p2point) {
        super(p1point, p2point);
    }

    @Override
    public String getScore() {
        if (getP1point()>getP2point())
            return "Win for player1";
        return "Win for player2";
    }

    @Override
    protected Score2 decideNextState(){return this;}

}
