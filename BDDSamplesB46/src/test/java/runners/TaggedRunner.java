package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src//test//resources//taggedfeatures//",
                 glue = {"stepDefs"},
                 dryRun=false,
                 monochrome = true,
                 //tags = "@RegressionTest "
//                 /tags = "@SmokeTest and @RegressionTest   "
                 tags = "@SmokeTest or @RegressionTest   "
                 //tags = "not @SmokeTest"
                   //tags = "@Phaseone"
                 //tags = "@Phaseone and @SmokeTest"
                 //tags = "@Phaseone and not  @SmokeTest"
                 //to execute phaseone and phase two smoke tests
                 //   tags = "@Phaseone and @SmokeTest or @Phasetwo and @SmokeTest"
               //to execute phaseone and phase two smoke tests other that regressiontest
                  //tags = "@Phaseone and not @SmokeTest or @Phasetwo and not @SmokeTest"


)

public class TaggedRunner extends AbstractTestNGCucumberTests{
	
	//The TestRunner class extends AbstractTestNGCucumberTests, which enables it to run Cucumber scenarios as TestNG tests.
	
  
}
