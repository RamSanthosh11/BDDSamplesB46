@Phaseone
Feature: Deals Activities

Create,Update,view and Delete Deals

Scenario: Create a new Deals
Given User login into app
When User create a new Deals
 
@RegressionTest    
Scenario: View Deals
Given User login into app
When User view Deals
    
 @SmokeTest    
Scenario: Update Deals
Given User login into app
When update Deals

@SmokeTest @RegressionTest         
Scenario: delete a Deals
Given User login into app
When User delete a Deals
    
    
    
    