@TC04
  Feature: Automation Exercise
    Scenario: TC04 Logout User
      Given Navigate to url
      Then Verify that home page is visible successfully
      When Click on 'Signup  Login' button
      Then Verify 'Login to your account' is visible
      When Enter correct email address and password
      And Click 'login' button
      Then Verify that 'Logged in as username' is visible
      When Click 'Logout' button
      Then Verify that user is navigated to login page
