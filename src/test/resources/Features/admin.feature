Feature: To validate the admin section

  Background: 
    Given the user is logged into the OrangeHRM application

  @admin
  Scenario: User valid the User management section
    When the user enter their username
    And the user select their role
    And the user enter the employee name
    And the user selects their status
    And the user click the search icon
    Then the user check the  employee records

  @add
  Scenario: User validate the add function
    When the user clcik the admin option
    And the user click the add fucntion
    Then the user validate the add page
    When the user select the user role
    And the user input the employee name
    And the user choose the status
    And the user input the username
    And the user enter the password
    And the user  reenter the comfirm password
    And the user click the save button
