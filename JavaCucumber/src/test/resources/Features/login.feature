#Author
#Date
#Description

Feature: feature to the test login functionality

  Scenario: check login is successful with valid credential
    Given user is on login page
    When user enter username and password
    And click on login button
    Then User is navigate to homepage

 