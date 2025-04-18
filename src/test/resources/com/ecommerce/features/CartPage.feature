Feature: Cart Page Functionality

  @addtocart
  Scenario: Add product to cart
    Given I am on the product page
    When I select a product from the Men's category
    Then I should be navigated to product details page
    When I add the product to cart
    Then I should see the product added to the cart successfully
    
    
  @addmultipleproducts
  Scenario: Add multiple products to the cart
    Given I am on the product page
    When I select product from the Women's category
    When I add multiple products to the product to cart
    Then I should see the multiple products added to the cart successfully

  @addmultipleproducts1
  Scenario: Add multiple products to the cart
    Given I am on the product page
    When I select first product from the Women's category
    Then I should be navigated to product details page
    When I add the first product to the cart
    Then I should see the product added to the cart successfully
    When I navigate back to product details page
    Then I should be navigated to the product details page
    When I navigate back to product page
    Then I should be navigated to product page
    When I select second product from the Women's category
    Then I should be navigated to product details page1
    When I add the second product to the cart
    Then I should see the 2 products added to the cart successfully

  @multipleproducts
Scenario Outline: Add multiple products to the cart
  Given I am on the product page
  When I select "<ProductName>" from the Women's category
  Then I should be navigated to the product details page
  When I add the product to the cart
  Then I should see the product added to the cart successfully

Examples: 
  | ProductName     |
  | Gown            |
  | Anarkali kurta  |

