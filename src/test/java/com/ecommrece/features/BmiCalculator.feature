Feature: BMI Calculator

@happy-path1
Scenario Outline: Successful BMI Calculation
Given The user on the homepge
When The user click on Practise selenium menu
Then The user scrolls down to page
When The user click on BMI calculator link
Then User should be navigated to BMI calculator page
When The user enter details "<Feet>","<Inches>","<Weight>","<Age>"
And The user click on male button
And The user clicks on the Calculate BMI button
Then The system displays the correct BMI value with the category

Examples: 
 |Feet|Inches|Weight|Age|
 |5   |3     |70    |33|