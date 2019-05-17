@sanity @third
Feature: Login to flight application and book a flight



  Scenario: Register User
    Given That I Click on Register link
    Then I fill username and password
    And when I click on submit
    Then Registration should be successful

  #Scenario: Book a flight
  #  Given That I perform registration
  ##  Then I login to application
 #   And I click on Flights
  #  And Book a flight from "New York" to "London"
  #  Then flight should be booked successfully