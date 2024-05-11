package definitions;

import java.io.IOException;

import Pages.Applications_Page;
import Pages.Datastructure_Page;
import Pages.HomePage_Page;
import Pages.Implementation_Page;
import Pages.IntroductionPage_Page;
import Pages.SigninPage_Page;
import Pages.Stack_Page;
import Pages.TryHerePage_Page;
import Pages.operationsInStack_Page;
import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Stack_SD extends TestBase{

	HomePage_Page homepage;
	IntroductionPage_Page introPage;
	SigninPage_Page signinPage;
	Datastructure_Page  datastructurePage;
	Stack_Page stackPage;
	operationsInStack_Page operationsPage;
	Implementation_Page implementationPage;
	Applications_Page applicationsPage;
	TryHerePage_Page tryHerePage;
	
	public Stack_SD() throws IOException {
		super();
		
	}

	@Given("The user is on the datastructure homepage after sign in")
	public void the_user_is_on_the_datastructure_homepage_after_sign_in() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123"); 
		datastructurePage = new Datastructure_Page();
		stackPage  = new Stack_Page();
		datastructurePage.verifySignedinUser();
	}

	@When("The user clicks Get Started button below Stack")
	public void the_user_clicks_get_started_button_below_stack() throws IOException {
		stackPage = datastructurePage.stackgetclickstartbutton();
	}

	@Then("The user should be navigated to Stack page")
	public void the_user_should_be_navigated_to_stack_page() throws InterruptedException {
		String stackhome = stackPage.verifyStackPageTitle();
	    System.out.print(stackhome);
	    Assert.assertEquals(stackhome, "Stack");
	}
	
	@Given("The user is in the Stack page after logged in")
	public void the_user_is_in_the_stack_page_after_logged_in() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123"); 
		datastructurePage = new Datastructure_Page();
		stackPage  = new Stack_Page();
		datastructurePage.verifySignedinUser();
		stackPage = datastructurePage.stackgetclickstartbutton();
	}

	@When("The user clicks Operations in Stack link")
	public void the_user_clicks_operations_in_stack_link() throws IOException {
		operationsPage = new operationsInStack_Page();
		operationsPage=stackPage.verifyOperationsInStackBtn();
	    
	}

	@Then("The user should be directed to Operations in Stack Page")
	public void the_user_should_be_directed_to_operations_in_stack_page() throws InterruptedException {
		String operationshome = operationsPage.verifyOperationsInStackTitle();
		System.out.println(operationshome);
		Assert.assertEquals(operationshome, "Operations in Stack");
	}

	@Given("The user is in the Operations in Stack Page")
	public void the_user_is_in_the_operations_in_stack_page() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123"); 
		datastructurePage = new Datastructure_Page();
		stackPage  = new Stack_Page();
		datastructurePage.verifySignedinUser();
		stackPage = datastructurePage.stackgetclickstartbutton();
		operationsPage = new operationsInStack_Page();
		operationsPage=stackPage.verifyOperationsInStackBtn();
	}

	@When("The user clicks Try Here button in Operations in Stack page")
	public void the_user_clicks_try_here_button_in_operations_in_stack_page() throws IOException {
		tryHerePage = new TryHerePage_Page();
		tryHerePage = operationsPage.clickTryHere();
		
	}

	@Then("The user should be directed to Editor Page")
	public void the_user_should_be_directed_to_editor_page() throws InterruptedException {
	    String title = tryHerePage.validateTryHerePageTitle();
	    Assert.assertEquals("Assessment", title);
	}
	
	@Given("The user is in the Operations in Stack try Editor Page")
	public void the_user_is_in_the_operations_in_stack_try_editor_page() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123"); 
		datastructurePage = new Datastructure_Page();
		stackPage  = new Stack_Page();
		datastructurePage.verifySignedinUser();
		stackPage = datastructurePage.stackgetclickstartbutton();
		operationsPage = new operationsInStack_Page();
		operationsPage=stackPage.verifyOperationsInStackBtn();
		tryHerePage = new TryHerePage_Page();
		tryHerePage = operationsPage.clickTryHere();
	}

	@When("The User writes Valid python code and clicks Run button")
	public void the_user_writes_valid_python_code_and_clicks_run_button() throws InterruptedException {
		String code = "print "+'"'+"hello"+'"';
	    tryHerePage.executeCode(code);
	}


	@Then("User is able to see the output in console")
	public void user_is_able_to_see_the_output_in_console() {
	    tryHerePage.verifyConsoleOutput();
	}
	
	@When("The User writes invalid python code and clicks Run button")
	public void the_user_writes_invalid_python_code_and_clicks_run_button() throws InterruptedException {
	    String code = "hello";
	    tryHerePage.executeCode(code);
	}

	@Then("User is able to see the error msg in pop up window")
	public void user_is_able_to_see_the_error_msg_in_pop_up_window() {
	    tryHerePage.getAlertMessage();
	}

	@Then("The user click the ok button in the alert window")
	public void the_user_click_the_ok_button_in_the_alert_window() {
	    tryHerePage.clickOkOnAlert();
	}

	@Then("The user is on the same page having Editor and Run button")
	public void the_user_is_on_the_same_page_having_editor_and_run_button() throws InterruptedException {
	    String title = tryHerePage.validateTryHerePageTitle();
	    Assert.assertEquals("Assessment", title);
	}

	@When("The user clicks Practice Questions in Operations in Stack Page")
	public void the_user_clicks_practice_questions_in_operations_in_stack_page() throws IOException {
		stackPage  = new Stack_Page();
		stackPage.clickPraticeQuestionsInStack(operationsPage.getPracticeQuestionsLink());
	}

	@Then("The user should be directed to Practice Questions page")
	public void the_user_should_be_directed_to_practice_questions_page() {
	    stackPage.verifyURL();
	}
	
	@When("The user clicks Implementation link")
	public void the_user_clicks_implementation_link() throws IOException {
		implementationPage = new Implementation_Page();
		implementationPage=stackPage.verifyImplementationBtn();
	}

	@Then("The user should be directed to Implementation Page")
	public void the_user_should_be_directed_to_implementation_page() throws InterruptedException {
		String implementationhome = implementationPage.verifyImplementationTitle();
		System.out.println(implementationhome);
		Assert.assertEquals(implementationhome, "Implementation");
	}

	@Given("The user is in the Implementation Page")
	public void the_user_is_in_the_implementation_page() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123"); 
		datastructurePage = new Datastructure_Page();
		stackPage  = new Stack_Page();
		datastructurePage.verifySignedinUser();
		stackPage = datastructurePage.stackgetclickstartbutton();
		implementationPage = new Implementation_Page();
		implementationPage=stackPage.verifyImplementationBtn();
	}
	
	@When("The user clicks Try Here button in Implementation page")
	public void the_user_clicks_try_here_button_in_implementation_page() throws IOException {
		tryHerePage = new TryHerePage_Page();
		tryHerePage = implementationPage.clickTryHere();
		
	}

	@Given("The user is in the Implementation try Editor Page")
	public void the_user_is_in_the_implementation_try_editor_page() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123"); 
		datastructurePage = new Datastructure_Page();
		stackPage  = new Stack_Page();
		datastructurePage.verifySignedinUser();
		stackPage = datastructurePage.stackgetclickstartbutton();
		implementationPage = new Implementation_Page();
		implementationPage=stackPage.verifyImplementationBtn();
		tryHerePage = new TryHerePage_Page();
		tryHerePage = implementationPage.clickTryHere();
	}
	
	@When("The user clicks Practice Questions in Implementation Page")
	public void the_user_clicks_practice_questions_in_implementation_page() throws IOException {
		stackPage  = new Stack_Page();
		stackPage.clickPraticeQuestionsInStack(implementationPage.getPracticeQuestionsLink());
	}
	
	@When("The user clicks Applications link")
	public void the_user_clicks_applications_link() throws IOException {
		applicationsPage = new Applications_Page();
		applicationsPage=stackPage.verifyApplicationsBtn();
	}

	@Then("The user should be directed to Applications Page")
	public void the_user_should_be_directed_to_applications_page() throws InterruptedException {
		String applicationshome = applicationsPage.verifyApplicationsPageTitle();
		System.out.println(applicationshome);
		Assert.assertEquals(applicationshome, "Applications");
	}

	@Given("The user is in the Applications Page")
	public void the_user_is_in_the_applications_page() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123"); 
		datastructurePage = new Datastructure_Page();
		stackPage  = new Stack_Page();
		datastructurePage.verifySignedinUser();
		stackPage = datastructurePage.stackgetclickstartbutton();
		applicationsPage = new Applications_Page();
		applicationsPage=stackPage.verifyApplicationsBtn();
	}

	@When("The user clicks Try Here button in Applications page")
	public void the_user_clicks_try_here_button_in_applications_page() throws IOException {
		tryHerePage = new TryHerePage_Page();
		tryHerePage = applicationsPage.clickTryHere();
	}

	@Given("The user is in the Applications try Editor Page")
	public void the_user_is_in_the_applications_try_editor_page() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123"); 
		datastructurePage = new Datastructure_Page();
		stackPage  = new Stack_Page();
		datastructurePage.verifySignedinUser();
		stackPage = datastructurePage.stackgetclickstartbutton();
		applicationsPage = new Applications_Page();
		applicationsPage=stackPage.verifyApplicationsBtn();
		tryHerePage = new TryHerePage_Page();
		tryHerePage = applicationsPage.clickTryHere();
	}

	@When("The user clicks Practice Questions in Applications Page")
	public void the_user_clicks_practice_questions_in_applications_page() throws IOException {
		stackPage  = new Stack_Page();
		stackPage.clickPraticeQuestionsInStack(applicationsPage.getPracticeQuestionsLink());
	}

}
