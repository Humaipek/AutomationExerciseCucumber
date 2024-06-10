   @TC26
  Feature: Automation Exercise
    Scenario: TC26   Verify Scroll Up using 'Arrow' button and Scroll Down functionality
      Given Navigate to url
      Then Verify that home page is visible successfully
      When Scroll to bottom of page
      Then Verify text 'SUBSCRIPTION'
      When Scroll up page to top
      Then Verify that page is scrolled up and 'Full-Fledged practice website for Automation Engineers' text is visible on screen