package stepDefs;

import org.testng.annotations.Test;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CRMStepDef {
	
	@Before(order=1)
	public void setup() {
		System.out.println("Setup Chrome Browser");
		
	}
	@Before(order=2)
	public void setupBrowser() {
		System.out.println("setup edge browser");
		
	}
	@Before(order=3)
	public void setupBrowse1r() {
		System.out.println("setup mozilla browser");
		
	}
	/*
	@AfterAll
	public static void teardown() {
		System.out.println("After All Scenarios....");
		
	}
	@After
	public static void closebrowser() {
		System.out.println("After each Scenario....");
		
	}
	*/
	
	
	
	@Given("User login into app")
	public void user_login_into_app() {
		System.out.println("login in to app");
		
	}
    
	@When("User create a new Deals")
	public void user_create_a_new_deals() {
		System.out.println("create a new deals...");
	}	
	@When("User view Deals")
	public void user_view_deals() {
		System.out.println("view deals...");
	}
	@When("update Deals")
	public void update_deals() {
		System.out.println("Update deals...");
	}
	@When("User delete a Deals")
	public void user_delete_a_deals() {
		System.out.println("delete a deals");
	}
	
	    
	@When("User create a new task")
	public void user_create_a_new_task() {
		
		System.out.println("create a new task");
	   
	}
	
	@When("User view task")
	public void user_view_task() {
		
		System.out.println("View a task....");
	    
	}
	@When("User Update task")
	public void user_update_task() {
		
		System.out.println("Update a task...");
	    
	}
	@When("User delete a task")
	public void user_delete_a_task() {
		
		System.out.println("delete a task...");
		
		}
	}
