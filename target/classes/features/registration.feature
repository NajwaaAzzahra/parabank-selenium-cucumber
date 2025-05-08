@All
    Feature: Registration Parabank 

        @positive @register
        Scenario: Successful registration
            Given User is on the parabank homepage
            When User clicks the register link
            Then User is on the registration page
            When User inputs name
            And User inputs address details
            And User enters username and password
            And User confirms correct password
            And User clicks register button
            Then User registered successfully
        
        @negative @register
        Scenario: Failed registration - Mismatched password confirmation
            Given User is on the parabank homepage
            When User clicks the register link
            Then User is on the registration page
            When User inputs name
            And User inputs address details
            And User enters username and password
            And User enters mismatched password confirmation
            And User clicks register button
            Then User sees an error message
