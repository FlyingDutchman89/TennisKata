package score;

public class Deuce extends Score2 {

    public Deuce(int p1point, int p2point) {
        super(p1point, p2point);
    }

    @Override
    public String getScore() {
        return "Deuce";
    }

    @Override
    protected Score2 decideNextState(){
        return new Advantage(getP1point(), getP2point());
    }
}
