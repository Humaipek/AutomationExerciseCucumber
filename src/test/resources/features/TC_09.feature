@TC09
  Feature: Automation Exercise
    Scenario: TC09 Search Product
      Given Navigate to url
      Then Verify that home page is visible successfully
      When Click on 'Products' button
      Then Verify user is navigated to ALL PRODUCTS page successfully
      When Enter product name in search input and click search button
      Then Verify 'SEARCHED PRODUCTS' is visible
      Then Verify all the products related to search are visible
