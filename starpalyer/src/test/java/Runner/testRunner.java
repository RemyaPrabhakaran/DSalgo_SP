package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/result1.html ,\"io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm\""}, //reporting purpose
		monochrome=false,  //console output colour
	
		features = {"src/test/resources/Features/Graph.feature"}, //location of feature files
		glue= "definitions",
		dryRun = false
		) //location of step definition files
        
public class testRunner {

}
