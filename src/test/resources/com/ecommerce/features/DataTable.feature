Feature: End to end functionality

 @Test03
  Scenario: Verify the user is item purchased from mens footwear
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
    When User enter address details
      | YourName     | Surya                   |       
      | PhoneNumber  |              9963563515 |       
      | StreetName   | ST colony               |       
      | EmailAddress | Kumari.mudila@gmail.com |       
      | Postcode     |                  521321 |       
      | City         | Nandivada               |       
      | State        | Ap                      |       
      | Country      |  India                  |  
      | OrderNotes   | test                    |       
