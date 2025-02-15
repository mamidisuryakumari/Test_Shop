Feature: Cart page functionality

  Background: 
    Given The user on the product page
    When The page loads
    And select the category from menu
    Then The user should see list of products
    And Each product should display the name,price and image

@Regression
  Scenario: Add product to the cart
    When User click on product link
    Then User navigated to the product details page
    When User click on add to cart button
    Then User should see item add to cart
    When User click on view cart button
    Then User navigated to the cart page
    And User should see item in cart

@Regression
  Scenario: Remove items from cart
    When User click on product link
    Then User navigated to the product details page
    When User click on add to cart button
    Then User should see item add to cart
    When User click on view cart button
    Then User navigated to the cart page
    And User should see item in cart
    When User click on remove button
    Then User should see item remove from the cart

@Regression
  Scenario: Increase product quantity at cart page
    When User click on product link
    Then User navigated to the product details page
    When User click on add to cart button
    Then User should see item add to cart
    When User click on view cart button
    Then User navigated to the cart page
    And User should see item in cart
    When User click on add button
    Then User should see item count increased in cart

 @Regression
  Scenario: Decrease product quantity at cart page
    When User click on product link
    Then User navigated to the product details page
    When User click on add to cart button
    Then User should see item add to cart
    When User click on view cart button
    Then User navigated to the cart page
    And User should see item in cart
    When User click on add button
    Then User should see item count increased in cart
    When User click on remove button
    Then User should see item count decreased in the cart

  @Multipleproducts
  Scenario: Add two products to cart and count the product in cart
    When User click on product1
    Then User navigated to the product details page
    When User click on add to cart button
   Then User should see item add to cart
    When User click on navigate back button
    Then User should be navigated to product page
    When User click on product2
    Then User again navigated to the product details page
    When User click on add to cart button
    Then User should see two items added to cart
