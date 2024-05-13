package Pages;

import java.io.IOException;

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
    }
    
    
    public String validatePracticePage() {
 	   
    	String practicepageUrl = driver.getCurrentUrl();
    	return practicepageUrl ;
    }
    
}

