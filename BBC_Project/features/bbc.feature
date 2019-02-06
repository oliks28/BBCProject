Feature: Menu Items in BBC site
 
Scenario: Validate the menu items in the BBC site
 Given User is  opens the chrome browser and enter the BBC site URL
 And  User navigates to the BBC home page 
 When User verified the number of menu items present on the BBC site Home Page
 Then User exit from the application