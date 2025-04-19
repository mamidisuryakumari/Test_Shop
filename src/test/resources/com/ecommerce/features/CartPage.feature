Feature: Cart Page Functionality

  @addsingleproduct
  Scenario: Add single product to cart
    Given I am on the product page
    When I select single product 
    Then I should be navigated to product details page
    When I add the product to cart
    Then I should see the product added to the cart successfully
    
    
  @addmultipleproducts
  Scenario: Add multiple products to the cart
    Given I am on the product page
    When I select and add multiple products to the cart
    Then I should see the multiple products added to the cart successfully

  @addmultipleproducts1
  Scenario: Add multiple products to the cart
    Given I am on the product page
    When I select first product
    Then I should be navigated to product details page
    When I add the first product to the cart
    Then I should see the product added to the cart successfully
    When I navigate back to product page
    Then I should be navigated to product page
    When I select second product
   Then I should be navigated to product details page
    When I add the second product to the cart
    Then I should see the 2 products added to the cart successfully

  @multipleproducts
Scenario Outline: Add multiple products to the cart
  Given I am on the product page
  When I select "<ProductName>" 
  Then I should be navigated to the product details page
  When I add the product to the cart
  Then I should see the product added to the cart successfully

Examples: 
  | ProductName     |
  | Gown            |
  | Anarkali kurta  |

