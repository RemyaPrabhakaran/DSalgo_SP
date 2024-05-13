package definitions;

import java.io.IOException;

import Pages.HomePage_Page;
import Pages.IntroductionPage_Page;
import Pages.SigninPage_Page;
import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class IntroductionPage_SD extends TestBase {
	
	HomePage_Page  homepage;
	IntroductionPage_Page introductionPage;
	SigninPage_Page signinPage=new SigninPage_Page();;

	
	public IntroductionPage_SD() throws IOException {
		super();
	
	}

	@Given("The user is on the DS Algo Introduction Page")
	public void the_user_is_on_the_ds_algo_introduction_page() throws InterruptedException, IOException {
		initialization();
		homepage =  new HomePage_Page();
		introductionPage = homepage.clickGetStartButton();
		
	}

	@When("The user clicks on sign in link")
	public void the_user_clicks_on_sign_in_link() throws InterruptedException, IOException {
		introductionPage.clickSignin();
		
	}

	@Then("User redirects to signin page")
	public void user_redirects_to_signin_page() {
		
		String pageTitle=signinPage.verifyPageTitle();
		
		Assert.assertEquals(pageTitle,"Login");
	   
	}
	
	@After
	public void tearDownIntro() {
		driver.quit();
	}
	
}
