Feature:  checkout valid product in ecommerce application

Scenario: Buy out thirty two inches sony smart television product

Given Open flipkart application using browser
When User enter username as saipattabhi18@gmail.com and password as Sai@2255 into the fields
And User clicks on the login button
When User clicks on the appliances
And User go the required product with specifications
And User sets the price range and see sony tv on the top of search results
And User clicks on the sonytv product and buyout
Then User should see sucessfully see light box of sucessfull delivery

