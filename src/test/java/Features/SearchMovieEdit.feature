Feature: Search character and edit page

  Scenario: request for a random movie from swapi using theStar Wars
    Given I am an user at the Wikipedia WebPage requesting SW movie
    When I search the requested movie name on Wikipedia search
    And go to the article page and click on the Edit Link
    Then Check the edit page is displayed correctly, including the matching of the title for the article page

