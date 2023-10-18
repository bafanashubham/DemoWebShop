Feature: Validate deskstop

  @tag4
  Scenario: Validate deskstop
    Given user navigate to "https://demowebshop.tricentis.com/"
    When user click on login link
    And user enter email id "Shubh1435@gmail.com"
    And user enter password "Test@12"
    And user click on Login button
    When user mouse over on computers
    Then user clicks on Desktop
    And User sorts the desktop by name A to Z
    When User clicks on expensive computer
    Then User clicks on add to compare list
    Then User clicks on logout button
