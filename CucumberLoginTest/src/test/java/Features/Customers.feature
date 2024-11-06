Feature: Customers
Scenario: Add a new customer
Given Open Chrome Browser
And User opens the URL "https://admin-demo.nopcommerce.com/login"
When User enters email "<emailid>" and password "<password>"
And Click on "Login" button
Then User can view Dashboard
When User click on Customers option
And Click on Customers Menu Item
And Click on Add new button
Then User can view Add new customer page
When User enter Customers Info
And Click on Save button
Then User can view confirmation message "The new customer has been added successfully"
And User close the browser