Feature: smoke
As a owner I want to check that
  when a user enters an invalid value
     "the error message is displayed"

  Scenario Outline: Error message is displayed upon registration with invalid email pattern
    Given Github '<homePage>' is opened
    When user enters '<email>' into email field
    Then error message below email field should be displayed
    Examples:
      | homePage           |  email     |
      | https://github.com | invalid123 |

 Scenario Outline: message under password field indicates a completeness of password requirements
   Given Github '<homePage>' is opened
   And user enters valid '<email>' into email field
   When user enters '<password1>' into password field
   Then “at least 15 characters” message should be marked red
   When user enters '<password2>' into password field
   Then “at least 15 characters” message should be marked red

  Examples:
    | homePage           |  email             | password1 | password2 |
    | https://github.com | ZzXxCcVv@gmail.com | AAA       | AAAaaa    |

  Scenario Outline: error message is displayed upon registration with already existent username
    Given Github '<homePage>' is opened
    And user enters valid '<email>' into email field
    When user enters '<password>' into password field
    When user enters already existent '<name>' into username field
    Then suggested usernames in error message contains the username entered
    Examples:
      | homePage           |  email          | password          | name |
      | https://github.com | xCcVv@gmail.com | Qwerasdfzxcv12345.| zubr |