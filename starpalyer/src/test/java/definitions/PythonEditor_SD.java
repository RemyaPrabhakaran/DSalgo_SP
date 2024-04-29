package definitions;

import java.io.IOException;

import Pages.DatastructureHomePage_Page;
import Pages.Datastructure_Page;
import Pages.HomePage_Page;
import Pages.IntroductionPage_Page;
import Pages.SigninPage_Page;
import Pages.TimecomplexityPage_Page;
import Pages.TryHerePage_Page;
import base.TestBase;
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
	
	public PythonEditor_SD() throws IOException {
		super();
		
	}
	
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

	@When("The user writebhe valid code and click on Run button")
	public void the_user_writebhe_valid_code_and_click_on_run_button() throws IOException, InterruptedException {
		tryherePage = new TryHerePage_Page();
		tryherePage.executeCode();
		
	}

	@Then("The user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console() {
		System.out.print("Console output");
	}


}
