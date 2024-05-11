package definitions;

import java.io.IOException;

import org.junit.Assert;

import Pages.DatastructureHomePage_Page;
import Pages.Datastructure_Page;
import Pages.HomePage_Page;
import Pages.IntroductionPage_Page;
import Pages.PracticePage_Page;
import Pages.SigninPage_Page;
import Pages.TimecomplexityPage_Page;
import Pages.TreeHomePage_Page;
import Pages.TreePage_Page;
import Pages.TryHerePage_Page;
import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tree_SD  extends TestBase
{
	HomePage_Page homepage;
	IntroductionPage_Page introPage;
	SigninPage_Page signinPage;
	Datastructure_Page  datastructurePage;
	DatastructureHomePage_Page datastructureHomePage;
	TreePage_Page treePage;
	TreeHomePage_Page  treehomepage_page;
	TryHerePage_Page tryherePage;
	TimecomplexityPage_Page timecomplexitypage_page;
	PracticePage_Page practicePage;
	public Tree_SD() throws IOException {
		super();
		                                          
	}                                                                                                                                                                                                         

@Given("The user is on the Tree page")
public void the_user_is_on_the_tree_page() throws IOException, InterruptedException {
	
	initialization();
	homepage = new HomePage_Page();
	introPage = homepage.clickGetStartButton();
	introPage = new IntroductionPage_Page();
	signinPage=introPage.clickSignin();
	signinPage = new SigninPage_Page();
	signinPage.dsalgoportalLogin("Starplayers", "Star@123");
	datastructurePage = new Datastructure_Page();
	treePage=  new TreePage_Page();
	treePage.verifySignedinUser();
	Assert.assertTrue(true);
	
}

@When("The user clicks Overview of Trees link")
public void the_user_clicks_overview_of_trees_link() throws IOException, InterruptedException {
	
	treehomepage_page = datastructurePage.treeGetStartBtn();
	
}

@Then("The user should be redirected to Overview of Trees page")
public void  the_user_should_be_redirected_to_overview_of_trees_page() throws IOException {
	treehomepage_page = new TreeHomePage_Page();
	String treeintro = treehomepage_page.verifyTreeIntropage();
	System.out.println(treeintro);
	Assert.assertEquals(treeintro, "Tree");

}
 // Scenario 2 

	
	  @Given("The user is in the Tree page after logged in") public void
	  the_user_is_in_the_tree_page_after_logged_in() throws IOException,
	  InterruptedException { 
	  initialization(); 
	  homepage = new HomePage_Page();
	  introPage = homepage.clickGetStartButton(); 
	  introPage = new IntroductionPage_Page(); 
	  signinPage=introPage.clickSignin();
	  signinPage = new SigninPage_Page(); 
	  signinPage.dsalgoportalLogin("Starplayers", "Star@123");
	  datastructurePage = new Datastructure_Page(); 
	  treePage= new TreePage_Page();
	  treePage.verifySignedinUser(); 
	  treehomepage_page =datastructurePage.treeGetStartBtn();
	  
	  }
	  

@When("The user clicks Overview of Trees")
public void the_user_clicks_overview_of_trees() throws IOException {
	treehomepage_page = new TreeHomePage_Page();
	treehomepage_page.clickoverviewofTrees();
}

@Then("The user should be directed to Overview of Trees Page")
public void the_user_should_be_directed_to_overview_of_trees_page() {
	treehomepage_page.verifyoverviewofTrees();
		
	}

@When("The user clicks Terminologies")
public void the_user_clicks_terminologies() throws IOException {
	treehomepage_page.clickTerminologies();
	
}

@Then("The user should be directed to Terminologies Page")
public void the_user_should_be_directed_to_terminologies_page() {
    treehomepage_page.verifyterminologies();
}

@When("The user clicks Types of Trees")
public void the_user_clicks_types_of_trees() throws IOException {
	treehomepage_page.clicktypesofTrees();
}

@Then("The user should be directed to Types of Trees Page")
public void the_user_should_be_directed_to_types_of_trees_page() {
    treehomepage_page.verifytypeoftrees();
}

@When("The user clicks TraversalsIllustration")
 public void the_user_clicks_traversals_illustration() throws IOException {
	treehomepage_page.clicktraversalsIllustration();
} 

@Then("The user should be directed to TraversalsIllustration Page")
public void the_user_should_be_directed_to_traversals_illustration_page() {
    treehomepage_page.verifyclicktraversalsIllustration();
}



@When("The user clicks Binary Trees")
 public void the_user_clicks_binary_trees() throws IOException {
	treehomepage_page.clickBinaryTrees();
}

@Then("The user should be directed to Binary Trees Page")
public void the_user_should_be_directed_to_binary_trees_page() {
    treehomepage_page.verifyclickBinaryTrees();
}

@When("The user clicks Types of Binary Trees")
public void the_user_clicks_types_of_binary_trees() throws IOException {
	treehomepage_page.clickTypesofBinaryTree();
} 

@Then("The user should be directed to Types of Binary Trees Page")
public void the_user_should_be_directed_to_types_of_binary_trees_page() {
    treehomepage_page.verifyTypesofBinaryTree();
}

@When("The user clicks Implementation in Python")
public void the_user_clicks_implementation_in_python() throws IOException {
	treehomepage_page.clcikImplementationinPython();
    
}

@Then("The user should be directed to Implementation in Python Page")
public void the_user_should_be_directed_to_implementation_in_python_page() {
    treehomepage_page.verifyImplementationinPython();
}
@When("The user clicks Binary Tree Traversals")
public void the_user_clicks_binary_tree_traversals() throws IOException {
	treehomepage_page.clickBinaryTreeTraversals();
}

@Then("The user should be directed to Binary Tree Traversals Page")
public void the_user_should_be_directed_to_binary_tree_traversals_page() {
    treehomepage_page.verifyBinaryTreeTraversals();
}


@When("The user clicks Applications of Binary trees")
public void the_user_clicks_applications_of_binary_trees() throws IOException {
	treehomepage_page.clickApplicationsofBinaryTrees();
   
}

@Then("The user should be directed to Applications of Binary trees Page")
public void the_user_should_be_directed_to_applications_of_binary_trees_page() {
    
	treehomepage_page.verifyApplicationsofBinaryTrees();
}


@When("The user clicks Binary Search Trees")
public void the_user_clicks_binary_search_trees() throws IOException {
	treehomepage_page.clickBinarySearchTrees();
    
}

@Then("The user should be directed to Binary Search Trees Page")
public void the_user_should_be_directed_to_binary_search_trees_page() {
    treehomepage_page.verifyBinarySearchTrees();
}

@When("The user clicks Implementation of BST")
public void the_user_clicks_implementation_of_bts() throws IOException {
	treehomepage_page.clickBST();
    
}

@Then("The user should be directed to Implementation of BST Page")
public void the_user_should_be_directed_to_implementation_of_bts_page() {
   treehomepage_page.verifyBST();
}




  //Scenario 3
  
  @Given("The user is in the Overview of Treestry Editor Page") 
  public void the_user_is_in_the_overview_of_trees_try_editor_page() throws IOException,InterruptedException {
  
 initialization();
  homepage = new HomePage_Page(); 
  introPage =homepage.clickGetStartButton();
  introPage = new IntroductionPage_Page();
  signinPage=introPage.clickSignin(); 
  signinPage = new SigninPage_Page();
  signinPage.dsalgoportalLogin("Starplayers", "Star@123"); 
  datastructurePage = new Datastructure_Page(); 
  treePage= new TreePage_Page();
  treePage.verifySignedinUser(); 
  treehomepage_page =datastructurePage.treeGetStartBtn(); 
  treehomepage_page = new TreeHomePage_Page(); String treeintro =
  treehomepage_page.verifyTreeIntropage(); 
  Assert.assertEquals(treeintro, "Tree"); 
  treehomepage_page = new TreeHomePage_Page();
  treehomepage_page.clickoverviewofTrees();
  treehomepage_page.verifyoverviewofTrees();
  tryherePage= new TryHerePage_Page();
  timecomplexitypage_page = new TimecomplexityPage_Page();
  timecomplexitypage_page.clickTryHere();
  
  }
  
  @When("The User writes Valid python code and clicks Run button in Tree")
  public void the_user_writes_valid_python_code_and_clicks_run_button_in_tree() throws IOException, InterruptedException { 
	  tryherePage = new TryHerePage_Page();
	  String code = "print "+'"'+"hello"+'"';
  tryherePage.executeCode(code);
  
  
  }
  
  @Then("User is able to see the output in console in Tree Try Editor Page")
  public void user_is_able_to_see_the_output_in_console_in_tree_try_editor_page() {
  System.out.print("Console output"); 
  tryherePage.verifyConsoleOutput(); }
  
  @Given("The user is in the Terminologiestry Editor Page") 
  public void the_user_is_in_the_terminologies_try_editor_page() throws IOException, InterruptedException {
  
  initialization(); homepage = new HomePage_Page(); 
  introPage =
  homepage.clickGetStartButton();
  introPage = new IntroductionPage_Page();
  signinPage=introPage.clickSignin(); 
  signinPage = new SigninPage_Page();
  signinPage.dsalgoportalLogin("Starplayers", "Star@123"); 
  datastructurePage = new Datastructure_Page(); 
  treePage= new TreePage_Page();
  treePage.verifySignedinUser();
  treehomepage_page=datastructurePage.treeGetStartBtn(); 
 String treeintro =treehomepage_page.verifyTreeIntropage(); 
 Assert.assertEquals(treeintro,"Tree"); 
  treehomepage_page.clickTerminologies();
  treehomepage_page.verifyterminologies();
  timecomplexitypage_page = new TimecomplexityPage_Page();
  timecomplexitypage_page.clickTryHere();
  }
  
	
	  @Given("The user is in the Types of Treestry Editor Page") 
	  public void the_user_is_in_the_types_of_trees_try_editor_page() throws IOException, InterruptedException 
	  
	  {
	  
	  initialization(); homepage = new HomePage_Page(); 
	  introPage =
	  homepage.clickGetStartButton();
	  introPage = new IntroductionPage_Page();
	  signinPage=introPage.clickSignin(); 
	  signinPage = new SigninPage_Page();
	  signinPage.dsalgoportalLogin("Starplayers", "Star@123"); datastructurePage =
	  new Datastructure_Page(); 
	  treePage= new TreePage_Page();
	  treePage.verifySignedinUser();
	  treehomepage_page =datastructurePage.treeGetStartBtn(); 
	 String treeintro =treehomepage_page.verifyTreeIntropage(); 
	 Assert.assertEquals(treeintro, "Tree"); 
	  treehomepage_page.clickTerminologies();
	  treehomepage_page.verifyterminologies();
	  timecomplexitypage_page = new TimecomplexityPage_Page();
	  timecomplexitypage_page.clickTryHere();
	  }
	 
	  @Then("User is able to see the output in console in Tree try editor page")
	  public void user_is_able_to_see_the_output_in_console_in_tree_try_editor_page1() {
		  System.out.print("Console output"); 
		  tryherePage.verifyConsoleOutput(); 

	  }
  
  
  @Given("The user is in the TraversalsIllustrationtry Editor Page") 
  public void the_user_is_in_the_traversals_illustration_try_editor_page() throws IOException, InterruptedException {
  
	  initialization(); homepage = new HomePage_Page(); 
	  introPage =homepage.clickGetStartButton();
	  introPage = new IntroductionPage_Page();
			  signinPage=introPage.clickSignin(); 
			  signinPage = new SigninPage_Page();
			  signinPage.dsalgoportalLogin("Starplayers", "Star@123"); 
			  datastructurePage =new Datastructure_Page();
			  treePage= new TreePage_Page();
			  treePage.verifySignedinUser(); 
			  treehomepage_page=datastructurePage.treeGetStartBtn(); 
			  treehomepage_page = new TreeHomePage_Page(); 
			  String treeintro =
			  treehomepage_page.verifyTreeIntropage();
			  Assert.assertEquals(treeintro, "Tree"); 
			  treehomepage_page.clicktraversalsIllustration();
			  treehomepage_page.verifyclicktraversalsIllustration();
			  timecomplexitypage_page = new TimecomplexityPage_Page();
			  timecomplexitypage_page.clickTryHere();
  }
  
 

  
  @Given("The user is in the Binary Treestry Editor Page") public void
  the_user_is_in_the_binary_trees_try_editor_page() throws IOException, InterruptedException {
	  initialization(); 
	  homepage = new HomePage_Page(); 
	  introPage =homepage.clickGetStartButton(); 
	  introPage = new IntroductionPage_Page();
			  signinPage=introPage.clickSignin(); 
			  signinPage = new SigninPage_Page();
			  signinPage.dsalgoportalLogin("Starplayers", "Star@123"); 
			  datastructurePage =new Datastructure_Page(); 
			  treePage= new TreePage_Page();
			  treePage.verifySignedinUser(); 			  
			  treehomepage_page=datastructurePage.treeGetStartBtn(); 
			  treehomepage_page = new TreeHomePage_Page(); String treeintro =
			  treehomepage_page.verifyTreeIntropage(); 
			  Assert.assertEquals(treeintro,"Tree"); 
			  treehomepage_page.clickBinaryTrees();
			  treehomepage_page.verifyclickBinaryTrees();
			  timecomplexitypage_page = new TimecomplexityPage_Page();
			  timecomplexitypage_page.clickTryHere();
  
  }
  
  @Given("The user is in the Types of Binary Treestry Editor Page") public
  void the_user_is_in_the_types_of_binary_trees_try_editor_page() throws IOException, InterruptedException {
	  
	  
	  initialization(); homepage = new HomePage_Page(); 
	  introPage =homepage.clickGetStartButton(); 
	  introPage = new IntroductionPage_Page();
			  signinPage=introPage.clickSignin(); 
			  signinPage = new SigninPage_Page();
			  signinPage.dsalgoportalLogin("Starplayers", "Star@123"); 
			  datastructurePage =new Datastructure_Page(); treePage= new TreePage_Page();
			  treePage.verifySignedinUser(); 
			  treehomepage_page  =datastructurePage.treeGetStartBtn(); 
			  treehomepage_page = new TreeHomePage_Page(); String treeintro =
			  treehomepage_page.verifyTreeIntropage(); 
			  Assert.assertEquals(treeintro,"Tree"); 
			  treehomepage_page.clickTypesofBinaryTree();
			  treehomepage_page.verifyTypesofBinaryTree();
			  timecomplexitypage_page = new TimecomplexityPage_Page();
			  timecomplexitypage_page.clickTryHere();
  
  }
  
  @Given("The user is in the Implementation in Pythontry Editor Page") public
  void the_user_is_in_the_implementation_in_python_try_editor_page() throws IOException, InterruptedException {
	  
	  
	  initialization(); 
	  homepage = new HomePage_Page(); 
	  introPage =homepage.clickGetStartButton(); 
	  introPage = new IntroductionPage_Page();
			  signinPage=introPage.clickSignin();
			  signinPage = new SigninPage_Page();
			  signinPage.dsalgoportalLogin("Starplayers", "Star@123"); 
			  datastructurePage =  new Datastructure_Page(); 
			  treePage= new TreePage_Page();
			  treePage.verifySignedinUser(); 
			  treehomepage_page =datastructurePage.treeGetStartBtn();
			  treehomepage_page = new TreeHomePage_Page(); 
			  String treeintro =  treehomepage_page.verifyTreeIntropage(); 
			  Assert.assertEquals(treeintro,"Tree"); 
			  treehomepage_page.clcikImplementationinPython();
			  treehomepage_page.verifyImplementationinPython();
			  timecomplexitypage_page = new TimecomplexityPage_Page();
			  timecomplexitypage_page.clickTryHere();
  
  
  }
  
  @Given("The user is in the Binary Tree Traversalstry Editor Page") public
  void the_user_is_in_the_binary_tree_traversals_try_editor_page() throws IOException, InterruptedException {
	  
	  

	  initialization(); homepage = new HomePage_Page(); 
	  introPage =  homepage.clickGetStartButton(); 
	  introPage = new IntroductionPage_Page();
			  signinPage=introPage.clickSignin(); 
			  signinPage = new SigninPage_Page();
			  signinPage.dsalgoportalLogin("Starplayers", "Star@123");
			  datastructurePage =new Datastructure_Page(); 
			  treePage= new TreePage_Page();
			  treePage.verifySignedinUser(); 
			  treehomepage_page =datastructurePage.treeGetStartBtn(); 
			  treehomepage_page = new TreeHomePage_Page(); 
			  String treeintro =treehomepage_page.verifyTreeIntropage(); 
			  Assert.assertEquals(treeintro,"Tree"); 
			  treehomepage_page.clickBinaryTreeTraversals();
			  treehomepage_page.verifyBinaryTreeTraversals();
			  timecomplexitypage_page = new TimecomplexityPage_Page();
			  timecomplexitypage_page.clickTryHere();
  
  }
  
  @Given("The user is in the Applications of Binary treestry Editor Page")
  public void the_user_is_in_the_applications_of_binary_trees_try_editor_page() throws IOException, InterruptedException
  {

	  initialization(); homepage = new HomePage_Page(); 
	  introPage =  homepage.clickGetStartButton(); 
	  introPage = new IntroductionPage_Page();
			  signinPage=introPage.clickSignin(); 
			  signinPage = new SigninPage_Page();
			  signinPage.dsalgoportalLogin("Starplayers", "Star@123");
			  datastructurePage =new Datastructure_Page(); 
			  treePage= new TreePage_Page();
			  treePage.verifySignedinUser(); 
			  treehomepage_page =datastructurePage.treeGetStartBtn(); 
			  treehomepage_page = new TreeHomePage_Page(); 
			  String treeintro = treehomepage_page.verifyTreeIntropage(); 
			  Assert.assertEquals(treeintro, "Tree"); 
			  treehomepage_page.clickApplicationsofBinaryTrees();
			  treehomepage_page.verifyApplicationsofBinaryTrees();
			  timecomplexitypage_page = new TimecomplexityPage_Page();
			  timecomplexitypage_page.clickTryHere();
  }
  @Given("The user is in the Binary Search Treestry Editor Page") 
  public void the_user_is_in_the_binary_search_trees_try_editor_page() throws IOException, InterruptedException {
	  initialization(); homepage = new HomePage_Page(); 
	  introPage =  homepage.clickGetStartButton(); 
	  introPage = new IntroductionPage_Page();
			  signinPage=introPage.clickSignin(); 
			  signinPage = new SigninPage_Page();
			  signinPage.dsalgoportalLogin("Starplayers", "Star@123");
			  datastructurePage =new Datastructure_Page(); 
			  treePage= new TreePage_Page();
			  treePage.verifySignedinUser(); 
			  treehomepage_page =datastructurePage.treeGetStartBtn();
			  treehomepage_page = new TreeHomePage_Page(); 
			  String treeintro = treehomepage_page.verifyTreeIntropage(); 
			  Assert.assertEquals(treeintro, "Tree"); 
			  treehomepage_page.clickBinarySearchTrees();
			  treehomepage_page.verifyBinarySearchTrees();
			  timecomplexitypage_page = new TimecomplexityPage_Page();
			  timecomplexitypage_page.clickTryHere();
  }
  
  @Given("The user is in the Implementation of BSTtry Editor Page") public
  void the_user_is_in_the_implementation_of_bst_try_editor_page() throws IOException, InterruptedException {
	  
	  
	  initialization(); homepage = new HomePage_Page(); 
	  introPage =  homepage.clickGetStartButton(); 
	  introPage = new IntroductionPage_Page();
			  signinPage=introPage.clickSignin(); 
			  signinPage = new SigninPage_Page();
			  signinPage.dsalgoportalLogin("Starplayers", "Star@123");
			  datastructurePage =new Datastructure_Page(); 
			  treePage= new TreePage_Page();
			  treePage.verifySignedinUser(); 
			  treehomepage_page  =datastructurePage.treeGetStartBtn(); 
			  treehomepage_page = new TreeHomePage_Page(); 
			  String treeintro = treehomepage_page.verifyTreeIntropage(); 
			  Assert.assertEquals(treeintro,"Tree"); 
			  treehomepage_page.clickBST();
			  treehomepage_page.verifyBST();
			  timecomplexitypage_page = new TimecomplexityPage_Page();
			  timecomplexitypage_page.clickTryHere();
  }
  
  
// Scenario 4: Invalid python code execution
	@Given("The user is in the Overview of Trees try Editor Page")
	public void the_user_is_in_the_overview_of_trees_try_editor_page1() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		treePage=  new TreePage_Page();
		treePage.verifySignedinUser();
		Assert.assertTrue(true);
		treehomepage_page=datastructurePage.treeGetStartBtn(); 
		treehomepage_page = new TreeHomePage_Page(); 
		String treeintro =treehomepage_page.verifyTreeIntropage(); 
		Assert.assertEquals(treeintro,"Tree");
		treehomepage_page = new TreeHomePage_Page();
		treehomepage_page.clickoverviewofTrees();
		treehomepage_page.verifyoverviewofTrees();
		tryherePage= new TryHerePage_Page();
		timecomplexitypage_page = new TimecomplexityPage_Page();
		timecomplexitypage_page.clickTryHere();
		
	}

	@When("The User writes invalid python code and clicks Run button in Tree")
	public void the_user_writes_invalid_python_code_and_clicks_run_button_in_tree() throws IOException, InterruptedException {
		
		String code = "hello"; 
		tryherePage = new TryHerePage_Page (); 
		tryherePage.executeinvalidcode(code);
	}

	@Then("User is able to see the error msg in pop up window in Tree Try Editor Page")
	public void user_is_able_to_see_the_error_msg_in_pop_up_window_in_tree_try_editor_page() throws IOException {
		tryherePage = new TryHerePage_Page ();
		tryherePage.getAlertMessage();
		
	}

	@Then("The user click the ok button in the alert window in Tree Try Editor Page")
	public void the_user_click_the_ok_button_in_the_alert_window_in_tree_try_editor_page() throws IOException {
		tryherePage = new TryHerePage_Page ();
		tryherePage.clickOkOnAlert();
		
	}

	@Then("The user is on the same page having Editor and Run button in Tree Try Editor Page")
	public void the_user_is_on_the_same_page_having_editor_and_run_button_in_tree_try_editor_page() throws InterruptedException {
		String title =tryherePage.validateTryHerePageTitle(); 
		Assert.assertEquals("Assessment",title);
		
	}

	@Given("The user is in the Terminologies try Editor Page")
	public void the_user_is_in_the_terminologies_try_editor_page1() throws InterruptedException, IOException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		treePage=  new TreePage_Page();
		treePage.verifySignedinUser();
		Assert.assertTrue(true);
		treehomepage_page=datastructurePage.treeGetStartBtn(); 
		treehomepage_page = new TreeHomePage_Page(); 
		String treeintro =treehomepage_page.verifyTreeIntropage(); 
		Assert.assertEquals(treeintro,"Tree");
		treehomepage_page = new TreeHomePage_Page();
		treehomepage_page.clickoverviewofTrees();
		treehomepage_page.verifyoverviewofTrees();
		tryherePage= new TryHerePage_Page();
		timecomplexitypage_page = new TimecomplexityPage_Page();
		timecomplexitypage_page.clickTryHere();
		
	}
	
	@Given("The user is in the Types of Trees try Editor Page")
	public void the_user_is_in_the_types_of_trees_try_editor_page1() throws InterruptedException, IOException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		treePage=  new TreePage_Page();
		treePage.verifySignedinUser();
		Assert.assertTrue(true);
		treehomepage_page=datastructurePage.treeGetStartBtn(); 
		treehomepage_page = new TreeHomePage_Page(); 
		String treeintro =treehomepage_page.verifyTreeIntropage(); 
		Assert.assertEquals(treeintro,"Tree");
		treehomepage_page = new TreeHomePage_Page();
		treehomepage_page.clickoverviewofTrees();
		treehomepage_page.verifyoverviewofTrees();
		tryherePage= new TryHerePage_Page();
		timecomplexitypage_page = new TimecomplexityPage_Page();
		timecomplexitypage_page.clickTryHere();
		
	}
	
	@Given("The user is in the TraversalsIllustration try Editor Page")
	public void the_user_is_in_the_traversals_illustration_try_editor_page1() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		treePage=  new TreePage_Page();
		treePage.verifySignedinUser();
		Assert.assertTrue(true);
		treehomepage_page=datastructurePage.treeGetStartBtn(); 
		treehomepage_page = new TreeHomePage_Page(); 
		String treeintro =treehomepage_page.verifyTreeIntropage(); 
		Assert.assertEquals(treeintro,"Tree");
		treehomepage_page = new TreeHomePage_Page();
		treehomepage_page.clickoverviewofTrees();
		treehomepage_page.verifyoverviewofTrees();
		tryherePage= new TryHerePage_Page();
		timecomplexitypage_page = new TimecomplexityPage_Page();
		timecomplexitypage_page.clickTryHere();
	}
	

	@Given("The user is in the Binary Trees try Editor Page")
	public void the_user_is_in_the_binary_trees_try_editor_page1() throws IOException, InterruptedException {
	    
	


	initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		treePage=  new TreePage_Page();
		treePage.verifySignedinUser();
		Assert.assertTrue(true);
		treehomepage_page=datastructurePage.treeGetStartBtn(); 
		treehomepage_page = new TreeHomePage_Page(); 
		String treeintro =treehomepage_page.verifyTreeIntropage(); 
		Assert.assertEquals(treeintro,"Tree");
		treehomepage_page = new TreeHomePage_Page();
		treehomepage_page.clickoverviewofTrees();
		treehomepage_page.verifyoverviewofTrees();
		tryherePage= new TryHerePage_Page();
		timecomplexitypage_page = new TimecomplexityPage_Page();
		timecomplexitypage_page.clickTryHere();
	}
	
	
	@Given("The user is in the Types of Binary Trees try Editor Page")
	public void the_user_is_in_the_types_of_binary_trees_try_editor_page1() throws IOException, InterruptedException {
		
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		treePage=  new TreePage_Page();
		treePage.verifySignedinUser();
		Assert.assertTrue(true);
		treehomepage_page=datastructurePage.treeGetStartBtn(); 
		treehomepage_page = new TreeHomePage_Page(); 
		String treeintro =treehomepage_page.verifyTreeIntropage(); 
		Assert.assertEquals(treeintro,"Tree");
		treehomepage_page = new TreeHomePage_Page();
		treehomepage_page.clickoverviewofTrees();
		treehomepage_page.verifyoverviewofTrees();
		tryherePage= new TryHerePage_Page();
		timecomplexitypage_page = new TimecomplexityPage_Page();
		timecomplexitypage_page.clickTryHere();
	    
	}



	
	@Given("The user is in the Implementation in Python try Editor Page")
	public void the_user_is_in_the_implementation_in_python_try_editor_page1() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		treePage=  new TreePage_Page();
		treePage.verifySignedinUser();
		Assert.assertTrue(true);
		treehomepage_page=datastructurePage.treeGetStartBtn(); 
		treehomepage_page = new TreeHomePage_Page(); 
		String treeintro =treehomepage_page.verifyTreeIntropage(); 
		Assert.assertEquals(treeintro,"Tree");
		treehomepage_page = new TreeHomePage_Page();
		treehomepage_page.clickoverviewofTrees();
		treehomepage_page.verifyoverviewofTrees();
		tryherePage= new TryHerePage_Page();
		timecomplexitypage_page = new TimecomplexityPage_Page();
		timecomplexitypage_page.clickTryHere();
	}
	
	@Given("The user is in the Binary Tree Traversals try Editor Page")
	public void the_user_is_in_the_binary_tree_traversals_try_editor_page1() throws IOException, InterruptedException {
		
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		treePage=  new TreePage_Page();
		treePage.verifySignedinUser();
		Assert.assertTrue(true);
		treehomepage_page=datastructurePage.treeGetStartBtn(); 
		treehomepage_page = new TreeHomePage_Page(); 
		String treeintro =treehomepage_page.verifyTreeIntropage(); 
		Assert.assertEquals(treeintro,"Tree");
		treehomepage_page = new TreeHomePage_Page();
		treehomepage_page.clickoverviewofTrees();
		treehomepage_page.verifyoverviewofTrees();
		tryherePage= new TryHerePage_Page();
		timecomplexitypage_page = new TimecomplexityPage_Page();
		timecomplexitypage_page.clickTryHere();
	}
	
	@Given("The user is in the Applications of Binary trees try Editor Page")
	public void the_user_is_in_the_applications_of_binary_trees_try_editor_page1() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		treePage=  new TreePage_Page();
		treePage.verifySignedinUser();
		Assert.assertTrue(true);
		treehomepage_page=datastructurePage.treeGetStartBtn(); 
		treehomepage_page = new TreeHomePage_Page(); 
		String treeintro =treehomepage_page.verifyTreeIntropage(); 
		Assert.assertEquals(treeintro,"Tree");
		treehomepage_page = new TreeHomePage_Page();
		treehomepage_page.clickoverviewofTrees();
		treehomepage_page.verifyoverviewofTrees();
		tryherePage= new TryHerePage_Page();
		timecomplexitypage_page = new TimecomplexityPage_Page();
		timecomplexitypage_page.clickTryHere();
	}
	@Given("The user is in the Binary Search Trees try Editor Page")
	public void the_user_is_in_the_binary_search_trees_try_editor_page1() throws IOException, InterruptedException {
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		treePage=  new TreePage_Page();
		treePage.verifySignedinUser();
		Assert.assertTrue(true);
		treehomepage_page=datastructurePage.treeGetStartBtn(); 
		treehomepage_page = new TreeHomePage_Page(); 
		String treeintro =treehomepage_page.verifyTreeIntropage(); 
		Assert.assertEquals(treeintro,"Tree");
		treehomepage_page = new TreeHomePage_Page();
		treehomepage_page.clickoverviewofTrees();
		treehomepage_page.verifyoverviewofTrees();
		tryherePage= new TryHerePage_Page();
		timecomplexitypage_page = new TimecomplexityPage_Page();
		timecomplexitypage_page.clickTryHere();
		
	}
	@Given("The user is in the Implementation of BST try Editor Page")
	public void the_user_is_in_the_implementation_of_bst_try_editor_page1() throws IOException, InterruptedException {
		
		initialization();
		homepage = new HomePage_Page();
		introPage = homepage.clickGetStartButton();
		introPage = new IntroductionPage_Page();
		signinPage=introPage.clickSignin();
		signinPage = new SigninPage_Page();
		signinPage.dsalgoportalLogin("Starplayers", "Star@123");
		datastructurePage = new Datastructure_Page();
		treePage=  new TreePage_Page();
		treePage.verifySignedinUser();
		Assert.assertTrue(true);
		treehomepage_page=datastructurePage.treeGetStartBtn(); 
		treehomepage_page = new TreeHomePage_Page(); 
		String treeintro =treehomepage_page.verifyTreeIntropage(); 
		Assert.assertEquals(treeintro,"Tree");
		treehomepage_page = new TreeHomePage_Page();
		treehomepage_page.clickoverviewofTrees();
		treehomepage_page.verifyoverviewofTrees();
		tryherePage= new TryHerePage_Page();
		timecomplexitypage_page = new TimecomplexityPage_Page();
		timecomplexitypage_page.clickTryHere();
	    
	}
