Feature: Send Email feature in RedBeltGyms

Background:
Given user has already logged in to application
|username|password|
|test-gymtime@tier5.in|123456|

Scenario Outline: As a Gym Owner or Gym staff I will be able to Send and Email

Given user is on dashboard page
Then Click on Option dropdown select Email
Then Enter Email ID <email ID> to send an Email
Then Select from template
Then Click on Send Email

Examples:
|email ID|
|'aditi.ghosh@tier5.in'|