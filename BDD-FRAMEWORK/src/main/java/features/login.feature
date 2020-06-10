Feature: Free CRM Login Feature

Scenario: Successfull Login Test Functionality
Given User is on Login Page
When Title of the page is Free CRM
Then User enter Name and Password
Then User click on Login Button
And User is on Home

Scenario Outline: Search in google
Given User is on search Page
When User enters <Search>

Examples:
|Search|
|chrome|
|BDD|
