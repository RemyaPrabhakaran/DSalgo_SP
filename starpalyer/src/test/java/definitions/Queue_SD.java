/*
 * package definitions; import java.io.IOException;
 * 
 * import Pages.Datastructure_Page; import Pages.HomePage_Page; import
 * Pages.IntroductionPage_Page; import Pages.Queue_Page; import
 * Pages.SigninPage_Page; //import Pages.Stack_Page; import
 * Pages.TryHerePage_Page; //import Pages.operationsInStack_Page; import
 * base.TestBase; import io.cucumber.java.en.Given; import
 * io.cucumber.java.en.Then; import io.cucumber.java.en.When; import
 * junit.framework.Assert;
 * 
 * public class Queue_SD extends TestBase{
 * 
 * HomePage_Page homepage; IntroductionPage_Page introPage; SigninPage_Page
 * signinPage; Queue_Page queuePage; Datastructure_Page datastructurePage = new
 * Datastructure_Page(); String pageTitle; TryHerePage_Page tryHerePage;
 * 
 * public Queue_SD() throws IOException { super(); }
 * 
 * @When("The user clicks Get Started button below Queue") public void
 * the_user_clicks_get_started_button_below_queue() throws IOException {
 * queuePage = datastructurePage.queuegetclickstartbutton(); }
 * 
 * @Then("The user should be navigated to Queue page") public void
 * the_user_should_be_navigated_to_queue_page() throws InterruptedException {
 * pageTitle = queuePage.verifyQueuePageTitle(); Assert.assertEquals("Queue",
 * pageTitle); }
 * 
 * @Given("The user is in the Queue page after logged in") public void
 * the_user_is_in_the_queue_page_after_logged_in() throws InterruptedException,
 * IOException { initialization(); homepage = new HomePage_Page(); introPage =
 * homepage.clickGetStartButton(); introPage = new IntroductionPage_Page();
 * signinPage=introPage.clickSignin(); signinPage = new SigninPage_Page();
 * signinPage.dsalgoportalLogin("Starplayers", "Star@123"); datastructurePage =
 * new Datastructure_Page(); datastructurePage.verifySignedinUser(); queuePage =
 * datastructurePage.queuegetclickstartbutton(); }
 * 
 * @When("The user clicks Implementation of Queue in Python link") public void
 * the_user_clicks_implementation_of_queue_in_python_link() throws IOException {
 * queuePage.clickimplementationQueueLink(); }
 * 
 * @Then("The user should be directed to Implementation of Queue in Python Page"
 * ) public void
 * the_user_should_be_directed_to_implementation_of_queue_in_python_page()
 * throws InterruptedException { queuePage.verifyimplementationQueuePageTitle();
 * }
 * 
 * @When("The user clicks Implementation using collections.deque link") public
 * void the_user_clicks_implementation_using_collections_deque_link() throws
 * IOException { queuePage.clickimplementationCollectionsLink(); }
 * 
 * @Then("The user should be directed to Implementation using collections.deque Page"
 * ) public void
 * the_user_should_be_directed_to_implementation_using_collections_deque_page()
 * throws InterruptedException {
 * queuePage.verifyimplementationCollectionsLinkPageTitle(); }
 * 
 * @When("The user clicks Implementation using array link") public void
 * the_user_clicks_implementation_using_array_link() throws IOException {
 * queuePage.clickimplementationArrayLink(); }
 * 
 * @Then("The user should be directed to Implementation using array Page")
 * public void the_user_should_be_directed_to_implementation_using_array_page()
 * throws InterruptedException {
 * queuePage.verifyimplementationArrayLinkPageTitle(); }
 * 
 * @When("The user clicks Queue Operations link") public void
 * the_user_clicks_queue_operations_link() throws IOException {
 * queuePage.clickqueueOperationsLink(); }
 * 
 * @Then("The user should be directed to Queue Operations Page") public void
 * the_user_should_be_directed_to_queue_operations_page() throws
 * InterruptedException { queuePage.verifyqueueOperationsLinkPageTitle(); }
 * 
 * @Given("The user is in the Implementation of Queue in Python Page") public
 * void the_user_is_in_the_implementation_of_queue_in_python_page() throws
 * IOException, InterruptedException { initialization(); homepage = new
 * HomePage_Page(); introPage = homepage.clickGetStartButton(); introPage = new
 * IntroductionPage_Page(); signinPage=introPage.clickSignin(); signinPage = new
 * SigninPage_Page(); signinPage.dsalgoportalLogin("Starplayers", "Star@123");
 * datastructurePage = new Datastructure_Page();
 * datastructurePage.verifySignedinUser(); queuePage = new Queue_Page();
 * queuePage = datastructurePage.queuegetclickstartbutton(); queuePage =
 * queuePage.clickimplementationQueueLink(); }
 * 
 * @When("The user clicks Try Here button in Implementation of Queue in Python page"
 * ) public void
 * the_user_clicks_try_here_button_in_implementation_of_queue_in_python_page()
 * throws IOException { tryHerePage = new TryHerePage_Page(); tryHerePage =
 * queuePage.clickTryHere(); }
 * 
 * @Then("The user should be directed to Queue Try Editor Page") public void
 * the_user_should_be_directed_to_queue_try_here_editor_page() throws
 * InterruptedException { String title = tryHerePage.validateTryHerePageTitle();
 * Assert.assertEquals("Assessment", title); }
 * 
 * @Given("The user is in the Implementation using collections.deque Page")
 * public void the_user_is_in_the_implementation_using_collections_deque_page()
 * throws IOException, InterruptedException { initialization(); homepage = new
 * HomePage_Page(); introPage = homepage.clickGetStartButton(); introPage = new
 * IntroductionPage_Page(); signinPage=introPage.clickSignin(); signinPage = new
 * SigninPage_Page(); signinPage.dsalgoportalLogin("Starplayers", "Star@123");
 * datastructurePage = new Datastructure_Page();
 * datastructurePage.verifySignedinUser(); queuePage =
 * datastructurePage.queuegetclickstartbutton(); queuePage =
 * queuePage.clickimplementationCollectionsLink(); }
 * 
 * @When("The user clicks Try Here button in Implementation using collections.deque page"
 * ) public void
 * the_user_clicks_try_here_button_in_implementation_using_collections_deque_page
 * () throws IOException { tryHerePage = new TryHerePage_Page(); tryHerePage =
 * queuePage.clickTryHere(); }
 * 
 * @Given("The user is in the Implementation using array Page") public void
 * the_user_is_in_the_implementation_using_array_page() throws IOException,
 * InterruptedException { initialization(); homepage = new HomePage_Page();
 * introPage = homepage.clickGetStartButton(); introPage = new
 * IntroductionPage_Page(); signinPage=introPage.clickSignin(); signinPage = new
 * SigninPage_Page(); signinPage.dsalgoportalLogin("Starplayers", "Star@123");
 * datastructurePage = new Datastructure_Page();
 * datastructurePage.verifySignedinUser(); queuePage =
 * datastructurePage.queuegetclickstartbutton(); queuePage =
 * queuePage.clickimplementationArrayLink(); }
 * 
 * @When("The user clicks Try Here button in Implementation using array page")
 * public void
 * the_user_clicks_try_here_button_in_implementation_using_array_page() throws
 * IOException { tryHerePage = new TryHerePage_Page(); tryHerePage =
 * queuePage.clickTryHere(); }
 * 
 * @Given("The user is in the Queue Operations Page") public void
 * the_user_is_in_the_queue_operations_page() throws IOException,
 * InterruptedException { initialization(); homepage = new HomePage_Page();
 * introPage = homepage.clickGetStartButton(); introPage = new
 * IntroductionPage_Page(); signinPage=introPage.clickSignin(); signinPage = new
 * SigninPage_Page(); signinPage.dsalgoportalLogin("Starplayers", "Star@123");
 * datastructurePage = new Datastructure_Page();
 * datastructurePage.verifySignedinUser(); queuePage =
 * datastructurePage.queuegetclickstartbutton(); queuePage =
 * queuePage.clickqueueOperationsLink(); }
 * 
 * @When("The user clicks Try Here button in Queue Operations page") public void
 * the_user_clicks_try_here_button_in_queue_operations_page() throws IOException
 * { tryHerePage = new TryHerePage_Page(); tryHerePage =
 * queuePage.clickTryHere(); }
 * 
 * @Given("The user is in the Implementation of Queue in Python try Editor Page"
 * ) public void
 * the_user_is_in_the_implementation_of_queue_in_python_try_editor_page() throws
 * IOException, InterruptedException { initialization(); homepage = new
 * HomePage_Page(); introPage = homepage.clickGetStartButton(); introPage = new
 * IntroductionPage_Page(); signinPage=introPage.clickSignin(); signinPage = new
 * SigninPage_Page(); signinPage.dsalgoportalLogin("Starplayers", "Star@123");
 * datastructurePage = new Datastructure_Page();
 * datastructurePage.verifySignedinUser(); queuePage =
 * datastructurePage.queuegetclickstartbutton(); queuePage =
 * queuePage.clickimplementationQueueLink(); tryHerePage = new
 * TryHerePage_Page(); tryHerePage = queuePage.clickTryHere(); }
 * 
 * @Given("The user is in the Implementation using collections.deque try Editor Page"
 * ) public void
 * the_user_is_in_the_implementation_using_collections_deque_try_editor_page()
 * throws IOException, InterruptedException { initialization(); homepage = new
 * HomePage_Page(); introPage = homepage.clickGetStartButton(); introPage = new
 * IntroductionPage_Page(); signinPage=introPage.clickSignin(); signinPage = new
 * SigninPage_Page(); signinPage.dsalgoportalLogin("Starplayers", "Star@123");
 * datastructurePage = new Datastructure_Page();
 * datastructurePage.verifySignedinUser(); queuePage =
 * datastructurePage.queuegetclickstartbutton(); queuePage =
 * queuePage.clickimplementationCollectionsLink(); tryHerePage = new
 * TryHerePage_Page(); tryHerePage = queuePage.clickTryHere(); }
 * 
 * @Given("The user is in the Implementation using array try Editor Page")
 * public void the_user_is_in_the_implementation_using_array_try_editor_page()
 * throws IOException, InterruptedException { initialization(); homepage = new
 * HomePage_Page(); introPage = homepage.clickGetStartButton(); introPage = new
 * IntroductionPage_Page(); signinPage=introPage.clickSignin(); signinPage = new
 * SigninPage_Page(); signinPage.dsalgoportalLogin("Starplayers", "Star@123");
 * datastructurePage = new Datastructure_Page();
 * datastructurePage.verifySignedinUser(); queuePage =
 * datastructurePage.queuegetclickstartbutton(); queuePage =
 * queuePage.clickimplementationArrayLink(); tryHerePage = new
 * TryHerePage_Page(); tryHerePage = queuePage.clickTryHere(); }
 * 
 * @Given("The user is in the Queue Operations try Editor Page") public void
 * the_user_is_in_the_queue_operations_try_editor_page() throws IOException,
 * InterruptedException { initialization(); homepage = new HomePage_Page();
 * introPage = homepage.clickGetStartButton(); introPage = new
 * IntroductionPage_Page(); signinPage=introPage.clickSignin(); signinPage = new
 * SigninPage_Page(); signinPage.dsalgoportalLogin("Starplayers", "Star@123");
 * datastructurePage = new Datastructure_Page();
 * datastructurePage.verifySignedinUser(); queuePage =
 * datastructurePage.queuegetclickstartbutton(); queuePage =
 * queuePage.clickqueueOperationsLink(); tryHerePage = new TryHerePage_Page();
 * tryHerePage = queuePage.clickTryHere(); }
 * 
 * @When("The User writes Valid python code and clicks Run button in Queue")
 * public void
 * the_user_writes_valid_python_code_and_clicks_run_button_in_queue() throws
 * InterruptedException { String code = "print "+'"'+"hello"+'"';
 * tryHerePage.executeCode(code); }
 * 
 * @Then("User is able to see the output in console in Queue Try Editor Page")
 * public void
 * user_is_able_to_see_the_output_in_console_in_queue_try_editor_page() {
 * tryHerePage.verifyConsoleOutput(); }
 * 
 * @When("The User writes invalid python code and clicks Run button in Queue")
 * public void
 * the_user_writes_invalid_python_code_and_clicks_run_button_in_queue() throws
 * InterruptedException { String code = "hello"; tryHerePage.executeCode(code);
 * }
 * 
 * @Then("User is able to see the error msg in pop up window in Queue Try Editor Page"
 * ) public void
 * user_is_able_to_see_the_error_msg_in_pop_up_window_in_queue_try_editor_page()
 * { tryHerePage.getAlertMessage(); }
 * 
 * @Then("The user click the ok button in the alert window in Queue Try Editor Page"
 * ) public void
 * the_user_click_the_ok_button_in_the_alert_window_in_queue_try_editor_page() {
 * tryHerePage.clickOkOnAlert(); }
 * 
 * @Then("The user is on the same page having Editor and Run button in Queue Try Editor Page"
 * ) public void
 * the_user_is_on_the_same_page_having_editor_and_run_button_in_queue_try_editor_page
 * () throws InterruptedException { String title =
 * tryHerePage.validateTryHerePageTitle(); Assert.assertEquals("Assessment",
 * title); }
 * 
 * @When("The user clicks Practice Questions in Implementation of Queue in Python Page"
 * ) public void
 * the_user_clicks_practice_questions_in_implementation_of_queue_in_python_page(
 * ) throws IOException { //queuePage = new Queue_Page();
 * queuePage.clickPraticeQuestionsInQueue(); }
 * 
 * @Then("The user should be directed to Practice Questions page of Queue")
 * public void the_user_should_be_directed_to_practice_questions_page_of_queue()
 * { queuePage.verifyURL(); }
 * 
 * @When("The user clicks Practice Questions in Implementation using collections.deque Page"
 * ) public void
 * the_user_clicks_practice_questions_in_implementation_using_collections_deque_page
 * () throws IOException { queuePage.clickPraticeQuestionsInQueue(); }
 * 
 * @When("The user clicks Practice Questions in Implementation using array Page"
 * ) public void
 * the_user_clicks_practice_questions_in_implementation_using_array_page()
 * throws IOException { queuePage.clickPraticeQuestionsInQueue(); }
 * 
 * @When("The user clicks Practice Questions in Queue Operations Page") public
 * void the_user_clicks_practice_questions_in_queue_operations_page() throws
 * IOException { queuePage.clickPraticeQuestionsInQueue(); }
 * 
 * 
 * 
 * 
 * }
 * 
 */