package score;

public class Score2 {
    private int p1point;
    private int p2point;

    public Score2(int p1point, int p2point) {
        this.p1point = p1point;
        this.p2point = p2point;
    }

    public Score2 player1Scores() {
        this.p1point++;
        return this;
    }

    public Score2 player2Scores() {
        this.p2point++;
        return this;
    }

    public String getScore(){
        return "NoStateObject";
    }

    public int getP1point() { return p1point; }
    public int getP2point() {
        return p2point;
    }

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

}