//practice page

@Given("The user is in the Overview of Trees Page")
public void the_user_is_in_the_overview_of_trees_page() throws IOException, InterruptedException {
	
	initialization();
	homepage = new HomePage_Page();
	introPage = homepage.clickGetStartButton();
	introPage = new IntroductionPage_Page();
	signinPage=introPage.clickSignin();
	signinPage = new SigninPage_Page();
	signinPage.dsalgoportalLogin("Starplayers", "Star@123");
	datastructurePage = new Datastructure_Page();
	treePage=  new TreePage_Page();
	treePage.verifySignedinUser();
	Assert.assertTrue(true);
	treehomepage_page=datastructurePage.treeGetStartBtn(); 
	treehomepage_page = new TreeHomePage_Page(); 
	String treeintro =treehomepage_page.verifyTreeIntropage(); 
	Assert.assertEquals(treeintro,"Tree");
	treehomepage_page = new TreeHomePage_Page();
	treehomepage_page.clickoverviewofTrees();
	treehomepage_page.verifyoverviewofTrees();
	tryherePage= new TryHerePage_Page();
	
}

@When("The user clicks Practice Questions in Overview of Trees Page")
public void the_user_clicks_practice_questions_in_overview_of_trees_page() throws IOException {
	timecomplexitypage_page= new TimecomplexityPage_Page();
	practicePage=timecomplexitypage_page.practiceLinkclick();
}

