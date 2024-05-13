package definitions;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Pages.HomePage_Page;
import Pages.IntroductionPage_Page;
import Pages.Register_Page;
import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register_SD extends TestBase{
	
	Register_Page registerPage = new Register_Page();
	HomePage_Page hp;
	IntroductionPage_Page introductionPage;
	WebElement a;
	String currentURL;
	
	public Register_SD() throws IOException {
	    super();
	}
	@Given("The user is on the registration page")
	public void the_user_is_on_the_registration_page() throws IOException, InterruptedException {
		initialization();
		hp =  new HomePage_Page();
		introductionPage = hp.clickGetStartButton();
		hp.registerLinkClick();
	}

	@When("The user clicks register without entering any details")
	public void the_user_clicks_register_without_entering_any_details() throws IOException, InterruptedException {
	    registerPage.register("","","");
	}
	
	@Then("The error Please fill out this field appears below username textbox")
    public void The_error_Please_fill_out_this_field_appears_below_username_textbox() throws IOException {     
		a = registerPage.getactiveElement();
		String message = registerPage.fieldValidation(a);
		Assert.assertEquals(message,"Please fill out this field.");
	}
	
	@Then("The user redirected to empty username textbox")
	public void the_user_redirected_to_empty_username_textbox() {
		
		registerPage.focusValidation(a);
		
	}
	
	@When("The user clicks register with only username")
	public void the_user_clicks_register_with_only_username() throws IOException, InterruptedException {
		 registerPage.register("text","","");
	}

	@Then("The error Please fill out this field appears below password textbox")
	public void the_error_please_fill_out_this_field_appears_below_password_textbox() {
		  a = registerPage.getactiveElement();
		  String message = registerPage.fieldValidation(a);
	      Assert.assertEquals(message,"Please fill out this field.");
	}

	@Then("The user redirected to empty password textbox")
	public void the_user_redirected_to_empty_password_textbox() {
		a = registerPage.getactiveElement();
		registerPage.focusValidation(a);
		//driver.close();
	}
	
	@When("The user clicks register with empty confirm password field")
	public void the_user_clicks_register_with_empty_confirm_password_field() throws IOException, InterruptedException {
		registerPage.register("text","text123","");
	}

	@Then("The error Please fill out this field appears below confirm password textbox")
	public void the_error_please_fill_out_this_field_appears_below_confirm_password_textbox() {
		 a = registerPage.getactiveElement();
		 String message = registerPage.fieldValidation(a);
	     Assert.assertEquals(message,"Please fill out this field.");
	}

	@Then("The user redirected to empty confirm password textbox")
	public void the_user_redirected_to_empty_confirm_password_textbox() {
		a = registerPage.getactiveElement();
		registerPage.focusValidation(a);
		//driver.close();
	}

	@When("The user clicks register with different password and confirm password")
	public void the_user_clicks_register_with_different_password_and_confirm_password() throws IOException, InterruptedException {
		registerPage.register("test","test","test123");
	}

	@Then("The error password_mismatch:The two password fields didn’t match should be shown")
	public void the_error_password_mismatch_the_two_password_fields_didn_t_match_should_be_shown() {
		registerPage.validatePwdMismtachError();
	}

	@Then("The user redirected to empty username username textbox")
	public void the_user_redirected_to_empty_username_username_textbox() {
		a = registerPage.getactiveElement();
		registerPage.focusValidation(a);
		//driver.close();
	}
	
	@When("The user clicks Login from registration page")
	public void the_user_clicks_login_from_registration_page() throws IOException, InterruptedException {
	  registerPage.clickLoginFromRegisterPage();
	  
	}

	@Then("user should be redirected to Login page")
	public void user_should_be_redirected_to_login_page() {
		currentURL = registerPage.validateURL();
		Assert.assertEquals(currentURL,"https://dsportalapp.herokuapp.com/login");
		
	}

	@Then("user can enter username and password in login page")
	public void user_can_enter_username_and_password_in_login_page() {
		 a = registerPage.getactiveElement();
		 registerPage.focusValidation(a);
		 //driver.close();
	}
	
	@When("The user clicks SignIn from registration page")
	public void the_user_clicks_signin_from_registration_page() throws IOException, InterruptedException {
	  registerPage.clickSignInFromRegisterPage();
	}

	@Then("user should be redirected to SignIn page")
	public void user_should_be_redirected_to_sign_in_page() {
		currentURL = registerPage.validateURL();
		Assert.assertEquals(currentURL,"https://dsportalapp.herokuapp.com/login");
	}

	@Then("user can enter username and password in signin page")
	public void user_can_enter_username_and_password_in_signin_page() {
		a = registerPage.getactiveElement();
		registerPage.focusValidation(a);
		//driver.close();
	}
	
	@After
	public void tearDownIntro() {
		driver.quit();
	}

//	@When("The user clicks register with valid username and password")
//	public void the_user_clicks_register_with_valid_username_and_password() throws IOException, InterruptedException {
//		registerPage.register("usercompat","cilantro123","cilantro123");
//	}
//
//	@Then("user should be registered successfully")
//	public void user_should_be_registered_successfully() {
//	    registerPage.validateSuccess();
//	}
//
//	@Then("user should be redirected to the home page")
//	public void user_should_be_redirected_to_the_home_page() {
//	    registerPage.validatePageTitle();
//	}

	

}