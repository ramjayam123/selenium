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
    Then I print the bus prices in the console
    When I choose the cheapest bus and select any number of seats
    And  Select Pick up point "Sholinganallur" and  Drop point " Lal Bagh"
    And I click the Continue button
    When I enter the traveller details with name "John Doe", age "30", and gender "Male"
    And I enter the contact details with email "john.doe@example.com" and mobile number "1234567890"
    And I select the state "Tamil Nadu"
    And I select the checkbox to confirm and save billing details to my profile
    And I select a coupon code radio button if available
    And I click on the Continue button
     And I take a screenshot of the payment page and save it
    And I take a screenshot of the payment page and save it


#Feature: 
  #Bookcart application demo
   #Then I verify that the text "Payment options" is displayed
#
  #Scenario: 
    #Login should  be success
#
    #Given User should naviagate to the application
    #When User click on the login button
    #And User enter the username as "ramajayam" 
#
    #And User enter the password as "jayam123"
    #And User click the login button
    #Then login should be success
