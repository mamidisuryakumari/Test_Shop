Feature: Product page functionality

@test1
Scenario:  User views the list of products
Given The user on the product page
When The page loads
Then The user should see list of products
And Each product should display the name,price and image

@test2
Scenario: User adds item to cart
Given The user on the product page
When The page loads
Then The user should see list of products
And Each product should display the name,price and image
When click on shoppingbag symbol
Then I should see item added to the cart

