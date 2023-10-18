Feature: Validate giftcard

  @tag3
  Scenario: Validate giftcard
    Given user navigate to "https://demowebshop.tricentis.com/"
    When user click on login link
    And user enter email id "Shubh1435@gmail.com"
    And user enter password "Test@12"
    And user click on Login button
    When user navigates to Gift cards
    Then user clicks on any one physical gift card
    And user enters Recepients name "ABS" and Message "Diwali gifts"
    Then user clicks on Email a friend button
    And user enters Friend's email "ABS@gmail.com"
    Then user clicks on send email button
    Then user verifys message obtain
