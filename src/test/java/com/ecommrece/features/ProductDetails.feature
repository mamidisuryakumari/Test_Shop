Feature: Product details page functionality

  @Regression
  Scenario Outline: Verify checkout process from product details page to checkout page
    Given The user on the product page
    When The page loads
    And select the category from menu
    Then The user should see list of products
    And Each product should display the name,price and image
    When User click on product link
    Then User navigated to the product details page
    When User click on add to cart button
    And User should see item added to the cart
    When User click on proceed to checkout button
    Then User should navigated to the checkout page
    When User enter address details "<YourName>"," <PhoneNumber>", "<StreetName>","<EmailAddress>","<Postcode>","<City>", "<State>","<Country>", "<OrderNotes>"
    And User click on Upi tranfer button
    And User click on confirm order button
    Then User should see place ored button enabled
    When User click on place order button
    Then User navigated to order details page

    Examples: 
      | YourName | PhoneNumber | StreetName | EmailAddress            | Postcode | City      | State | Country | OrderNotes |
      | Surya    |  9963563515 | ST colony  | Kumari.mudila@gmail.com |   521321 | Nandivada | Ap    | India   | test       |
