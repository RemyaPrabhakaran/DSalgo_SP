package definitions;

import java.io.IOException;

import Pages.DatastructureHomePage_Page;
import Pages.Datastructure_Page;
import Pages.HomePage_Page;
import Pages.IntroductionPage_Page;
import Pages.PracticePage_Page;
import Pages.SigninPage_Page;
import Pages.TimecomplexityPage_Page;
import Pages.TryHerePage_Page;
import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class PythonEditor_SD extends TestBase{

	HomePage_Page homepage;
	IntroductionPage_Page introPage;
	SigninPage_Page signinPage;
	Datastructure_Page  datastructurePage;
	DatastructureHomePage_Page datastructureHomePage;
	TimecomplexityPage_Page   timecomplexitypage;
	TryHerePage_Page tryherePage;
	PracticePage_Page practicePage;
	
	public PythonEditor_SD() throws IOException {
		super();
		
	}
	// Scenario 1
	@Given("User clicks the try here button")
	public void user_clicks_the_try_here_button() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		datastructurePage.verifySignedinUser();
		datastructureHomePage = datastructurePage.dataStructuregetclickstartbutton();
		datastructureHomePage= new DatastructureHomePage_Page() ;
		String dshome1 = datastructureHomePage.verifydsIntropage();
		System.out.print(dshome1);
		
	   Assert.assertEquals(dshome1, "Data Structures-Introduction");
	   datastructureHomePage  = new DatastructureHomePage_Page();
	   timecomplexitypage= datastructureHomePage.verifytimecomplexityBtn();
	   timecomplexitypage = new TimecomplexityPage_Page();
	   tryherePage = timecomplexitypage.clickTryHere();
	   
	    
	}
		
	@When("The user write the valid code and click on Run button")
	public void the_user_writebhe_valid_code_and_click_on_run_button() throws IOException, InterruptedException {
		tryherePage = new TryHerePage_Page();
		String code = "print "+'"'+"hello"+'"';
	    tryherePage.executeCode(code);
	    Thread.sleep(3000);

	
		
	}

	@Then("The user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console() {
		System.out.print("Console output");
		tryherePage.verifyConsoleOutput();
	}
// Scenario 2 
	@Given("User clicking the try here button")
	public void user_clicking_the_try_here_button() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		datastructurePage.verifySignedinUser();
		datastructureHomePage = datastructurePage.dataStructuregetclickstartbutton();
		datastructureHomePage= new DatastructureHomePage_Page() ;
		String dshome1 = datastructureHomePage.verifydsIntropage();
		System.out.print(dshome1);
		
	   Assert.assertEquals(dshome1, "Data Structures-Introduction");
	   datastructureHomePage  = new DatastructureHomePage_Page();
	   timecomplexitypage= datastructureHomePage.verifytimecomplexityBtn();
	   timecomplexitypage = new TimecomplexityPage_Page();
	   tryherePage = timecomplexitypage.clickTryHere();
	}
	
	
	@When("The user clicks the runbutton without entering the code")
	public void the_user_clicks_the_runbutton_without_entering_the_code() throws IOException, InterruptedException {
		tryherePage = new TryHerePage_Page();
		tryherePage.executecodewithoutdata(null);
		 Thread.sleep(3000);
		

		
	}

	@Then("Nothing happens to the page and no error message is displayed")
	public void nothing_happens_to_the_page_and_no_error_message_is_displayed() {
	    System.out.println("no error message" );
	}
// Scenario 3
	
	
	@Given("User clicks on the try here button")
	public void user_clicks_on_the_try_here_button() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		datastructurePage.verifySignedinUser();
		datastructureHomePage = datastructurePage.dataStructuregetclickstartbutton();
		datastructureHomePage= new DatastructureHomePage_Page() ;
		String dshome1 = datastructureHomePage.verifydsIntropage();
		System.out.print(dshome1);
		
	   Assert.assertEquals(dshome1, "Data Structures-Introduction");
	   datastructureHomePage  = new DatastructureHomePage_Page();
	   timecomplexitypage= datastructureHomePage.verifytimecomplexityBtn();
	   timecomplexitypage = new TimecomplexityPage_Page();
	   tryherePage = timecomplexitypage.clickTryHere();
	}

	@When("User clicks the runbutton with invalid code")
	public void user_clicks_the_runbutton_with_invalid_code() throws IOException, InterruptedException {
		tryherePage = new TryHerePage_Page();
		tryherePage.executeinvalidcode(null);
		 Thread.sleep(3000);
	}

	@Then("The user should able to see an error message  alert window")
	public void the_user_should_able_to_see_an_error_message_in_alert_window() throws IOException, InterruptedException {
		tryherePage = new TryHerePage_Page();
		//tryherePage.validateErrorMessage();
		Thread.sleep(2000);
		tryherePage.getAlertMessage();
	}
	

@Given("The user is on the TimeComplexity Page")
public void the_user_is_on_the_time_complexity_page() throws IOException, InterruptedException {
	initialization();
	homepage = new HomePage_Page();
	introPage = homepage.clickGetStartButton();
	introPage = new IntroductionPage_Page();
	signinPage=introPage.clickSignin();
	signinPage = new SigninPage_Page();
	signinPage.dsalgoportalLogin("Starplayers", "Star@123");
	datastructurePage = new Datastructure_Page();
	datastructurePage.verifySignedinUser();
	datastructureHomePage = datastructurePage.dataStructuregetclickstartbutton();
	datastructureHomePage= new DatastructureHomePage_Page() ;
	String dshome1 = datastructureHomePage.verifydsIntropage();
	
	
   Assert.assertEquals(dshome1, "Data Structures-Introduction");
   datastructureHomePage  = new DatastructureHomePage_Page();
   timecomplexitypage= datastructureHomePage.verifytimecomplexityBtn();
  
}


  @When("The user clicks the practise questionlink") public void
  the_user_clicks_the_practise_questionlink() throws IOException { 
	  practicePage = timecomplexitypage.practiceLinkclick(); }
  
  @Then("The user doesn't find any practice problems and page is blank") public
  void the_user_doesn_t_find_any_practice_problems_and_page_is_blank() throws
  IOException { practicePage = new PracticePage_Page(); 
  String actualUrl="https://dsportalapp.herokuapp.com/data-structures-introduction/practice";
  String expectedUrl=practicePage.validatePracticePage();
  Assert.assertEquals(expectedUrl, actualUrl); }
  
  @After
	public void tearDownIntro() {
		driver.quit();
	}


}


