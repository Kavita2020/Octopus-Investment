Feature: Octopus Investments

  Scenario Outline: Search people and verify the result
    Given user is on the main page
    When user click on the search bar
    And user enter "<name>" in search field
    Then user should able to see name "<name>" at result

    Examples:
      | name                |
      | Alistair Seabright  |
      | Charles Street      |
      | Charlotte Fairhurst |

  Scenario Outline: Verify profile of person after clink on his image
    Given user is on the main page
    When user click on the person image"<image>"
    Then user should able to see the profile of "<image>"
    Examples:
      | image               |
      | Alistair Seabright  |
      | Charles Street      |
      | Charlotte Fairhurst |


  Scenario: Verify and sort by Z-A
    Given user is on the main page
    When user click on sort by Z to A
    Then user shoule see the list in descending order
    When user click on sort by A to Z
    Then user should see the list in ascending order

