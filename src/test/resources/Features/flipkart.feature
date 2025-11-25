Feature: To validate the Flipkart functionality

@tc001 @smoke
Scenario: To validate the search functianlity
Given To launch the browser and enter url
When Enter text in the Search field
Then Search result should get displayed
And Take screenshot and close browser

@tc002 @smoke
Scenario Outline: To test the search functianlity with diffrent values
Given  Launch the browser and enter url
When Enter "<text>" in the Search field
Then Search result should be displayed
Then Verify the reult
And Take  the screenshot and close  the browser

Examples:
|text|
|Mobiles|
|Tshirt|
|Tv|
|Bottles|