package definitions;

import java.io.IOException;

import Pages.HomePage_Page;
import Pages.IntroductionPage_Page;
import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class HomePage_SD extends TestBase{

    HomePage_Page homePage;
    IntroductionPage_Page introPage;

public HomePage_SD() throws IOException {
    super();
}

	
    @Given("The user should open the browser")
    public void the_user_should_open_the_browser() throws IOException {
    	browserLaunch();
        homePage = new HomePage_Page();
    }

    @When("User enters the URL")
    public void user_enters_the_url() {
    	launchUrl();
    }

    @Then("User verifies the message in the launch page")
    public void user_verifies_the_message_in_the_launch_page() {
    	String rightMsg= homePage.verifyMessage();
    	Assert.assertEquals(rightMsg, "You are at the right place");
        
    }
    
    @After
    public void tearDown(){
        driver.quit();
    }
    
    
      
	}

