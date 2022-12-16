
Feature: Log in as different user

  Scenario: Login in as teacher with parameter
    Given The user is on the login page
    When The user logs in using "eurotech@gmail.com" and "Test12345!"
    Then The user should be able to login
    And The welcome massage contains "Teacher"


  Scenario: Login in as teacher with parameter
    Given The user is on the login page
    When The user logs in using "EurotechB5@gmail.com" and "Test12345"
    Then The user should be able to login
    And The welcome massage contains "eurotechB5"
    Then The user should be able to see header as "Filter Profiles by Skill or by Location"

