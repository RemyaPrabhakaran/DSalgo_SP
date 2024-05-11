Feature: Linked list

  Scenario: The user is on the linked list page
    Given The user is on the datastructure homepage after signin
    When The user clicks Get Started button below linkedlist
    Then The user should navigated to linkedlist page

  Scenario: The user is on the Introduction page
    Given The user is on the Linked List page
    When The user clicks Introduction link
    Then The user should be redirected to Introduction page

  Scenario: Creating linked list
    Given The user is on the Linked List page
    When The user clicks Creating Linked List link
    Then The user should be redirected to Creating linked list page

  Scenario: The user is on the Types of Linked List page
    Given The user is on the Linked List page
    When The user clicks Types of Linked List link
    Then The user should be redirected to Types of Linked List page

  Scenario: The user is on the Implement Linked List in Python page
    Given The user is on the Linked List page
    When The user clicks Implement Linked List in Python link
    Then The user should be redirected to Implement Linked List in Python page

  Scenario: The user is on the Traversal page
    Given The user is on the Linked List page
    When The user clicks Traversal link
    Then The user should be redirected to Traversal page

  Scenario: The user is on the Insertion page
    Given The user is on the Linked List page
    When The user clicks Insertion link
    Then The user should be redirected to Insertion page

  Scenario: The user is on the Deletion page
    Given The user is on the Linked List page
    When The user clicks Deletion link
    Then The user should be redirected to Deletion page

  Scenario Outline: Try Here Page Navigation
    Given The user is in the <pagelink> Page
    When The user clicks Try Here button in <pagelink> page
    Then The user should be directed to Editor Page in Linkedlist

    Examples: 
      | pagelink                        |
      | Introduction                    |
      | Creating Linked LIst            |
      | Types of Linked List            |
      | Implement Linked List in Python |
      | Traversal                       |
      | Insertion                       |
      | Deletion                        |
