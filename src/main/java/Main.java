public class Main {
    
    public static void main(String[] args) {
        TennisGame tennis  = new TennisGame("Fabien", "Emilie");
        tennis.playerOneScores();
        tennis.playerOneScores();
        



        tennis.playerTwoScores();
        tennis.playerTwoScores();
        tennis.playerTwoScores();
        tennis.playerTwoScores();
       
        System.out.println(tennis.showScore());
    }
}
