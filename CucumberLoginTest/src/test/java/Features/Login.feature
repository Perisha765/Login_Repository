Feature: Login Test Functionality

Scenario Outline: Login Test
Given Open Chrome Browser
And User opens the URL "https://admin-demo.nopcommerce.com/login"
When User enters email "<emailid>" and password "<password>"
And Click on "Login" button
Then Page title should be "Dashboard \ nopCommerce administration"
When User click on Logout link
Then Page title should be "Your store. Login"
And Close the browser

Examples: 
| emailid 								| password |
|	admin@yourstore.com			|	admin		 |
| admin123@yourstore.com	|	admin		 |