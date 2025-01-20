Feature: User Login Functionality

#Scenario: Valid Login
#Given User is on Login Page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then Should display home page

#Scenario: Valid Login
#Given User is on Login Page
#When User enters "tomsmith1" and "SuperSecretPassword1"
#Then Should display home page

#Scenario Outline: Valid Login
#Given User is on Login Page
#When User enters "<username>" and "<password>"
#Then Should display home page

#Examples:
#|username | password |
#|tomsmith | SuperSecretPassword|
#|tomsmith1| SuperSecretPassword1|
#|tomsmith2| SuperSecretPassword1|


Scenario: Valid Login
Given User is on Login Page
When User enters credentials
 |username | password |
 |tomsmith | SuperSecretPassword!|
Then Should display home page
| you logged into a secure area!|


