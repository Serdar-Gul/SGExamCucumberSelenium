@wip
Feature: Navigate to menu with parameters

  Scenario: User navigates to Developers Page
    Given The user is on the login page
    When The user logs in using "teacher@bootflow.academy" and "Test12345!"
    Then The welcome message contains "Teacher"
    And The user navigates to "Developers" menu
    Then The user should be able to see header as "Filter Profiles by Skill or by Location"