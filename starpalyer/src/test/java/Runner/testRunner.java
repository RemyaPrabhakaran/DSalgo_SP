package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//plugin = {"pretty", "html:target/result1.html"},
		//reporting purpose
		
		plugin = {"pretty", "html:src/test/resources/Reports/TestReport.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"},
		monochrome=false,  //console output colour
	   
		features = {"src/test/resources/Features"}, //location of feature files
		glue= {"definitions","MyHooks"},
		dryRun = false
		
		) //location of step definition files
        
public class testRunner {

}
