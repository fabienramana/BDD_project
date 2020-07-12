public class TennisGame {
    private int scorePlayer1;
    private int scorePlayer2;
    private String player1;
    private String player2;

    public TennisGame(String namePlayer1, String namePlayer2){
        this.player1 = namePlayer1;
        this.scorePlayer1 = 0;
        this.player2 = namePlayer2;
        this.scorePlayer2 = 0;
    }

    public void playerOneScores(){
        this.scorePlayer1 += 1;
    }

    public void playerTwoScores(){
        this.scorePlayer2 += 1;
    }

    public String convertScore(int scorePlayer){
        if(scorePlayer == 0){
            return "Love";
        }
        if(scorePlayer == 1){
            return "15";
        }
        if(scorePlayer == 2){
            return "30";
        }
        if(scorePlayer == 3){
            return "40";
        }
        return "Problem occured";
    }

    public String showScore(){
        if(scorePlayer1 == scorePlayer2 && scorePlayer1 >= 3){
            return "deuce";
        }
        if(scorePlayer1 >=4 && scorePlayer1 == scorePlayer2+1){
            return "Advantage " + this.player1;
        }
        if(scorePlayer2 >=4 && scorePlayer2 == scorePlayer1+1){
            return "Advantage " + this.player2;
        }
        if(scorePlayer1 >=4 && scorePlayer1 == scorePlayer2+2){
            resetScore();
            return "Game won by " + this.player1;
        }
        if(scorePlayer2 >=4 && scorePlayer2 == scorePlayer1+2){
            resetScore();
            return "Game won by " + this.player2;
        }
        if(scorePlayer1 == 4 && scorePlayer2 < 3){
            resetScore();
            return "Game won by " + this.player1;
        }
        if(scorePlayer2 == 4 && scorePlayer1 < 3){
            resetScore();
            return "Game won by " + this.player2;
        }

        StringBuilder toReturn = new StringBuilder();
        toReturn.append(player1 + " " + convertScore(scorePlayer1));
        toReturn.append(" - ");
        toReturn.append(convertScore(scorePlayer2) + " " + player2);
        return toReturn.toString();
    }
    
    public void resetScore(){
        scorePlayer1 = 0;
        scorePlayer2 = 0;
    }
}
