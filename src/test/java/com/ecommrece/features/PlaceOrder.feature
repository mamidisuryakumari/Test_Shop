Feature: Place order functionality
 
@test
 Scenario Outline: Verify product order is placed successfully
  Given I am on the product page
  When I  click on the productlink
  Then I navigated to the Product details page
  When I click on the add to cart button
  Then Item added to the cart 
  When I click on the view cart button
  Then I navigated to the cart page 
  And I should see item in the cart
	When I click on the proceed to checkout button
	When I navigated to checkout page
	When I enter address details "<YourName>"," <PhoneNumber>", "<StreetName>","<EmailAddress>","<Postcode>","<City>", "<State>","<Country>", "<OrderNotes>"
	And I click on Upi tranfer button
	And I click on confirm order button
	Then I should see place ored button enabled
	When I click on place order button 
	Then I navigated to order details page

	
	Examples:  
	       | YourName   | PhoneNumber | StreetName | EmailAddress           | Postcode|City        | State  | Country  | OrderNotes |
	       | Surya      | 9963563515  | ST colony  | Kumari.mudila@gmail.com|521321   |Nandivada   |Ap      |India     |test        |
	


  
	

	


