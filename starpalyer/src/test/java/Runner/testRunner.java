package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:src/test/resources/Reports/TestReport.html",
				}, //reporting purpose
		monochrome=false,  //console output colour
	
		features = {"src/test/resources/Features/array.feature"}, //location of feature files
		glue= "definitions",
		dryRun = false
		) //location of step definition files
        
public class testRunner  {
	
		}
	
		
	

	

