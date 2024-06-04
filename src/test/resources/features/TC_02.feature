@TC02
  Feature: Automation Exercise
    Scenario: TC02 Login User with correct 'email' and 'password'
      Given Navigate to url
      Then Verify that home page is visible successfully
      When Click on 'Signup  Login' button
      Then Verify 'Login to your account' is visible
      And Enter correct email address and password
      And Click 'login' button
      Then Verify that 'Logged in as username' is visible
      When Click 'Delete Account' button
      Then Verify that 'ACCOUNT DELETED!' is visible
