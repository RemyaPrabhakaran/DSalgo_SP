package definitions;
import java.io.IOException;

import org.testng.Assert;

import Pages.DatastructureHomePage_Page;
import Pages.Datastructure_Page;
import Pages.HomePage_Page;
import Pages.IntroductionPage_Page;
import Pages.Linkedlist_Page;
import Pages.SigninPage_Page;
import Pages.TryHerePage_Page;
import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Linkedlist_SD extends TestBase {
	HomePage_Page homepage;
	IntroductionPage_Page introPage;
	SigninPage_Page signinPage;
	Datastructure_Page  datastructurePage;
	DatastructureHomePage_Page datastructureHomePage;
	Linkedlist_Page linkedlistPage;
	TryHerePage_Page tryHerePage;
	
	public Linkedlist_SD() throws IOException {
		super();
		//this.linkedlistPage =linkedlistPage;
		//this.tryHerePage =tryHerePage;
	}
//	public Linkedlist_SD(Linkedlist_Page linkedlistPage) throws IOException {
//		this.linkedlistPage =linkedlistPage;
//	}
	@Given("The user is on the datastructure homepage after signin")
	public void the_user_is_on_the_datastructure_homepage_after_sign() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		linkedlistPage = new Linkedlist_Page();
	}
	
	@When("The user clicks Get Started button below linkedlist")
	public void the_user_clicks_get_started_button_below_linkedlist() throws IOException {
		linkedlistPage = datastructurePage.linkedlistgetstartedBtn(); 
	}
	@Then("The user should navigated to linkedlist page")
	public void the_user_should_navigated_to_linkedlist_page() throws InterruptedException {
	   String linkedlistHome = linkedlistPage.verifyLinkedlistPageTitle();
	   System.out.println(linkedlistHome);
	   Assert.assertEquals(linkedlistHome, "Linked List");
	}
	
	@Given("The user is on the Linked List page")
	public void the_user_is_on_the_linked_list_page() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		linkedlistPage = new Linkedlist_Page();
		linkedlistPage.verifyLinkedlistPageTitle();
		datastructurePage.linkedlistgetstartedBtn();
		String linkedlistHome = linkedlistPage.verifyLinkedlistPageTitle();
		   System.out.println(linkedlistHome);
		   Assert.assertEquals(linkedlistHome, "Linked List");
	  
	}
	@When("The user clicks Introduction link")
	public void the_user_clicks_introduction_link() throws IOException, InterruptedException {
		linkedlistPage.clickInterductionBtn();
	}
	@Then("The user should be redirected to Introduction page")
	public void the_user_should_be_redirected_to_introduction_page() throws InterruptedException, IOException {
	    String linkedlistIntroTitle = linkedlistPage.verifyintroductionPageTitle();
	    System.out.println(linkedlistIntroTitle);
		   Assert.assertEquals(linkedlistIntroTitle, "Introduction");
	}
	@When("The user clicks Creating Linked List link")
	public void the_user_clicks_creating_linked_list_link() throws IOException {
	    linkedlistPage.clickCreatingLinkedlist();
	    }
	@Then("The user should be redirected to Creating linked list page")
	public void the_user_should_be_redirected_to_creating_linked_list_page() throws InterruptedException {
	    String creatingLinkedlistTile = linkedlistPage.verifyCreatingLinkedlistPageTitle();
	    System.out.println(creatingLinkedlistTile);
	    Assert.assertEquals(creatingLinkedlistTile, "Creating Linked LIst");
	}
	
	@When("The user clicks Types of Linked List link")
	public void the_user_clicks_types_of_linked_list_link() throws IOException {
		linkedlistPage.ClickTypesOfLinkedlist();
	    
	}
	@Then("The user should be redirected to Types of Linked List page")
	public void the_user_should_be_redirected_to_types_of_linked_list_page() throws InterruptedException {
		String typesOfLinkedlistTitle = linkedlistPage.verifyTypesOfLinkedlistTitle();
	    System.out.println(typesOfLinkedlistTitle);
	    Assert.assertEquals(typesOfLinkedlistTitle, "Types of Linked List");
	}
	@When("The user clicks Implement Linked List in Python link")
	public void the_user_clicks_implement_linked_list_in_python_link() throws IOException {
		linkedlistPage.ClickimplementedLinkedTestInPyton();
	}
	@Then("The user should be redirected to Implement Linked List in Python page")
	public void the_user_should_be_redirected_to_implement_linked_list_in_python_page() throws InterruptedException {
		String implementLinkedListinPythonTitle = linkedlistPage.verifyImplementLinkedListinPythonTitle();
	    System.out.println(implementLinkedListinPythonTitle);
	    Assert.assertEquals(implementLinkedListinPythonTitle, "Implement Linked List in Python");
	}
	@When("The user clicks Traversal link")
	public void the_user_clicks_traversal_link() throws IOException {
		linkedlistPage.ClicktraversalLinkedlist();
	}
	@Then("The user should be redirected to Traversal page")
	public void the_user_should_be_redirected_to_traversal_page() throws InterruptedException {
		String traversalLinkedlistTitle = linkedlistPage.verifytraversalLinkedlistTitle();
	    System.out.println(traversalLinkedlistTitle);
	    Assert.assertEquals(traversalLinkedlistTitle, "Traversal");
	}
	@When("The user clicks Insertion link")
	public void the_user_clicks_insertion_link() throws IOException {
		linkedlistPage.ClickinsertionLinkedlist();
	}
	@Then("The user should be redirected to Insertion page")
	public void the_user_should_be_redirected_to_insertion_page() throws InterruptedException {
		String insertionLinkedlistTitle = linkedlistPage.verifyinsertionLinkedlistTitle();
	    System.out.println(insertionLinkedlistTitle);
	    Assert.assertEquals(insertionLinkedlistTitle, "Insertion");
	}
	
	@When("The user clicks Deletion link")
	public void the_user_clicks_deletion_link() throws IOException {
		linkedlistPage.ClickDeletionLinkedlist();
	}
	@Then("The user should be redirected to Deletion page")
	public void the_user_should_be_redirected_to_deletion_page() throws InterruptedException {
		String deletionLinkedlistTitle = linkedlistPage.verifyDeletionLinkedlistTitle();
	    System.out.println(deletionLinkedlistTitle);
	    Assert.assertEquals(deletionLinkedlistTitle, "Deletion");
	   
	}
	@Given("The user is in the Introduction Page")
	public void the_user_is_in_the_introduction_page() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		linkedlistPage = new Linkedlist_Page();
		linkedlistPage.verifyLinkedlistPageTitle();
		datastructurePage.linkedlistgetstartedBtn();
		linkedlistPage.clickInterductionBtn();
	}
	@When("The user clicks Try Here button in Introduction page")
	public void the_user_clicks_try_here_button_in_introduction_page() throws IOException {
		tryHerePage = new TryHerePage_Page();
		tryHerePage = linkedlistPage.clickTryHere();
	}
	@Then("The user should be directed to Editor Page in Linkedlist")
	public void the_user_should_be_directed_to_editor_page_in_linkedlist() throws InterruptedException {
		//Thread.sleep(3000);
		String title = tryHerePage.validateTryHerePageTitle();
	    Assert.assertEquals("Assessment", title);
	}
	@Given("The user is in the Creating Linked LIst Page")
	public void the_user_is_in_the_Creating_Linked_LIst_page() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		linkedlistPage = new Linkedlist_Page();
		linkedlistPage.verifyLinkedlistPageTitle();
		datastructurePage.linkedlistgetstartedBtn();
		linkedlistPage.clickCreatingLinkedlist();
	}
	@When("The user clicks Try Here button in Creating Linked LIst page")
	public void the_user_clicks_try_here_button_in_Creating_Linked_LIst_page() throws IOException {
		tryHerePage = new TryHerePage_Page();
		tryHerePage = linkedlistPage.clickTryHere();
	}
	
	@Given("The user is in the Implement Linked List in Python Page")
	public void the_user_is_in_the_Implement_Linked_List_in_Python_page() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		linkedlistPage = new Linkedlist_Page();
		linkedlistPage.verifyLinkedlistPageTitle();
		datastructurePage.linkedlistgetstartedBtn();
		linkedlistPage.ClickimplementedLinkedTestInPyton();
	}
	@When("The user clicks Try Here button in Implement Linked List in Python page")
	public void the_user_clicks_try_here_button_in_Implement_Linked_List_in_Python_page() throws IOException {
		tryHerePage = new TryHerePage_Page();
		tryHerePage = linkedlistPage.clickTryHere();
	}
	@Given("The user is in the Traversal Page")
	public void the_user_is_in_the_Traversal_page() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		linkedlistPage = new Linkedlist_Page();
		linkedlistPage.verifyLinkedlistPageTitle();
		datastructurePage.linkedlistgetstartedBtn();
		linkedlistPage.ClicktraversalLinkedlist();
	}
	@When("The user clicks Try Here button in Traversal page")
	public void the_user_clicks_try_here_button_in_Traversal_page() throws IOException {
		tryHerePage = new TryHerePage_Page();
		tryHerePage = linkedlistPage.clickTryHere();
	}
	@Given("The user is in the Insertion Page")
	public void the_user_is_in_the_Insertion_page() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		linkedlistPage = new Linkedlist_Page();
		linkedlistPage.verifyLinkedlistPageTitle();
		datastructurePage.linkedlistgetstartedBtn();
		linkedlistPage.ClickinsertionLinkedlist();
	}
	@When("The user clicks Try Here button in Insertion page")
	public void the_user_clicks_try_here_button_in_Insertion_page() throws IOException {
		tryHerePage = new TryHerePage_Page();
		tryHerePage = linkedlistPage.clickTryHere();
	}
	@Given("The user is in the Deletion Page")
	public void the_user_is_in_the_Deletion_page() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		linkedlistPage = new Linkedlist_Page();
		linkedlistPage.verifyLinkedlistPageTitle();
		datastructurePage.linkedlistgetstartedBtn();
		linkedlistPage.ClickDeletionLinkedlist();
	}
	@When("The user clicks Try Here button in Deletion page")
	public void the_user_clicks_try_here_button_in_Deletion_page() throws IOException {
		tryHerePage = new TryHerePage_Page();
		tryHerePage = linkedlistPage.clickTryHere();
	}
	@Given("The user is in the Types of Linked List Page")
	public void the_user_is_in_the_Types_of_Linked_List_page() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		linkedlistPage = new Linkedlist_Page();
		linkedlistPage.verifyLinkedlistPageTitle();
		datastructurePage.linkedlistgetstartedBtn();
		linkedlistPage.ClickTypesOfLinkedlist();
	}
	@When("The user clicks Try Here button in Types of Linked List page")
	public void the_user_clicks_try_here_button_in_Types_of_Linked_List_page() throws IOException {
		tryHerePage = new TryHerePage_Page();
		tryHerePage = linkedlistPage.clickTryHere();
	}
	
}
