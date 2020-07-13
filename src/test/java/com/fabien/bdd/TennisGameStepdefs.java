package com.fabien.bdd;

import com.fabien.bdd.TennisGame;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.assertj.core.api.Assertions;

public class TennisGameStepdefs {
    TennisGame tennis;
    String result;
    
    @Given("a tennis game between Fabien and William, score is Love - Love")
    public void aTennisGameBetweenFabienAndWilliamScoreIsLoveLove() {
        tennis = new TennisGame("Fabien", "William");
        Assertions.assertThat(tennis.showScore()).isEqualTo("Fabien Love - Love William");
    }

    @When("Fabien scores")
    public void fabienScores() {
        tennis.playerOneScores();
    }

    @Then("score should be Fabien fifteen - Love William")
    public void scoreShouldBeFabienFifteenLoveWilliam() {
        result = tennis.showScore();
        String expected = "Fabien 15 - Love William";
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Given("a tennis game between Fabien and William, score is fifteen - Love")
    public void aTennisGameBetweenFabienAndWilliamScoreIsFifteenLove() {
        tennis = new TennisGame("Fabien", "William");
        tennis.playerOneScores();
        Assertions.assertThat(tennis.showScore()).isEqualTo("Fabien 15 - Love William");
    }

    @Then("score should be Fabien thirty - Love William")
    public void scoreShouldBeFabienThirtyLoveWilliam() {
        result = tennis.showScore();
        String expected = "Fabien 30 - Love William";
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Given("a tennis game between Fabien and William, score is thirty - Love")
    public void aTennisGameBetweenFabienAndWilliamScoreIsThirtyLove() {
        tennis = new TennisGame("Fabien", "William");
        tennis.playerOneScores();
        tennis.playerOneScores();
        Assertions.assertThat(tennis.showScore()).isEqualTo("Fabien 30 - Love William");
    }

    @Then("score should be Fabien forty - Love William")
    public void scoreShouldBeFabienFortyLoveWilliam() {
        result = tennis.showScore();
        String expected = "Fabien 40 - Love William";
        Assertions.assertThat(result).isEqualTo(expected);
    }


    @Given("a tennis game between Fabien and William, score is thirty - forty")
    public void aTennisGameBetweenFabienAndWilliamScoreIsThirtyForty() {
        tennis = new TennisGame("Fabien", "William");
        tennis.playerOneScores();
        tennis.playerOneScores();
        tennis.playerTwoScores();
        tennis.playerTwoScores();
        tennis.playerTwoScores();
        Assertions.assertThat(tennis.showScore()).isEqualTo("Fabien 30 - 40 William");
    }

    @Then("score should be deuce")
    public void scoreShouldBeDeuce() {
        result = tennis.showScore();
        String expected = "deuce";
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Given("a tennis game between Fabien and William, score is deuce")
    public void aTennisGameBetweenFabienAndWilliamScoreIsDeuce() {
        tennis = new TennisGame("Fabien", "William");
        tennis.playerOneScores();
        tennis.playerOneScores();
        tennis.playerOneScores();
        tennis.playerTwoScores();
        tennis.playerTwoScores();
        tennis.playerTwoScores();
        Assertions.assertThat(tennis.showScore()).isEqualTo("deuce");
    }

    @Then("score should be Advantage Fabien")
    public void scoreShouldBeAdvantageFabien() {
        result = tennis.showScore();
        String expected = "Advantage Fabien";
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Given("a tennis game between Fabien and William, score is Advantage Fabien")
    public void aTennisGameBetweenFabienAndWilliamScoreIsAdvantageFabien() {
        tennis = new TennisGame("Fabien", "William");
        tennis.playerOneScores();
        tennis.playerOneScores();
        tennis.playerOneScores();
        tennis.playerOneScores();
        tennis.playerTwoScores();
        tennis.playerTwoScores();
        tennis.playerTwoScores();
        Assertions.assertThat(tennis.showScore()).isEqualTo("Advantage Fabien");
    }

    @When("William scores")
    public void williamScores() {
        tennis.playerTwoScores();
    }

    @Given("a tennis game between Fabien and William, score is fifteen - thirty")
    public void aTennisGameBetweenFabienAndWilliamScoreIsFifteenThirty() {
        tennis = new TennisGame("Fabien", "William");
        tennis.playerOneScores();

        tennis.playerTwoScores();
        tennis.playerTwoScores();

        Assertions.assertThat(tennis.showScore()).isEqualTo("Fabien 15 - 30 William");
    }

    @Then("score should be Fabien thirty - thirty William")
    public void scoreShouldBeFabienThirtyThirtyWilliam() {
        result = tennis.showScore();
        String expected = "Fabien 30 - 30 William";
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Given("a tennis game between Fabien and William, score is forty - Love")
    public void aTennisGameBetweenFabienAndWilliamScoreIsFortyLove() {
        tennis = new TennisGame("Fabien", "William");
        tennis.playerOneScores();
        tennis.playerOneScores();
        tennis.playerOneScores();
        
        Assertions.assertThat(tennis.showScore()).isEqualTo("Fabien 40 - Love William");
    }

    @Then("Fabien should win")
    public void fabienShouldWin() {
        result = tennis.showScore();
        String expected = "Game won by Fabien";
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Given("a tennis game between Fabien and William, score is Love - forty")
    public void aTennisGameBetweenFabienAndWilliamScoreIsLoveForty() {
        tennis = new TennisGame("Fabien", "William");
        tennis.playerTwoScores();
        tennis.playerTwoScores();
        tennis.playerTwoScores();

        Assertions.assertThat(tennis.showScore()).isEqualTo("Fabien Love - 40 William");
    }

    @Then("William should win")
    public void williamShouldWin() {
        result = tennis.showScore();
        String expected = "Game won by William";
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Given("a tennis game between Fabien and William, score is forty - thirty")
    public void aTennisGameBetweenFabienAndWilliamScoreIsFortyThirty() {
        tennis = new TennisGame("Fabien", "William");
        tennis.playerOneScores();
        tennis.playerOneScores();
        tennis.playerOneScores();
        
        tennis.playerTwoScores();
        tennis.playerTwoScores();

        Assertions.assertThat(tennis.showScore()).isEqualTo("Fabien 40 - 30 William");
    }

    @Then("score should be Fabien fifteen - fifteen William")
    public void scoreShouldBeFabienFifteenFifteenWilliam() {
        result = tennis.showScore();
        String expected = "Fabien 15 - 15 William";
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Given("a tennis game between Fabien and William, score is fifteen - fifteen")
    public void aTennisGameBetweenFabienAndWilliamScoreIsFifteenFifteen() {
        tennis = new TennisGame("Fabien", "William");
        tennis.playerOneScores();

        tennis.playerTwoScores();

        Assertions.assertThat(tennis.showScore()).isEqualTo("Fabien 15 - 15 William");
    }

    @Then("score should be Fabien fifteen - thirty William")
    public void scoreShouldBeFabienFifteenThirtyWilliam() {
        result = tennis.showScore();
        String expected = "Fabien 15 - 30 William";
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Then("score should be Fabien fifteen - forty William")
    public void scoreShouldBeFabienFifteenFortyWilliam() {
        result = tennis.showScore();
        String expected = "Fabien 15 - 40 William";
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Then("score should be Advantage William")
    public void scoreShouldBeAdvantageWilliam() {
        result = tennis.showScore();
        String expected = "Advantage William";
        Assertions.assertThat(result).isEqualTo(expected);
    }

    @Given("a tennis game between Fabien and William, score is Advantage William")
    public void aTennisGameBetweenFabienAndWilliamScoreIsAdvantageWilliam() {
        tennis = new TennisGame("Fabien", "William");
        tennis.playerOneScores();
        tennis.playerOneScores();
        tennis.playerOneScores();

        tennis.playerTwoScores();
        tennis.playerTwoScores();
        tennis.playerTwoScores();
        tennis.playerTwoScores();

        Assertions.assertThat(tennis.showScore()).isEqualTo("Advantage William");
    }
}
