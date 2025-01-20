@Phasetwo
Feature: Task Activities

Create,Update,view and Delete Task

  Scenario: Create a new task
    Given User login into app
    When User create a new task
    
@RegressionTest
Scenario: view new 
    Given User login into app
    When User view task
@SmokeTest    
Scenario: Update new 
    Given User login into app
    When User Update task
@SmokeTest @RegressionTest     
Scenario: Delete a new 
    Given User login into app
    When User delete a task
    