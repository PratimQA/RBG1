Feature: Login page feature

Scenario: Login page title
Given user is on login page
When user gets the title of the page
Then page title should be "Red Belt Gym - Login"

Scenario: Forgot Password link
Given user is on login page
Then forgot your password link should be displayed

Scenario: Login with correct credentials
Given user is on login page
When user enters username "test-user26@rbg.in"
And user enters password "123456"
And user clicks on Login button
Then user gets the title of the dashboard page
And page title should be "Red Belt Gym - Dashboard"