package Pages;

import java.io.IOException;

import Log.LoggerLoad;
import base.TestBase;

public class PracticePage_Page  extends TestBase
{

	public PracticePage_Page() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
    public void   currentpage()
    {
    	driver.getCurrentUrl();
    	LoggerLoad.info("Current Page is verified");
    }
    
    
    public String validatePracticePage() {
 	   
    	String practicepageUrl = driver.getCurrentUrl();
    	LoggerLoad.info("Practice page url is "+practicepageUrl);
    	return practicepageUrl ;
    }
    
}
