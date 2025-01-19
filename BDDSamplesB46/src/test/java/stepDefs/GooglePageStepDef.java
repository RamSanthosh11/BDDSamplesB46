package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GooglePageStepDef {
	WebDriver driver;
	@Given("User is on Google Page")
	public void user_is_on_google_page() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		  driver.get("https://www.bing.com/");
	 
	}
	@When("User Enters Selenium Tutorial")
	public void user_enters_selenium_tutorial() throws InterruptedException {
		WebElement searchBox = driver.findElement(By.id("sb_form_q"));
		  searchBox.sendKeys("Selenium Tutorial");
		  searchBox.submit();
	    
	}
	@Then("Should display Selenium result page")
	public void should_display_selenium_result_page() {
		
		Assert.assertEquals(driver.getTitle(), "Selenium Tutorial - Search");


	}
	
	@When("User Enters Java Tutorial")
	public void user_enters_java_tutorial() {
		WebElement searchBox = driver.findElement(By.id("sb_form_q"));
		  searchBox.sendKeys("Java Tutorial");
		  searchBox.submit();
	    
	    
	}
	@Then("Should display Java result page")
	public void should_display_java_result_page() {

		Assert.assertEquals(driver.getTitle(), "Java Tutorial - 1Search");

	    
	}
	@After
	public void getscreenshot(Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot scr = (TakesScreenshot)driver;
			byte[] img = scr.getScreenshotAs(OutputType.BYTES);
//taking screenshot and storing as bytyes in byte array to attch to hyml file
			scenario.attach(img, "image/png", "Screenshot");
					
		}
		
	}
	
	
	

}
