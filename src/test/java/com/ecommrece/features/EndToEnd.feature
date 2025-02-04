Feature: End to end functionality

  @Test01
  Scenario Outline: Verify the user is item purchased from mens footwear
    Given The user on the homepge
    When The user click on the Practise selenium menu
    Then The user scrolls down to the page
    When The User click on the testshop link
    Then The User should be navigated to the product page
    When The User select men footware from men menu
    Then The user should see list of products
    When The User click on men comfortable product link
    Then User navigated to the product details page
    When User click on add to cart button
    And User should see item added to the cart
    When User click on view cart button
    Then User navigated to the cart page
    And User should see item in cart
    When User click on proceed to checkout button
    Then User should navigated to the checkout page
    When User enter address details "<YourName>"," <PhoneNumber>", "<StreetName>","<EmailAddress>","<Postcode>","<City>", "<State>","<Country>", "<OrderNotes>"
    And User click on Upi tranfer button
    And User click on confirm order button
    Then User should see place ored button enabled
    When User click on place order button
    Then User navigated to order details page
    Then The User should see place ored button enabled
    When The User click on place order button
    Then The User navigated to order details page

    Examples: 
      | YourName | PhoneNumber | StreetName | EmailAddress            | Postcode | City      | State | Country | OrderNotes |
      | Surya    |  9963563515 | ST colony  | Kumari.mudila@gmail.com |   521321 | Nandivada | Ap    | India   | test       |

  @Test02
  Scenario: Item added to cart
    Given The user on the product page
    When select the category from menu
    Then The user should see list of products
    When User click on product link
    Then User navigated to the product details page
    When User click on add to cart button
    Then User should see item add to cart
    When User click on view cart button
    Then User navigated to the cart page
    And User should see item in cart

 