Feature: TennisGame play
  
  Scenario: player one scores his first point
    Given a TennisGame no points scored
    When player one scores
    Then score should be fifteen to Love