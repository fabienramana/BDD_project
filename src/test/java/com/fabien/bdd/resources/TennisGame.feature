Feature: TennisGame play
  
  Scenario: player scores his first point
    Given a tennis game between Fabien and William, score is Love - Love
    When Fabien scores
    Then score should be Fabien fifteen - Love William
    
  Scenario: player one scores his second point
    Given a tennis game between Fabien and William, score is fifteen - Love
    When Fabien scores
    Then score should be Fabien thirty - Love William
    
  Scenario: player one scores his third point
    Given a tennis game between Fabien and William, score is thirty - Love
    When Fabien scores
    Then score should be Fabien forty - Love William

  Scenario: second player scores his first point
    Given a tennis game between Fabien and William, score is fifteen - Love
    When William scores
    Then score should be Fabien fifteen - fifteen William

  Scenario: second player scores his second point
    Given a tennis game between Fabien and William, score is fifteen - fifteen
    When William scores
    Then score should be Fabien fifteen - thirty William

  Scenario: second player scores his third point
    Given a tennis game between Fabien and William, score is fifteen - thirty
    When William scores
    Then score should be Fabien fifteen - forty William

  Scenario: deuce after player one scores
    Given a tennis game between Fabien and William, score is thirty - forty
    When Fabien scores
    Then score should be deuce

  Scenario: deuce after player two scores
    Given a tennis game between Fabien and William, score is forty - thirty
    When William scores
    Then score should be deuce
    
  Scenario: advantage for player one
    Given a tennis game between Fabien and William, score is deuce
    When Fabien scores
    Then score should be Advantage Fabien

  Scenario: advantage for player two
    Given a tennis game between Fabien and William, score is deuce
    When William scores
    Then score should be Advantage William
    
  Scenario: deuce after advantage for player one
    Given a tennis game between Fabien and William, score is Advantage Fabien
    When William scores
    Then score should be deuce

  Scenario: deuce after advantage for player two
    Given a tennis game between Fabien and William, score is Advantage William
    When Fabien scores
    Then score should be deuce
    
  Scenario: player one wins
    Given a tennis game between Fabien and William, score is forty - Love
    When Fabien scores
    Then Fabien should win

  Scenario: player two wins
    Given a tennis game between Fabien and William, score is Love - forty
    When William scores
    Then William should win
    
  Scenario: player one wins after advantage for him
    Given a tennis game between Fabien and William, score is Advantage Fabien
    When Fabien scores
    Then Fabien should win

  Scenario: player two wins after advantage for him
    Given a tennis game between Fabien and William, score is Advantage William
    When William scores
    Then William should win
    