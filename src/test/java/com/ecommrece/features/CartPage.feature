Feature: Cart page functionality

@addproduct
Scenario: Add product to the cart
Given The user on the product page
When User click on product link
Then User navigated to the product details page
When User click on add to cart button
Then User should see item add to cart
When User click on view cart button
Then User navigated to the cart page
And User should see item in cart
