@koala
Feature: US002_Koala_Add_New_User

  Scenario Outline: TC01admin adds new users information
    Given user is on the koalapalace page
    And user clicks on the login button
    When user enters username
    When user enters password
    And user clicks login button


    And user clicks on add user button
    Then verify create user text
    And user enters new "<username>" , "<password>", "<email>",  "<fullname>", "<phone no>" , "<ssn>"
    And user enters "<driving licence>", "<address>", "<working sector>"
    And User choses Country
    And user choses State
    And user choses Date of birth
    And user choses role
    And user clicks yes under approved area
    Then Verify no is not selected under approved area

    Examples:
      | username | password | email           | fullname    | phone no     | ssn         | driving licence | address   | working sector  |
      | mockuser | 12345    | abc@hotmail.com | Heten Keten | 123 321 1234 | 123 45 6789 | DL AZ 1234      | Utah Jazz | Test Automation |