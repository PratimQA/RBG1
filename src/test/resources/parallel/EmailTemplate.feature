Feature: Email template feature in RedBeltGyms

Background:
Given user has already logged in to application
|username|password|
|test-gymtime@tier5.in|123456|

Scenario Outline: As a Gym Owner I will be able to create Email templates so that I can reuse the message content while sending any Email

Given user is on dashboard page
Then Click on the setup menu which is in the top right side
Then Click on Email Templates
Then Email Template page should be displayed
Then Click on Create an Email Template button
Then Enter Title <title>
Then Enter Subject <subject>
Then Enter Message <message>
Then Click on Save

Examples:
|title|subject|message|
|'Test'|'Test'|'Test'|