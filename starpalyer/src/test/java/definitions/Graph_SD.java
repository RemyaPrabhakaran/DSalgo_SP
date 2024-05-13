package definitions;

import java.io.IOException;

import Pages.DatastructureHomePage_Page;
import Pages.Datastructure_Page;
import Pages.Graph_page;
import Pages.HomePage_Page;
import Pages.IntroductionPage_Page;
import Pages.SigninPage_Page;
import Pages.TryHerePage_Page;
import base.TestBase;
import io.cucumber.java.en.*;
import junit.framework.Assert;

public class Graph_SD extends TestBase {
	HomePage_Page homepage;
	IntroductionPage_Page introPage;
	SigninPage_Page signinPage;
	Graph_page graphPage;
	Datastructure_Page datastructurePage  = new Datastructure_Page();
	TryHerePage_Page tryHerePage;
	
	public Graph_SD() throws IOException {
		super();	
	}
	@When("The user clicks Get Started button below Graph")
	public void the_user_clicks_get_started_button_below_graph() throws IOException {
		graphPage = datastructurePage.graphgetclickstartbutton();
	}

	@Then("The user should be navigated to Graph page")
	public void the_user_should_be_navigated_to_graph_page() {
	  String pageTitle=graphPage.verifymaingraphpagetitle();
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
	   graphPage.clickongraph();
	}

	@Then("The user should be directed to Graph Page")
	public void the_user_should_be_directed_to_graph_page() {
	  graphPage.verifygraphtitle();
	}

	@When("The user clicks Graph Representations link")
	public void the_user_clicks_graph_representations_link() throws IOException {
		graphPage.clickGraphRepresentationsLink();
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
		graphPage.clickongraph();
	}

	@When("The user clicks Try Here button in Graph page")
	public void the_user_clicks_try_here_button_in_graph_page() throws IOException {
		tryHerePage = new TryHerePage_Page();
		graphPage.clickTryHere();
	}

	@Then("The user should be directed to Graph Try Editor Page")
	public void the_user_should_be_directed_to_graph_try_editor_page() throws InterruptedException {
		String title=tryHerePage.validateTryHerePageTitle();
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


	

}
