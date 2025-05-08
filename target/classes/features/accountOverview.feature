Feature: Feature name

    @accountOverview
    Scenario Outline: User want views account overview
        When User navigates to open account overview page
        And User select bank account
        And User choose period and time
        And User click go button
        Then User views account transaction history

