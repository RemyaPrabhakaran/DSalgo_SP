package definitions;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Pages.HomePage_Page;
import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage_SD extends TestBase{

    HomePage_Page homePage;

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
        
    }

}