@Then("The user should be directed to Practice Questions page of Tree")
public void the_user_should_be_directed_to_practice_questions_page_of_tree() throws IOException {
	practicePage = new PracticePage_Page();
	practicePage.validatePracticePage();
}

@Given("The user is in the Terminologies Page")
public void the_user_is_in_the_terminologies_page() throws IOException, InterruptedException {
	initialization();
	homepage = new HomePage_Page();
	introPage = homepage.clickGetStartButton();
	introPage = new IntroductionPage_Page();
	signinPage=introPage.clickSignin();
	signinPage = new SigninPage_Page();
	signinPage.dsalgoportalLogin("Starplayers", "Star@123");
	datastructurePage = new Datastructure_Page();
	treePage=  new TreePage_Page();
	treePage.verifySignedinUser();
	Assert.assertTrue(true);
	treehomepage_page=datastructurePage.treeGetStartBtn(); 
	treehomepage_page = new TreeHomePage_Page(); 
	String treeintro =treehomepage_page.verifyTreeIntropage(); 
	Assert.assertEquals(treeintro,"Tree");
	treehomepage_page = new TreeHomePage_Page();
	treehomepage_page.clickoverviewofTrees();
	treehomepage_page.verifyoverviewofTrees();
	tryherePage= new TryHerePage_Page();
}

