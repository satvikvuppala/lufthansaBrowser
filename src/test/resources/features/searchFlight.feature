Feature: Search flight on browser

  Scenario: As a user I want to search flights in Lufthansa website on browser
    Given Browser is open and navigated to Lufthansa website
    When User selects trip type
    And User selects From city
    And User selects To city
    And User selects date
    And User selects selects passenger number
    And User selects travel class
    And User clicks on Search Flights
    Then User taken to Flight list page
