package stepDefs;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
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
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	   
	}
	/*
	//using the list of list
	@When("User enters credentials")
	public void user_enters_credentials(DataTable dataTable) {
		List<List<String>> user =dataTable.asLists();
		String struser = user.get(0).get(0);
		String strpwd = user.get(0).get(1);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(struser);
		  driver.findElement(By.name("password")).sendKeys(strpwd);
		  driver.findElement(By.cssSelector("button.radius")).click();

	}
	*/
	
	//using the list of Maps
		@When("User enters credentials")
		public void user_enters_credentials(DataTable dataTable) {
			List<Map<String,String>> user =  dataTable.asMaps();
			String struser = user.get(0).get("username");
			String strpwd = user.get(0).get("password");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(struser);
			  driver.findElement(By.name("password")).sendKeys(strpwd);
			  driver.findElement(By.cssSelector("button.radius")).click();

		}

	
/*
	@When("User enters credentials")
	public void user_enters_credentials() {
		  driver.findElement(By.xpath("//input[@id='username']")).sendKeys("tomsmith");
		  driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
	    
	}
	*/

//	@When("User enters {string} and {string}")
	//public void user_enters_and(String struser, String strpwd) {
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys(struser);
		  //driver.findElement(By.name("password")).sendKeys(strpwd);
	//}

	@Then("Should display home page")
	public void should_display_home_page(DataTable dataTable) {
		
		List<List<String>> data =dataTable.asLists();
		String expMsg = data.get(0).get(0);
		WebElement msg = driver.findElement(By.cssSelector("div.success"));
		String actMsg = msg.getText();
		System.out.println("Actual msg...."+actMsg);
		Assert.assertEquals(actMsg,expMsg);
		
		
		
		
	    
	}


}
