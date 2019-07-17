import score.*;

public class TennisGame2 implements TennisGame
{
    private Score2 score = new Equals(0,0);
    private String player1Name;
    TennisGame2(String player1Name) {
        this.player1Name = player1Name;
    }

    public void wonPoint(String player) {
    	if (player == player1Name)
    		score = score.player1Scores();
    	else
    		score = score.player2Scores();
    }

    public String getScore(){
    	return score.getScore();
    }
}