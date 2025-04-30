Feature: Bus booking on MakeMyTrip

  Scenario: Book a bus from Chennai to Bangalore
    Given I open the URL "https://www.makemytrip.com"
    And I close the pop-up window
    When I click on the "Buses" tab
    And I select "Chennai, Tamil Nadu" as the From location
    And I select "Bangalore, Karnataka" as the To location
    And I choose the travel date as the next available date
    And I click the Search Button
    Then I apply filters for "AC" and "Sleeper"
    And I select the "Single" checkbox
    And I choose "Sholinganallur" as the pick-up point
    And I select pick-up time between 6 PM and 11 PM
    And I choose travel operators "IntrCity SmartBus" and "Parveen Travels"
    And I choose "Lal Bagh" as the drop point
    And I select drop time between 11 PM and 6 AM
    And I get all the bus prices
    Then I print the bus prices in the console
    When I choose the cheapest bus and select any number of seats
    And I confirm the pick-up point as "Sholinganallur" and drop point as "Lal Bagh"
    And I click the Continue button
    Then I verify that the text "Payment options" is displayed
    And I take a screenshot of the payment page and save it
