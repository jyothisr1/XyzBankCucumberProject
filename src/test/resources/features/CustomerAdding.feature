Feature: Validating Bank manager page functionality

  Background:
    Given bank manager opens the website
    Then verify bank manager is on homepage
    When bank manager click on bank manager login
    Then verify bank manager is on admin page

  Scenario: verify adding customers by bank manager is working properly
    When bank manager click on add customer
    And  enters all the details of customer
    And  click on add customer
    Then verify success message is displayed
      | Customer added successfully with customer id : |

  Scenario: verify bank manager can open an account for an user already added
    When bank manager click on add customer
    And  enters all the details of customer
    And  click on add customer
    Then verify success message is displayed
      | Customer added successfully with customer id : |
    When bank manager click on open account
    And select customer name
    And select currency
    And click on process button
    Then verify success message is displayed
    |Account created successfully with account Number :|
