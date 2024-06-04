@TC06
  Feature: Automation Exercise
    Scenario: TC06 Contact Us Form
      Given Navigate to url
      Then Verify that home page is visible successfully
      When Click on 'Contact Us' button
      Then Verify 'GET IN TOUCH' is visible
      When Enter name, email, subject and message
      And Upload file
      And Click 'Submit' button
      And Click OK button
      Then Verify success message 'Success! Your details have been submitted successfully.' is visible
      When Click 'Home' button and verify that landed to home page successfully
