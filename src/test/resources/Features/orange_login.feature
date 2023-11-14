Feature: To validate the orangehrm applycation

  @valid
  Scenario: User logs in with valid information
    Given the user has launched the orangeHRM application URL
    When the user  provide a valid username
    And the user provide a valid password
    And the user click the login button
    Then the user should be loggin successfully

  @invalid
  Scenario: User logs in with invalid information
    Given the user is on the OrangeHRM login page
    When the user provide a invalid username
    And the user provide a invalid password
    And the user click the an login button
    Then the user should see an error massage

  @blank
  Scenario: User logs in with a blank username and password
    Given the user is on the OrangeHRm login page
    When the user leaves both the username and password fields 	blank
    And the user click on the login button
    Then the user should look an error massage
