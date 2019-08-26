@BookingPage
Feature: I want to verify the booking page functionality
  @AddBooking
  Scenario: I add a new booking on Hotel booking form
    Given I navigate to url "http://hotel-test.equalexperts.io"
     When I fill the form with booking details
     And I click save button
     Then I verify that booking has successfully added

  @DeleteBooking
  Scenario: I want to delete an existing booking
    Given I navigate to url "http://hotel-test.equalexperts.io"
    When I click Delete button of last booking
    Then I verify that the booking has successfully deleted