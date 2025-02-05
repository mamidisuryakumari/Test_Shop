Feature: BMI Calculator

@happy-path1
Scenario Outline: Successful BMI Calculation
Given The user on the homepge
When The user click on Practise selenium menu
Then The user scrolls down to page
When The user click on BMI calculator link
Then User should be navigated to BMI calculator page
When The user enter details "<Feet>","<Inches>","<Weight>","<Age>"
And The user click on female button
And The user clicks on the Calculate BMI button
Then The system displays the correct BMI value with the category

Examples: 
 |Feet|Inches|Weight|Age|
 |5   |3     |70    |33|
 
 @Error-case
 Scenario Outline: Missing height
Given The user on the homepge
When The user click on Practise selenium menu
Then The user scrolls down to page
When The user click on BMI calculator link
Then User should be navigated to BMI calculator page
When The user leaves the height fields empty
And  The user enter input valid details "<Weight>","<Age>"
And The user click on female button
And The user clicks on the Calculate BMI button
Then The system displays an error message, "Please enter a valid height."

Examples: 
|Weight|Age|
|70    |33 |

 @Error-case2
 Scenario Outline: Missing weight
Given The user on the homepge
When The user click on Practise selenium menu
Then The user scrolls down to page
When The user click on BMI calculator link
Then User should be navigated to BMI calculator page
When The user leaves the weight field empty
And  The user enter input valid details "<Feet>","<Inches>","<Age>"
And The user click on female button
And The user clicks on the Calculate BMI button
Then The system displays an error message is Please enter a valid weight between 20 kg and 300 kg

Examples: 
|Feet|Inches |Weight|Age|
| 5  |3      |      |33 |