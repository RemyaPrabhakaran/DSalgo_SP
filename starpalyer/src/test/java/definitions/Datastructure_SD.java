package definitions;

import java.io.IOException;

import Pages.DatastructureHomePage_Page;
import Pages.Datastructure_Page;
import Pages.HomePage_Page;
import Pages.IntroductionPage_Page;
import Pages.PracticePage_Page;
import Pages.SigninPage_Page;
import Pages.TimecomplexityPage_Page;
import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Datastructure_SD extends TestBase
{
	HomePage_Page homepage;
	IntroductionPage_Page introPage;
	SigninPage_Page signinPage;
	Datastructure_Page  datastructurePage;
	DatastructureHomePage_Page datastructureHomePage;
	TimecomplexityPage_Page   timecomplexitypage; 
	PracticePage_Page practicePage;
	
	public Datastructure_SD() throws IOException {
		super();
		
	}

@Given("The user is on the datastructure homepage")
public void the_user_is_on_the_datastructure_homepage() throws InterruptedException, IOException {
	initialization();
	homepage = new HomePage_Page();
	introPage = homepage.clickGetStartButton();
	introPage = new IntroductionPage_Page();
	signinPage=introPage.clickSignin();
	signinPage = new SigninPage_Page();
	signinPage.dsalgoportalLogin("Starplayers", "Star@123");
	datastructurePage = new Datastructure_Page();
	datastructureHomePage  = new DatastructureHomePage_Page();
	datastructurePage.verifySignedinUser();
	
}

@When("The user clicks Get Started button below the Data structures-Introduction")
public void the_user_clicks_get_started_button_below_the_data_structures_introduction() throws IOException {
   
   datastructureHomePage = datastructurePage.dataStructuregetclickstartbutton();
}

@Then("The user should land in Data Structures- Introduction Page page")
public void the_user_should_land_in_data_structures_introduction_page_page() throws IOException, InterruptedException {
	
    String dshome = datastructureHomePage.verifydsIntropage();
    
    Assert.assertEquals(dshome, "Data Structures-Introduction");
}

	//Scenario 2 
@Given("The user is on the Data Structure Introduction Page")
public void the_user_is_on_the_data_structure_introduction_page() throws IOException, InterruptedException {
	
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
    
}

@When("The user clicks Time Complexity link")
public void the_user_clicks_time_complexity_link() throws IOException {
	datastructureHomePage  = new DatastructureHomePage_Page();
	timecomplexitypage= datastructureHomePage.verifytimecomplexityBtn();
}

@Then("The user should be redirected to Time Complexity  page")
public void the_user_should_be_redirected_to_time_complexity_page() throws IOException, InterruptedException {
	timecomplexitypage = new TimecomplexityPage_Page();
	String tcTitle= timecomplexitypage.verifyTimecomplexity();
	Assert.assertEquals(tcTitle, "Time Complexity");
}

@After
public void tearDownIntro() {
	driver.quit();
}
/*
 * @Given("The user is on the TimeComplexity Page") public void
 * the_user_is_on_the_time_complexity_page() throws IOException,
 * InterruptedException { timecomplexitypage = new TimecomplexityPage_Page();
 * String tcTitle= timecomplexitypage.verifyTimecomplexity();
 * Assert.assertEquals(tcTitle, "Time Complexity"); }
 * 
 * 
 * @When("The user clicks the practise questionlink") public void
 * the_user_clicks_the_practise_questionlink() throws IOException { practicePage
 * = timecomplexitypage.practiceLinkclick(); }
 * 
 * @Then("The user doesn't find any practice problems and page is blank") public
 * void the_user_doesn_t_find_any_practice_problems_and_page_is_blank() throws
 * IOException { practicePage = new PracticePage_Page(); String actualUrl=
 * "https://dsportalapp.herokuapp.com/data-structures-introduction/practice";
 * String expectedUrl=practicePage.validatePracticePage();
 * Assert.assertEquals(expectedUrl, actualUrl); }
 */

}
