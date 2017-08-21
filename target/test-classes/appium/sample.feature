Feature: Wordpress test
  In order check my posts
  As a User
  I need a page to view my posts

  Scenario: Created brand selectable for a product
    Given I am on the wordpress app
    Then I should see my wordpress account page
    When I navigate to the "pages" section
    Then I should see my posts