Feature: SauceDemo Login Testing Functionality


Scenario Outline: SauceDemo Login is successful 
Given User is on login page
When User enters username "<Username>" and password "<Password>"
And Click on Login button
Then User is navigated to Homepage
And Close the browser

Examples: 
| Username 								| Password		 |
|	standard_user						|	secret_sauce |
|	locked_out_user					|	secret_sauce |
|	problem_user						|	secret_sauce |
|	performance_glitch_user	|	secret_sauce |

Scenario: Adding Products
Given User is on login page
When User enters username "standard_user" and password "secret_sauce"
And Click on Login button
Then User is navigated to Homepage
And Click on ADD TO CART for selected products
Then Click on Cart to see the items added
And Click on Checkout

