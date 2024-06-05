@TC18
  Feature: Automation Exercise
    Scenario: TC18  View Category Products
      Given Navigate to url
      Then Verify that categories are visible on left side bar
      When Click on 'Women' category
      And Click on any category link under 'Women' category, for example: Dress
      Then Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'
      When On left side bar, click on any sub-category link of 'Men' category
      Then Verify that user is navigated to that category page
