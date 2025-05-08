Feature: open new account

@openNewAccount
Scenario Outline: User want to open new bank account
    When User navigates to Open New Account page
    And User selects account type 
    And User selects existing account 
    And User click submits button
    Then User account registered successfully
    