Feature: Dress Order In Automation Practice Application

Scenario: Home Functionality
Given user Launch The Application
Then user Click On The SignIn Button And It Navigates To The Login Page

Scenario: Login Functionality
When user Enter The Username In The Username Field
And user Enter The Password In The Password Field
Then user Click On The SignIn Button And It Navigates To The Purchase Page

Scenario: Purchase Functionality
When user Move The Cursor To The Women 
Then user Click The Evening Dress And It Navigates To The Evening Dress Page

Scenario: Evening Dress Functionality
When user Move The Cursor To The Image
And user Click On The Quick View Button And It Navigates To The Frame
And user Will Switch To The Frame
And user Click On The Quantity Button
And user Click On The Size Button
And user Click On The Color Button
And user Click On The Add To Cart Button
Then user Click On The Proceed To Checkout Button And It Navigates To The Summary Page

Scenario: Summary Functionality
When user Click On The Proceed To Checkout Button And It Navigates To The Address Page

Scenario: Address Functionality
When user Click On The Proceed To Checkout Button And It Navigates To The Shipping Page

Scenario: Shipping Functionality
When user Click On The Radio Button
Then user Click On The Proceed To Checkout Button And It Navigates To The Payment Page

Scenario: Payment Functionality
When user Click On The Pay By Bank Wire And It Navigates To The Confirm Order Page

Scenario: Confirm Order Page Functionality
When user Click On The Confirm Order
Then user View The WebTable And It Navigates To The Payment Signout Page

Scenario: Payment Signout Page
When user Click On The SignOut Button



