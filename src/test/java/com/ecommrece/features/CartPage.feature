Feature: Cart page functionality

@test4
Scenario: Add product to the cart
Given The user on the product page
When User click on product link
Then User navigated to the product details page
When User click on add to cart button
Then User should see item add to cart
When User click on view cart button
Then User navigated to the cart page
And User should see item in cart

@test5
Scenario: Remove items from cart
Given The user on the product page
When User click on product link
Then User navigated to the product details page
When User click on add to cart button
Then User should see item add to cart
When User click on view cart button
Then User navigated to the cart page
And User should see item in cart
When User click on remove button 
Then User should see item remove from the cart

