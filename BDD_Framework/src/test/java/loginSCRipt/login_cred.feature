Feature: user login

Scenario: login with valid credentials

Given user opens the testUrl
When user enters valid email address "8017208193"
And user enters valid password "selenium1234"
And user clicks on login button
Then user should login sucessfully

Scenario: login with invalid credentials

Given user opens the testUrl
When user enters invalid email address "123@gmail.com"
And user enters invalid password "sell123"
And user clicks on login button
Then user should get  warning message 
 
 Scenario: login with valid email and invalid password

Given user opens the testUrl
When user enters valid email address "8017208193"
And user enters invalid password "sell123"
And user clicks on login button
Then user should get  warning message 

 Scenario: login with invalid email and valid password

Given user opens the testUrl
When user enters valid email address "1233@gmail.com"
And user enters invalid password "selenium1234"
And user clicks on login button
Then user should get  warning message 

 Scenario: login with no credentials

Given user opens the testUrl
When user enters no credentials
And user clicks on login button
Then user should get  warning message 