@When("The user clicks Practice Questions in Terminologies Page")
public void the_user_clicks_practice_questions_in_terminologies_page() throws IOException {
	timecomplexitypage_page= new TimecomplexityPage_Page();
	practicePage=timecomplexitypage_page.practiceLinkclick();
}

@Given("The user is in the Types of Trees Page")
public void the_user_is_in_the_types_of_trees_page() throws IOException, InterruptedException {
	initialization();
	homepage = new HomePage_Page();
	introPage = homepage.clickGetStartButton();
	introPage = new IntroductionPage_Page();
	signinPage=introPage.clickSignin();
	signinPage = new SigninPage_Page();
	signinPage.dsalgoportalLogin("Starplayers", "Star@123");
	datastructurePage = new Datastructure_Page();
	treePage=  new TreePage_Page();
	treePage.verifySignedinUser();
	Assert.assertTrue(true);
	treehomepage_page=datastructurePage.treeGetStartBtn(); 
	treehomepage_page = new TreeHomePage_Page(); 
	String treeintro =treehomepage_page.verifyTreeIntropage(); 
	Assert.assertEquals(treeintro,"Tree");
	treehomepage_page = new TreeHomePage_Page();
	treehomepage_page.clickoverviewofTrees();
	treehomepage_page.verifyoverviewofTrees();
	tryherePage= new TryHerePage_Page();
}

