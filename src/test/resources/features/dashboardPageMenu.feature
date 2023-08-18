Feature: Dashboard Page Menu
  @wip
  Scenario:  User should be able to see dashboard Menu after log in
    Given The user is on the login page
    When The user logs in using "teacher@bootflow.academy" and "Test12345!"
    Then The welcome message contains "Teacher"
    And The user should be able to see following menu
      | Developers |
      | All Posts  |
      | My Account |