@TC10
  Feature: Automation Exercise
    Scenario: TC10 Verify Subscription in home page
      Given Navigate to url
      Then Verify that home page is visible successfully
      When Scroll down to footer
      Then Verify text 'SUBSCRIPTION'
      When Enter email address in input and click arrow button
      Then Verify success message 'You have been successfully subscribed!' is visible
