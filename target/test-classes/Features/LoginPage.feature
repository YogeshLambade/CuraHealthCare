Feature: Login to Healthcare Site Functionality

  Background: Working of Make Appointment functionality
    Given open the browser
    And User is on Home Page
    When User Click on Make Oppointment
    Then user go to login page

  Scenario Outline: Check login succesfull with valid credentials
    When user enters <username> and <password>
    And user click on login
    Then user navigated to book Appointment page

    Examples: 
      | username | password           |
      | John Doe | ThisIsNotAPassword |

  Scenario: Check the Make Appointment with Valid Credentials
    When user is on Make Appointment Page
    And user select the facility from dropdown
    And user select checkbox apply for hospital readmission
    And user select Medicaid radio button
    And user select the date
    And user add comment to the box
    And user click on book appointment
    Then user navigated to success page
