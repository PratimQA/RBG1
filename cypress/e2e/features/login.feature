Feature: Login page

  Login page feature will work depending on the user credentials


  Background:
      Given A user opens Red Belt Gyms website
  Scenario: Login page title
      Then page title should be verified



  Scenario: Forgot Password link
      Then forgot password link should be displayed



  Scenario: Login with correct credentials
      When user enters username "test-user26@rbg.in"
      Then user enters password "123456"
      Then user clicks on Login button
      Then user gets the title of the dashboard page



  Scenario: Login with incorrect username
      When user provides incorrect credentials
           | username       | password |
           | abcd@gmail.com | 123456   |
      And user clicks on Login button
      Then error message "Invalid email or password" should be displayed



  Scenario: Login with incorrect password
      When user provides incorrect credentials
           | username           | password |
           | test-user26@rbg.in | 654321   |
      And user clicks on Login button
      Then error message "Invalid email or password" should be displayed