@When("The user clicks Practice Questions in Types of Trees Page")
public void the_user_clicks_practice_questions_in_types_of_trees_page() throws IOException {
	timecomplexitypage_page= new TimecomplexityPage_Page();
	practicePage=timecomplexitypage_page.practiceLinkclick();
}

@Given("The user is in the TraversalsIllustration Page")
public void the_user_is_in_the_traversals_illustration_page() throws IOException, InterruptedException {
	initialization();
	homepage = new HomePage_Page();
	introPage = homepage.clickGetStartButton();
	introPage = new IntroductionPage_Page();
	signinPage=introPage.clickSignin();
	signinPage = new SigninPage_Page();
	signinPage.dsalgoportalLogin("Starplayers", "Star@123");
	datastructurePage = new Datastructure_Page();
	treePage=  new TreePage_Page();
	treePage.verifySignedinUser();
	Assert.assertTrue(true);
	treehomepage_page=datastructurePage.treeGetStartBtn(); 
	treehomepage_page = new TreeHomePage_Page(); 
	String treeintro =treehomepage_page.verifyTreeIntropage(); 
	Assert.assertEquals(treeintro,"Tree");
	treehomepage_page = new TreeHomePage_Page();
	treehomepage_page.clickoverviewofTrees();
	treehomepage_page.verifyoverviewofTrees();
	tryherePage= new TryHerePage_Page();
}

