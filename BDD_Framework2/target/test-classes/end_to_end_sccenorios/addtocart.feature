Feature: add to cart

Scenario: choose the product add to cart

Given user opens the testUrl
When user search for the product "saree"
And user scroll down for perticular product 
And user click on the product 
And user click on cart button  
And user go to the electronics dropdown  
And user scroll down to color
And user click on color    
And user choose multicolor option 
And user go back to page
Then user close the application
