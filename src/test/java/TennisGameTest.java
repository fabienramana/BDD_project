import org.assertj.core.api.Assertions;
import org.junit.Test;

public class TennisGameTest {
    @Test
    public void score_should_be_15_to_Love(){
        // Given a tennis game between Fabien and William, score is Love - Love
        TennisGame tennis = new TennisGame("Fabien", "William");
        Assertions.assertThat(tennis.showScore()).isEqualTo("Fabien Love - Love William");
        
        //When Fabien scores
        tennis.playerOneScores();
        
        //Then, score should be "Fabien 15 - Love William"
        String expected = "Fabien 15 - Love William";
        String result = tennis.showScore(); 
        Assertions.assertThat(result).isEqualTo(expected);
    }
    
    @Test
    public void score_should_be_30_to_Love(){
        // Given a tennis game between Fabien and William, score is 15 - Love
        TennisGame tennis = new TennisGame("Fabien", "William");
        tennis.playerOneScores();
        Assertions.assertThat(tennis.showScore()).isEqualTo("Fabien 15 - Love William");

        //When Fabien scores
        tennis.playerOneScores();

        //Then, score should be "Fabien 30 - Love William"
        String expected = "Fabien 30 - Love William";
        String result = tennis.showScore();
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void score_should_be_40_to_Love(){
        // Given a tennis game between Fabien and William, score is 30 - Love
        TennisGame tennis = new TennisGame("Fabien", "William");
        tennis.playerOneScores();
        tennis.playerOneScores();
        Assertions.assertThat(tennis.showScore()).isEqualTo("Fabien 30 - Love William");

        //When Fabien scores
        tennis.playerOneScores();

        //Then, score should be "Fabien 40 - Love William"
        String expected = "Fabien 40 - Love William";
        String result = tennis.showScore();
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void score_should_be_deuce(){
        // Given a tennis game between Fabien and William, score is 30 - 40
        TennisGame tennis = new TennisGame("Fabien", "William");
        tennis.playerOneScores();
        tennis.playerOneScores();
        tennis.playerTwoScores();
        tennis.playerTwoScores();
        tennis.playerTwoScores();
        Assertions.assertThat(tennis.showScore()).isEqualTo("Fabien 30 - 40 William");

        //When Fabien scores
        tennis.playerOneScores();

        //Then, score should be "Fabien 40 - Love William"
        String expected = "deuce";
        String result = tennis.showScore();
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void score_should_be_advantage_Fabien(){
        // Given a tennis game between Fabien and William, score is deuce
        TennisGame tennis = new TennisGame("Fabien", "William");
        tennis.playerOneScores();
        tennis.playerOneScores();
        tennis.playerOneScores();
        tennis.playerTwoScores();
        tennis.playerTwoScores();
        tennis.playerTwoScores();
        Assertions.assertThat(tennis.showScore()).isEqualTo("deuce");

        //When Fabien scores
        tennis.playerOneScores();

        //Then, score should be "Fabien 40 - Love William"
        String expected = "Advantage Fabien";
        String result = tennis.showScore();
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void score_should_be_deuce_after_advantage_Fabien(){
        // Given a tennis game between Fabien and William, score is deuce
        TennisGame tennis = new TennisGame("Fabien", "William");
        tennis.playerOneScores();
        tennis.playerOneScores();
        tennis.playerOneScores();
        tennis.playerOneScores();
        tennis.playerTwoScores();
        tennis.playerTwoScores();
        tennis.playerTwoScores();
        Assertions.assertThat(tennis.showScore()).isEqualTo("Advantage Fabien");

        //When William scores
        tennis.playerTwoScores();

        //Then, score should be "Fabien 40 - Love William"
        String expected = "deuce";
        String result = tennis.showScore();
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void score_should_be_30_to_30(){
        // Given a tennis game between Fabien and William, score is deuce
        TennisGame tennis = new TennisGame("Fabien", "William");
        tennis.playerOneScores();
        tennis.playerTwoScores();
        tennis.playerTwoScores();
        Assertions.assertThat(tennis.showScore()).isEqualTo("Fabien 15 - 30 William");

        //When Fabien scores
        tennis.playerOneScores();

        //Then, score should be "Fabien 40 - Love William"
        String expected = "Fabien 30 - 30 William";
        String result = tennis.showScore();
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void game_should_be_won_by_Fabien(){
        // Given a tennis game between Fabien and William, score 40 - 15
        TennisGame tennis = new TennisGame("Fabien", "William");
        tennis.playerOneScores();
        tennis.playerOneScores();
        tennis.playerOneScores();
        tennis.playerTwoScores();
        Assertions.assertThat(tennis.showScore()).isEqualTo("Fabien 40 - 15 William");

        //When Fabien scores
        tennis.playerOneScores();

        //Then, score should be "Fabien 40 - Love William"
        String expected = "Game won by Fabien";
        String result = tennis.showScore();
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void game_should_be_won_by_Fabien_after_advantage_for_him(){
        // Given a tennis game between Fabien and William, score 40 - 15
        TennisGame tennis = new TennisGame("Fabien", "William");
        tennis.playerOneScores();
        tennis.playerOneScores();
        tennis.playerOneScores();
        tennis.playerOneScores();
        tennis.playerTwoScores();
        tennis.playerTwoScores();
        tennis.playerTwoScores();
        Assertions.assertThat(tennis.showScore()).isEqualTo("Advantage Fabien");

        //When Fabien scores
        tennis.playerOneScores();

        //Then, score should be "Fabien 40 - Love William"
        String expected = "Game won by Fabien";
        String result = tennis.showScore();
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Test
    public void score_should_be_15_to_15(){
        // Given a tennis game between Fabien and William, score 0 - 15
        TennisGame tennis = new TennisGame("Fabien", "William");
        tennis.playerTwoScores();
        Assertions.assertThat(tennis.showScore()).isEqualTo("Fabien Love - 15 William");

        //When Fabien scores
        tennis.playerOneScores();

        //Then, score should be "Fabien 40 - Love William"
        String expected = "Fabien 15 - 15 William";
        String result = tennis.showScore();
        Assertions.assertThat(result).isEqualTo(expected);
    }
}
