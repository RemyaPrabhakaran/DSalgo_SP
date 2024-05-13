Feature: Tree Datastructure

  Scenario: Tree Datastructure Tree home page
    Given The user is on the Tree page
    When The user clicks Overview of Trees link
    Then The user should be redirected to Overview of Trees page

  Scenario Outline: Pages in Tree Page Validation
    Given The user is in the Tree page after logged in
    When The user clicks <page link>
    Then The user should be directed to <page link> Page

    Examples: 
      | page link                    |
      | Overview of Trees            |
      | Terminologies                |
      | Types of Trees               |
      | TraversalsIllustration       |
      | Binary Trees                 |
      | Types of Binary Trees        |
      | Implementation in Python     |
      | Binary Tree Traversals       |
      | Applications of Binary trees |
      | Binary Search Trees          |
      | Implementation of BST        |

  Scenario Outline: Tryhere page with valid pythoncode
    Given The user is in the <page link>try Editor Page
    When The User writes Valid python code and clicks Run button in Tree
    Then User is able to see the output in console in Tree try editor page

    Examples: 
      | page link                    |
      | Overview of Trees            |
      | Terminologies                |
      | Types of Trees               |
      | TraversalsIllustration       |
      | Binary Trees                 |
      | Types of Binary Trees        |
      | Implementation in Python     |
      | Binary Tree Traversals       |
      | Applications of Binary trees |
      | Binary Search Trees          |
      | Implementation of BST        |

  Scenario Outline: Try Here with Invalid Python Code
    Given The user is in the <page link> try Editor Page
    When The User writes invalid python code and clicks Run button in Tree
    Then User is able to see the error msg in pop up window in Tree Try Editor Page
    Then The user click the ok button in the alert window in Tree Try Editor Page
    Then The user is on the same page having Editor and Run button in Tree Try Editor Page

    Examples: 
      | page link                    |
      | Overview of Trees            |
      | Terminologies                |
      | Types of Trees               |
      | TraversalsIllustration       |
      | Binary Trees                 |
      | Types of Binary Trees        |
      | Implementation in Python     |
      | Binary Tree Traversals       |
      | Applications of Binary trees |
      | Binary Search Trees          |
      | Implementation of BST        |

  Scenario Outline: Verify Practice Questions Page in all links
    Given The user is in the <page link> Page
    When The user clicks Practice Questions in <page link> Page
    Then The user should be directed to Practice Questions page of Tree

    Examples: 
      | page link                     |
      | Overview of Trees            |
      | Terminologies                |
      | Types of Trees               |
      | TraversalsIllustration       |
      | Binary Trees                 |
      | Types of Binary Trees        |
      | Implementation in Python     |
      | Binary Tree Traversals       |
      | Applications of Binary trees |
      | Binary Search Trees          |
      | Implementation of BST        |