@When("The user clicks Practice Questions in TraversalsIllustration Page")
public void the_user_clicks_practice_questions_in_traversals_illustration_page() throws IOException {
	timecomplexitypage_page= new TimecomplexityPage_Page();
	practicePage=timecomplexitypage_page.practiceLinkclick();
}
@Given("The user is in the Binary Trees Page")
public void the_user_is_in_the_binary_trees_page() throws IOException, InterruptedException {
	initialization();
	homepage = new HomePage_Page();
	introPage = homepage.clickGetStartButton();
	introPage = new IntroductionPage_Page();
	signinPage=introPage.clickSignin();
	signinPage = new SigninPage_Page();
	signinPage.dsalgoportalLogin("Starplayers", "Star@123");
	datastructurePage = new Datastructure_Page();
	treePage=  new TreePage_Page();
	treePage.verifySignedinUser();
	Assert.assertTrue(true);
	treehomepage_page=datastructurePage.treeGetStartBtn(); 
	treehomepage_page = new TreeHomePage_Page(); 
	String treeintro =treehomepage_page.verifyTreeIntropage(); 
	Assert.assertEquals(treeintro,"Tree");
	treehomepage_page = new TreeHomePage_Page();
	treehomepage_page.clickoverviewofTrees();
	treehomepage_page.verifyoverviewofTrees();
	tryherePage= new TryHerePage_Page();
}

