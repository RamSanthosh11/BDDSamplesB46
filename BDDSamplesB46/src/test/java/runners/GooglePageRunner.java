package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//features//GoogleSearch.feature",
                 glue = {"stepDefs"}
)

public class GooglePageRunner extends AbstractTestNGCucumberTests{
	
	//The TestRunner class extends AbstractTestNGCucumberTests, which enables it to run Cucumber scenarios as TestNG tests.
	
  
}
