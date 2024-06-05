@TC11
  Feature: Automation Exercise
    Scenario: TC11 Verify Subscription in Cart page
      Given Navigate to url
      Then Verify that home page is visible successfully
      When Click 'Cart' button
      And Scroll down to footer
      Then Verify text 'SUBSCRIPTION'
      When Enter email address in input and click arrow button
      Then Verify success message 'You have been successfully subscribed!' is visible
