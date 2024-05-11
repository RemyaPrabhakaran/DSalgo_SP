package definitions;

import java.io.IOException;

import Pages.Datastructure_Page;
import Pages.Graph_Page;
import Pages.HomePage_Page;
import Pages.IntroductionPage_Page;
import Pages.SigninPage_Page;
import Pages.TryHerePage_Page;
import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Graph_SD extends TestBase {

	HomePage_Page homepage;
	IntroductionPage_Page introPage;
	SigninPage_Page signinPage;
	Graph_Page graphPage;
	Datastructure_Page datastructurePage  = new Datastructure_Page();
	String pageTitle;
	TryHerePage_Page tryHerePage;
	
	public Graph_SD() throws IOException {
		super();
	}
	
	@When("The user clicks Get Started button below Graph")
	public void the_user_clicks_get_started_button_below_graph() throws IOException {
		graphPage = datastructurePage.graphgetclickstartbutton();
	}

	@Then("The user should be navigated to Graph page")
	public void the_user_should_be_navigated_to_graph_page() throws InterruptedException {
		pageTitle = graphPage.verifyMainGraphPageTitle();
	    Assert.assertEquals("Graph", pageTitle);
	}

	@Given("The user is in the Graph page after logged in")
	public void the_user_is_in_the_graph_page_after_logged_in() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123"); 
		datastructurePage = new Datastructure_Page();
		datastructurePage.verifySignedinUser();
		//graphPage = new Graph_Page();
		graphPage = datastructurePage.graphgetclickstartbutton();
	}

	@When("The user clicks Graph link")
	public void the_user_clicks_graph_link() throws IOException {
		graphPage = graphPage.clickGraphLink();
	}

	@Then("The user should be directed to Graph Page")
	public void the_user_should_be_directed_to_graph_page() throws InterruptedException {
		graphPage.verifyGraphPageTitle();
	}

	@When("The user clicks Graph Representations link")
	public void the_user_clicks_graph_representations_link() throws IOException {
		graphPage= graphPage.clickGraphRepresentationsLink();
	}

	@Then("The user should be directed to Graph Representations Page")
	public void the_user_should_be_directed_to_graph_representations_page() throws InterruptedException {
		graphPage.verifyGraphRepresentationsPageTitle();
	}

	@Given("The user is in the Graph Page")
	public void the_user_is_in_the_graph_page() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123"); 
		datastructurePage = new Datastructure_Page();
		datastructurePage.verifySignedinUser();
		graphPage = datastructurePage.graphgetclickstartbutton();
		graphPage.clickGraphLink();
	}

	@When("The user clicks Try Here button in Graph page")
	public void the_user_clicks_try_here_button_in_graph_page() throws IOException {
		tryHerePage = new TryHerePage_Page();
		tryHerePage = graphPage.clickTryHere();
	}

	@Then("The user should be directed to Graph Try Editor Page")
	public void the_user_should_be_directed_to_graph_try_editor_page() throws InterruptedException {
		String title = tryHerePage.validateTryHerePageTitle();
	    Assert.assertEquals("Assessment", title);
	}

	@Given("The user is in the Graph Representations Page")
	public void the_user_is_in_the_graph_representations_page() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123"); 
		datastructurePage = new Datastructure_Page();
		datastructurePage.verifySignedinUser();
		graphPage = datastructurePage.graphgetclickstartbutton();
		graphPage.clickGraphRepresentationsLink();
	}

	@When("The user clicks Try Here button in Graph Representations page")
	public void the_user_clicks_try_here_button_in_graph_representations_page() throws IOException {
		tryHerePage = new TryHerePage_Page();
		tryHerePage = graphPage.clickTryHere();
	}

	@Given("The user is in the Graph try Editor Page")
	public void the_user_is_in_the_graph_try_editor_page() throws InterruptedException, IOException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123"); 
		datastructurePage = new Datastructure_Page();
		datastructurePage.verifySignedinUser();
		graphPage = datastructurePage.graphgetclickstartbutton();
		graphPage.clickGraphLink();
		tryHerePage = graphPage.clickTryHere();
	}

	@When("The User writes Valid python code and clicks Run button in Graph")
	public void the_user_writes_valid_python_code_and_clicks_run_button_in_graph() throws InterruptedException {
		String code = "print "+'"'+"hello"+'"';
	    tryHerePage.executeCode(code);
	}

	@Then("User is able to see the output in console in Graph Try Editor Page")
	public void user_is_able_to_see_the_output_in_console_in_graph_try_editor_page() {
		tryHerePage.verifyConsoleOutput();
	}

	@Given("The user is in the Graph Representations try Editor Page")
	public void the_user_is_in_the_graph_representations_try_editor_page() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123"); 
		datastructurePage = new Datastructure_Page();
		datastructurePage.verifySignedinUser();
		graphPage = datastructurePage.graphgetclickstartbutton();
		graphPage.clickGraphRepresentationsLink();
		tryHerePage = graphPage.clickTryHere();
	}

	@When("The User writes invalid python code and clicks Run button in Graph")
	public void the_user_writes_invalid_python_code_and_clicks_run_button_in_graph() throws InterruptedException {
		String code = "hello";
	    tryHerePage.executeCode(code);
	}

	@Then("User is able to see the error msg in pop up window in Graph Try Editor Page")
	public void user_is_able_to_see_the_error_msg_in_pop_up_window_in_graph_try_editor_page() {
		tryHerePage.getAlertMessage();
	}

	@Then("The user click the ok button in the alert window in Graph Try Editor Page")
	public void the_user_click_the_ok_button_in_the_alert_window_in_graph_try_editor_page() {
		tryHerePage.clickOkOnAlert();
	}

	@Then("The user is on the same page having Editor and Run button in Graph Try Editor Page")
	public void the_user_is_on_the_same_page_having_editor_and_run_button_in_graph_try_editor_page() throws InterruptedException {
		String title = tryHerePage.validateTryHerePageTitle();
	    Assert.assertEquals("Assessment", title);
	}

	@When("The user clicks Practice Questions in Graph Page")
	public void the_user_clicks_practice_questions_in_graph_page() throws IOException {
		graphPage.clickPraticeQuestionsInGraph();
	}

	@Then("The user should be directed to Practice Questions page of Graph")
	public void the_user_should_be_directed_to_practice_questions_page_of_graph() {
		graphPage.verifyURL();
	}

	@When("The user clicks Practice Questions in Graph Representations Page")
	public void the_user_clicks_practice_questions_in_graph_representations_page() throws IOException {
		graphPage.clickPraticeQuestionsInGraph();
	}



	
}
