Feature: New user registration page

  Background: 
    Given The user is on the registration page

  Scenario: User clicks Register with empty fields
    When The user clicks register without entering any details
    Then The error Please fill out this field appears below username textbox
    And The user redirected to empty username textbox

  Scenario: User clicks Register with empty Password field
    When The user clicks register with only username
    Then The error Please fill out this field appears below password textbox
    And The user redirected to empty password textbox

  Scenario: User clicks Register with empty Confirm Password field
    When The user clicks register with empty confirm password field
    Then The error Please fill out this field appears below confirm password textbox
    And The user redirected to empty confirm password textbox

  Scenario: User clicks Register with different values for password and confirm password
    When The user clicks register with different password and confirm password
    Then The error password_mismatch:The two password fields didn’t match should be shown
    And The user redirected to empty username username textbox

  Scenario: User clicks Login from Registration page
    When The user clicks Login from registration page
    Then user should be redirected to Login page
    And user can enter username and password in login page

  Scenario: User clicks SignIn from Registration page
    When The user clicks SignIn from registration page
    Then user should be redirected to SignIn page
    And user can enter username and password in signin page

  #Scenario: User clicks Register with valid username and password
   # When The user clicks register with valid username and password
   # Then user should be registered successfully
  #  And user should be redirected to the home page
