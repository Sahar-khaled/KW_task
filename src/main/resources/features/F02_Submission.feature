@smoke
Feature: F02_Submission |


  Scenario: User Write new Tweet
    Given user click signIn button
    When user enter valid username "@sahar622"
    And click on next button
    And enter password "Sahar123@"
    And Click on login button.
    And user Write new post less than "280" characters
    And click on Tweet button
    Then Validate that user post successfully.

# "Your Tweet was sent."

  Scenario: User try to Write new Tweet contains more than 280 char
    Given user click signIn button
    When user enter valid username "@sahar622"
    And click on next button
    And enter password "Sahar123@"
    And Click on login button.
    And user Write new post more than 280 characters
    And click on Tweet button
    Then Validate that user post successfully.

  Scenario: User try to Write new Tweet contains GIF
    Given user click signIn button
    When user enter valid username "@sahar622"
    And click on next button
    And enter password "Sahar123@"
    And Click on login button.
    And user Write new post contains GIF
    And click on Tweet button
    Then Validate that user post successfully.

