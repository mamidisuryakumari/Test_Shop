Feature: Windowhandle functionality

@windowHandle
Scenario: Verify windowhandle
Given The user on the homepge
When The user click on Practise selenium menu
Then The user scrolls down to page
When The user click on handle multiple windows link
Then The user should be navigated to window handle page
When The user click on open single window button 
Then The user should be see testshop window is opened

@WindowHandle1
Scenario: Verify windowhande1
Given The user on the homepge
When The user click on Practise selenium menu
Then The user scrolls down to page
When The user click on handle multiple windows link
Then The user should be navigated to window handle page
When The user click on open two windows button 
Then the user should see google window is opened

