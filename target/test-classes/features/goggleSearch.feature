Feature: Goggle Search Functionality
  Agile story: AS a user, When i am on the Google search Page I Should be able to search whatever
  i want and see relevant information

  Scenario: search page title verification
    When user is on Google search page
    Then user should see title is Google


    Scenario: search functionality result title verification
      Given user is on Google search page
      When user types apple and clicks enter
      Then user sees apple in the google title


  Scenario: search functionality result title verification
    Given user is on Google search page
    When user types "apple" and clicks enter
    Then user sees "apple" in the google title