@When("The user clicks Practice Questions in Binary Trees Page")
public void the_user_clicks_practice_questions_in_binary_trees_page() throws IOException {
	timecomplexitypage_page= new TimecomplexityPage_Page();
	practicePage=timecomplexitypage_page.practiceLinkclick();
}

@Given("The user is in the Types of Binary Trees Page")
public void the_user_is_in_the_types_of_binary_trees_page() throws IOException, InterruptedException {
	initialization();
	homepage = new HomePage_Page();
	introPage = homepage.clickGetStartButton();
	introPage = new IntroductionPage_Page();
	signinPage=introPage.clickSignin();
	signinPage = new SigninPage_Page();
	signinPage.dsalgoportalLogin("Starplayers", "Star@123");
	datastructurePage = new Datastructure_Page();
	treePage=  new TreePage_Page();
	treePage.verifySignedinUser();
	Assert.assertTrue(true);
	treehomepage_page=datastructurePage.treeGetStartBtn(); 
	treehomepage_page = new TreeHomePage_Page(); 
	String treeintro =treehomepage_page.verifyTreeIntropage(); 
	Assert.assertEquals(treeintro,"Tree");
	treehomepage_page = new TreeHomePage_Page();
	treehomepage_page.clickoverviewofTrees();
	treehomepage_page.verifyoverviewofTrees();
	tryherePage= new TryHerePage_Page();
}

@When("The user clicks Practice Questions in Types of Binary Trees Page")
public void the_user_clicks_practice_questions_in_types_of_binary_trees_page() throws IOException {
	timecomplexitypage_page= new TimecomplexityPage_Page();
	practicePage=timecomplexitypage_page.practiceLinkclick();
}
@Given("The user is in the Implementation in Python Page")
public void the_user_is_in_the_implementation_in_python_page() throws IOException, InterruptedException {
	initialization();
	homepage = new HomePage_Page();
	introPage = homepage.clickGetStartButton();
	introPage = new IntroductionPage_Page();
	signinPage=introPage.clickSignin();
	signinPage = new SigninPage_Page();
	signinPage.dsalgoportalLogin("Starplayers", "Star@123");
	datastructurePage = new Datastructure_Page();
	treePage=  new TreePage_Page();
	treePage.verifySignedinUser();
	Assert.assertTrue(true);
	treehomepage_page=datastructurePage.treeGetStartBtn(); 
	treehomepage_page = new TreeHomePage_Page(); 
	String treeintro =treehomepage_page.verifyTreeIntropage(); 
	Assert.assertEquals(treeintro,"Tree");
	treehomepage_page = new TreeHomePage_Page();
	treehomepage_page.clickoverviewofTrees();
	treehomepage_page.verifyoverviewofTrees();
	tryherePage= new TryHerePage_Page();
}

