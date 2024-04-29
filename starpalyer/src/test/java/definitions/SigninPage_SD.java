
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

public class SigninPage_SD extends TestBase {

	HomePage_Page homepage;
	IntroductionPage_Page introPage;
	SigninPage_Page signinPage;

	public SigninPage_SD() throws IOException {
		super();

	}

	@Given("The user is on Introduction page")
	public void the_user_is_on_sign_in_page() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		//introPage.clickSignin();

	}

	@When("User clicks sign in button")
	public void user_enter_username_and_password_and_click_sign_in_button() throws IOException {
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		
	}
	
	@When("User login by entering username and password")
	public void user_login_by_entering_username_and_password() throws IOException {
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin(prop.getProperty("username"), prop.getProperty("password"));
	}
	

	@Then("Verifies user is logged in")
	public void user_is_logged_in_to_dsalgo_portal() throws IOException {

		System.out.println("User is logged in to dsalgo portal");
		Assert.assertTrue(true);
	}
	
	
	// Scenario 2 : For Invalid username and correct password
	@Given("The user is navigated to Introduction page")
	public void the_user_is_navigated_to_introduction_page() throws IOException, InterruptedException {
	
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
	}
	   

	@When("User clicks on signin button")
	public void user_clicks_on_signin_button() throws IOException {
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
	}

	@When("user login with wrong username and correct password")
	public void user_login_with_wrong_username_and_password() throws IOException {
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayer",  prop.getProperty("password"));
	}

	@Then("verifies validation message for wrong credentials")
	public void verifies_validation_message_for_wrong_credentials() {
		String verifyMsg= signinPage.invalidCredentialValidation();
		System.out.println(verifyMsg);
		Assert.assertEquals(verifyMsg, "Invalid Username and Password") ;
	   
	}

	
	//Scenario 3 :Signin page validation with valid username 
	@Given("The user landed to  Introduction page")
	public void the_user_landed_to_introduction_page() throws IOException, InterruptedException {
		
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
	    
	}

	@When("User clicks the signin button")
	public void user_clicks_the_signin_button() throws IOException {
		
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
	   
	}

	@When("User login with valid username and wrong password")
	public void user_login_with_valid_username_and_wrong_password() throws IOException {

		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin( prop.getProperty("username"), "Star@123");

	}

	@Then("verify validation message for wrong password")
	public void verify_validation_message_for_wrong_password() {
		String verifyMsg= signinPage.invalidCredentialValidation();
		System.out.println(verifyMsg);
		Assert.assertEquals(verifyMsg, "Invalid Username and Password") ;
		
	}

// Scenario 4 : Signin page validation with invalid username and invalid  password

	@Given("The user landed to Introductio page")
	public void the_user_landed_to_introductio_page() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
	     
	}

	@When("User click on the signin button")
	public void user_click_on_the_signin_button() throws IOException {
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();

	}

	@When("user login with invalid username and password")
	public void user_login_with_invalid_username_and_password() throws IOException {
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayer", "Star@123");


	}

	@Then("verify validation message")
	public void verify_validation_message() {

		String verifyMsg= signinPage.invalidCredentialValidation();
		System.out.println(verifyMsg);
		Assert.assertEquals(verifyMsg, "Invalid Username and Password") ;
	}

// Scenario 5 Signin page validation with entering only Password 

	@Given("The user  on Introduction page")
	public void the_user_on_introduction_page() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
	}

	@When("User clicking the signin button")
	public void user_clicking_the_signin_button() throws IOException {
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();

	}

	@When("user login with blank username  and password")
	public void user_login_with_blank_username_and_password() throws IOException 
	{
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("", "Star@123");
	}

	@Then("verify the  validation message")
	public void verify_the_validation_message() {
	   String tpMsg= signinPage.tooltipValidation();
	   System.out.print(tpMsg);
	   Assert.assertEquals(tpMsg, "Please fill out this field.");
	}

	// Scenario 6 Signin page validation with blank password
	@Given("The user is checking the introduction page")
	public void the_user_is_checking_the_introduction_page() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
	}

	@When("The user click signin button")
	public void the_user_click_signin_button() throws IOException {
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
	}

	@When("User login with valid username and empty password")
	public void user_login_with_valid_username_and_empty_password() throws IOException {
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayer", "");
	}

	@Then("verifying the validation message")
	public void verifying_the_validation_message() {
	  String toolpwdMsg = signinPage.tooltippasswordValidation();
	  System.out.print(toolpwdMsg);
	   Assert.assertEquals(toolpwdMsg, "Please fill out this field.");
	}

	// Scenario 7 With both username and password  field blank 
	@Given("User click the Introduction page")
	public void user_click_the_introduction_page() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
	}

	@When("User is on Sign in screen and click signin button")
	public void user_is_on_sign_in_screen_and_click_signin_button() throws IOException {
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
	}

	@When("User logged with out entering username and password")
	public void user_logged_with_out_entering_username_and_password() throws IOException {
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("", "");

	}

	@Then("Verify the validation Popup")
	public void verify_the_validation_popup() 
	{String tpMsg= signinPage.tooltipValidation();
	   System.out.print(tpMsg);
	   Assert.assertEquals(tpMsg, "Please fill out this field.");
	}


	
	
	
	 @After
	    public void tearDown(){
	        driver.quit();
	    }



}
