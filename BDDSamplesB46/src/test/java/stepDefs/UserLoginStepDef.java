package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserLoginStepDef {
	
	
	WebDriver driver;
	@Given("User is on Login Page")
	public void user_is_on_login_page() {
		
		  
		  driver =new ChromeDriver();
		  driver.get("https://the-internet.herokuapp.com/login");
		  driver.manage().window().maximize();
	   
	}

	@When("User enters credentials")
	public void user_enters_credentials() {
		  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
		  driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
	    
	}

	@Then("Should display home page")
	public void should_display_home_page() {
		
		driver.findElement(By.cssSelector("button.radius")).click();
	    
	}


}