@When("The user clicks Practice Questions in Implementation in Python Page")
public void the_user_clicks_practice_questions_in_implementation_in_python_page() throws IOException {
	timecomplexitypage_page= new TimecomplexityPage_Page();
	practicePage=timecomplexitypage_page.practiceLinkclick();
}

@Given("The user is in the Binary Tree Traversals Page")
public void the_user_is_in_the_binary_tree_traversals_page() throws IOException, InterruptedException {
	initialization();
	homepage = new HomePage_Page();
	introPage = homepage.clickGetStartButton();
	introPage = new IntroductionPage_Page();
	signinPage=introPage.clickSignin();
	signinPage = new SigninPage_Page();
	signinPage.dsalgoportalLogin("Starplayers", "Star@123");
	datastructurePage = new Datastructure_Page();
	treePage=  new TreePage_Page();
	treePage.verifySignedinUser();
	Assert.assertTrue(true);
	treehomepage_page=datastructurePage.treeGetStartBtn(); 
	treehomepage_page = new TreeHomePage_Page(); 
	String treeintro =treehomepage_page.verifyTreeIntropage(); 
	Assert.assertEquals(treeintro,"Tree");
	treehomepage_page = new TreeHomePage_Page();
	treehomepage_page.clickoverviewofTrees();
	treehomepage_page.verifyoverviewofTrees();
	tryherePage= new TryHerePage_Page();

}

@When("The user clicks Practice Questions in Binary Tree Traversals Page")
public void the_user_clicks_practice_questions_in_binary_tree_traversals_page() throws IOException {
	timecomplexitypage_page= new TimecomplexityPage_Page();
	practicePage=timecomplexitypage_page.practiceLinkclick();
}

@Given("The user is in the Applications of Binary trees Page")
public void the_user_is_in_the_applications_of_binary_trees_page() throws IOException, InterruptedException {
	initialization();
	homepage = new HomePage_Page();
	introPage = homepage.clickGetStartButton();
	introPage = new IntroductionPage_Page();
	signinPage=introPage.clickSignin();
	signinPage = new SigninPage_Page();
	signinPage.dsalgoportalLogin("Starplayers", "Star@123");
	datastructurePage = new Datastructure_Page();
	treePage=  new TreePage_Page();
	treePage.verifySignedinUser();
	Assert.assertTrue(true);
	treehomepage_page=datastructurePage.treeGetStartBtn(); 
	treehomepage_page = new TreeHomePage_Page(); 
	String treeintro =treehomepage_page.verifyTreeIntropage(); 
	Assert.assertEquals(treeintro,"Tree");
	treehomepage_page = new TreeHomePage_Page();
	treehomepage_page.clickoverviewofTrees();
	treehomepage_page.verifyoverviewofTrees();
	tryherePage= new TryHerePage_Page();

}

@When("The user clicks Practice Questions in Applications of Binary trees Page")
public void the_user_clicks_practice_questions_in_applications_of_binary_trees_page() throws IOException {
	timecomplexitypage_page= new TimecomplexityPage_Page();
	practicePage=timecomplexitypage_page.practiceLinkclick();
}


@Given("The user is in the Binary Search Trees Page")
public void the_user_is_in_the_binary_search_trees_page() throws IOException, InterruptedException {
	initialization();
	homepage = new HomePage_Page();
	introPage = homepage.clickGetStartButton();
	introPage = new IntroductionPage_Page();
	signinPage=introPage.clickSignin();
	signinPage = new SigninPage_Page();
	signinPage.dsalgoportalLogin("Starplayers", "Star@123");
	datastructurePage = new Datastructure_Page();
	treePage=  new TreePage_Page();
	treePage.verifySignedinUser();
	Assert.assertTrue(true);
	treehomepage_page=datastructurePage.treeGetStartBtn(); 
	treehomepage_page = new TreeHomePage_Page(); 
	String treeintro =treehomepage_page.verifyTreeIntropage(); 
	Assert.assertEquals(treeintro,"Tree");
	treehomepage_page = new TreeHomePage_Page();
	treehomepage_page.clickoverviewofTrees();
	treehomepage_page.verifyoverviewofTrees();
	tryherePage= new TryHerePage_Page();

}

@When("The user clicks Practice Questions in Binary Search Trees Page")
public void the_user_clicks_practice_questions_in_binary_search_trees_page() throws IOException {
	timecomplexitypage_page= new TimecomplexityPage_Page();
	practicePage=timecomplexitypage_page.practiceLinkclick();
}
@Given("The user is in the Implementation of BST Page")
public void the_user_is_in_the_implementation_of_bst_page() throws IOException, InterruptedException {
	initialization();
	homepage = new HomePage_Page();
	introPage = homepage.clickGetStartButton();
	introPage = new IntroductionPage_Page();
	signinPage=introPage.clickSignin();
	signinPage = new SigninPage_Page();
	signinPage.dsalgoportalLogin("Starplayers", "Star@123");
	datastructurePage = new Datastructure_Page();
	treePage=  new TreePage_Page();
	treePage.verifySignedinUser();
	Assert.assertTrue(true);
	treehomepage_page=datastructurePage.treeGetStartBtn(); 
	treehomepage_page = new TreeHomePage_Page(); 
	String treeintro =treehomepage_page.verifyTreeIntropage(); 
	Assert.assertEquals(treeintro,"Tree");
	treehomepage_page = new TreeHomePage_Page();
	treehomepage_page.clickoverviewofTrees();
	treehomepage_page.verifyoverviewofTrees();
	tryherePage= new TryHerePage_Page();

}

@When("The user clicks Practice Questions in Implementation of BST Page")
public void the_user_clicks_practice_questions_in_implementation_of_bst_page() throws IOException {
	timecomplexitypage_page= new TimecomplexityPage_Page();
	practicePage=timecomplexitypage_page.practiceLinkclick();
}


}