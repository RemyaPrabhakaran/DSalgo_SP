package Runner;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:src/test/resources/Reports/TestReport1.html"
				}, //reporting purpose
		monochrome=false,  //console output colour
	//threadcount = 3,
		features = {"src/test/resources/Features"}, //location of feature files
		glue= "definitions",
		dryRun = false
		) //location of step definition files
        
public class testRunner2 extends AbstractTestNGCucumberTests {	
		@Override
		@DataProvider (parallel=true)
			public Object[][] scenarios(){
				return super.scenarios();
			}
		}
	

	

