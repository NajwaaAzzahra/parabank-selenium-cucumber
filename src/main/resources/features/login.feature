Feature: Login Feature

@login
Scenario Outline: User login with valid and invalid credentials
    Given User is on the parabank homepage
    When User input <username> and <password>
    And User click login button
    Then User verify login <result>

Examples:
        | username | password | result |
        | john6755 | 123456 | Passed |
        | john11 | 1234 | Failed |