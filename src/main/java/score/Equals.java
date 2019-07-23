package score;

public class Equals extends Score2 {
    public Equals(int p1point, int p2point) {
        super(p1point, p2point);
    }

    @Override
    public String getScore() {
        return convertScore(getP1point()) + "-All";
    }

    @Override
    public Score2 decideNextState() {
        return new Regular(getP1point(), getP2point());
    }
}
