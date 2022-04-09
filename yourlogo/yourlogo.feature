Feature: Login functionality

@Test1
Scenario: Verify Signup with valid details 
    Given User launch the chrome browser
    When User navigates to the URL "http://automationpractice.com/index.php?controller=authentication&back=my-account"
    And User Enters EmailAddress as "saisrinivas123@gmail.com" and Password as "Srinu123"
    And Click on Signin button
    And Click on Women Menu
    And Add an item to wishlist
    And Click on your profile
    And Click on my wishlist
    And Remove an item from wishlist
    
@Test2   
Scenario: Verify Addto Cart with valid details 
    Given User launch the chrome browser
    When User navigates to the URL "http://automationpractice.com/index.php?controller=authentication&back=my-account"
    And User Enters EmailAddress as "saisrinivas123@gmail.com" and Password as "Srinu123"
    And Click on Signin button
    And Click on Tshirts Menu
    And Click on Added to Cart button
    And Click on Proceed to Checkout button
    And Navigate to HomePage
    And Click on your profile 
    And Click on Order History and Details
    
   
 

    
    
    
    