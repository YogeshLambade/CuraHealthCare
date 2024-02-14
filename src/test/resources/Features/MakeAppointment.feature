Feature: To Check Make Appointment Functionality

  Scenario: Check the Make Appointment with Valid Credentials
    Given open the browser
    And User is on Home Page
    When User Click on Make Oppointment
    Then user is on login page
    And user enter username as "John Doe" and password as "ThisIsNotAPassword"
    And Click on login button
    Then user is on Make Appointment Page
    And user select "Hongkong CURA Healthcare Center" from facility drpdown 
    And user select checkbox apply for hospital readmission
    And user select Medicaid radio button
    And user select the date "21/02/2024"
    And user add comment to the box as "Appointment Booked"
    And user click on book appointment
    Then user navigated to Appointment confirmation page
