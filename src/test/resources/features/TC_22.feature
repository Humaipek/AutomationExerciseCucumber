   @TC21
  Feature: Automation Exercise
    Scenario: TC21   Add review on product
      Given Navigate to url
      When Click on 'Products' button
      Then Verify user is navigated to ALL PRODUCTS page successfully
      And Click on 'View Product' button
      Then Verify 'Write Your Review' is visible
      When Enter name, email and review
      And Click 'Submit' button review
      Then Verify success message 'Thank you for your review.'
