   @TC25
  Feature: Automation Exercise
    Scenario: TC25   Verify Scroll Up using 'Arrow' button and Scroll Down functionality
      Given Navigate to url
      Then Verify that home page is visible successfully
      When Scroll to bottom of page
      Then Verify text 'SUBSCRIPTION'
      When Click on arrow at bottom right side to move upward
      Then Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen