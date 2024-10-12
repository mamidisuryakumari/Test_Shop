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
Then User should see item added to the cart

@test3
Scenario Outline: Verify user checkout process from the product page to the checkout page
  Given The user on the product page
  When The page loads
  Then The user should see list of products
  And Each product should display the name,price and image
  When click on shoppingbag symbol
  Then User should see item added to the cart
  When User click on checkout button
  Then User should navigated to the checkout page
  When User enter address details "<YourName>"," <PhoneNumber>", "<StreetName>","<EmailAddress>","<Postcode>","<City>", "<State>","<Country>", "<OrderNotes>"
	And User click on Upi tranfer button
	And User click on confirm order button
	Then User should see place ored button enabled
	When User click on place order button 
	Then User navigated to order details page

	
	Examples:  
	       | YourName   | PhoneNumber | StreetName | EmailAddress           | Postcode|City        | State  | Country  | OrderNotes |
	       | Surya      | 9963563515  | ST colony  | Kumari.mudila@gmail.com|521321   |Nandivada   |Ap      |India     |test        |
	