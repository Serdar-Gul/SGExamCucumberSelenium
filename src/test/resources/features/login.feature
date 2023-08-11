Feature: Devbook Login Test
  # Agile story :  As a user, I should be able to log in so I can see my account

  Scenario: Login as a Teacher
    Given The user is on the login page
    When The user enters teacher credentials
    Then The user should be able to login

  Scenario: Login as a Student
    Given The user is on the login page
    When The user enters student credentials
    Then The user should be able to login

  # Clas task  Login as a Developer
  Scenario: Login as a Developer
    Given The user is on the login page
    When The user enters developer credentials
    Then The user should be able to login

