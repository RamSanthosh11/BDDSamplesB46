@Phaseone
Feature: Deals Activities

Create,Update,view and Delete Deals

Background:login into APP
Given User login into app


Scenario: Create a new Deals
When User create a new Deals
 
@RegressionTest    
Scenario: View Deals
When User view Deals
    
 @SmokeTest    
Scenario: Update Deals
When update Deals

@SmokeTest @RegressionTest         
Scenario: delete a Deals
When User delete a Deals
    
    
    
    