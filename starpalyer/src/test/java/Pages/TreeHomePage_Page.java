package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Log.LoggerLoad;
import base.TestBase;
import junit.framework.Assert;

public class TreeHomePage_Page extends TestBase {
	
	@FindBy(xpath="//div/h4[contains(text(),'Tree')]")
	WebElement treeTitle;
	@FindBy(linkText="Starplayers")
	WebElement signeduser;
	@FindBy(linkText="Sign out")
	WebElement signOutLink;
	@FindBy(linkText ="Overview of Trees")
	WebElement overviewOfTrees;
	@FindBy(linkText ="Terminologies")
	WebElement Terminologies;
	@FindBy(linkText ="Types of Trees")
	WebElement TypeofTrees;
	@FindBy(linkText ="Tree Traversals")
	WebElement TreeTraversals;
	@FindBy(linkText="Traversals-Illustration")
	WebElement TraversalsIllustration;
	@FindBy(linkText="Binary Trees")
	WebElement BinaryTrees;
	@FindBy (linkText ="Types of Binary Trees")
	WebElement TypesofBinaryTree;
	@FindBy (linkText="Implementation in Python")
	WebElement ImplementationinPython;
	@FindBy (linkText="Binary Tree Traversals")
	WebElement BinaryTreeTraversals;
	@FindBy (linkText="Implementation of Binary Trees")
	WebElement ImplementationofBinaryTrees;
	@FindBy(linkText="Applications of Binary trees")
	WebElement ApplicationsofBinaryTrees;
	@FindBy(linkText="Binary Search Trees")
	WebElement BinarySearchTrees;
	@FindBy(linkText="Implementation Of BST")
	WebElement BST;
	@FindBy(linkText="Practice Questions")
	WebElement Practicequestions;
	@FindBy(xpath="//a[@href='/tryEditor'][text()='Try here>>>']")
    WebElement tryHereBtn;
	
	
	public TreeHomePage_Page() throws IOException {
		super();
		PageFactory.initElements(driver,this);
	}
       public String verifyTreeIntropage()
       {
    	   String treeIntro = treeTitle.getText();
    	   LoggerLoad.info("Page title is : "+treeIntro);
    	   return treeIntro;
       }
       
       public TreeHomePage_Page clickoverviewofTrees() throws IOException
       {
    	   overviewOfTrees.click();
    	   LoggerLoad.info("Overview of Trees link is clicked");
    	   return new TreeHomePage_Page();
       }
       public void  verifyoverviewofTrees()
       {
    	   String overviewtitle =driver.getTitle();
    	   Assert.assertEquals(overviewtitle, "Overview of Trees");
    	   LoggerLoad.info("Page title is : "+overviewtitle);
       }
       public TreeHomePage_Page clickTerminologies() throws IOException
       {
    	   Terminologies.click();
    	   LoggerLoad.info("Terminologies link is clicked");
    	   return new TreeHomePage_Page();
    
       }  
       public void verifyterminologies()
       {
    	   String terminologiestitle =driver.getTitle();
    	   Assert.assertEquals(terminologiestitle, "Terminologies");
    	   LoggerLoad.info("Page title is : "+terminologiestitle);
       }
       public TreeHomePage_Page clicktypesofTrees() throws IOException
       {
    	   TypeofTrees.click();
    	   LoggerLoad.info("Type of Trees link is clicked");
    	   return new TreeHomePage_Page();
    
       }
       
       public void  verifytypeoftrees()
       {
    	   String typeoftreestitle =driver.getTitle();
    	   Assert.assertEquals(typeoftreestitle, "Types of Trees");
    	   LoggerLoad.info("Page title is : "+typeoftreestitle);
       }
        public TreeHomePage_Page clickTreeTraversals() throws IOException
        {
        	TreeTraversals.click();
        	LoggerLoad.info("Trees Traversals link is clicked");
        	return new TreeHomePage_Page();
        }
        public void  verifyTreeTraversals()
        {
     	   String TreeTraversaltitle =driver.getTitle();
     	   Assert.assertEquals(TreeTraversaltitle, "Tree Traversals");
     	  LoggerLoad.info("Page title is : "+TreeTraversaltitle);
        }
       
       public TreeHomePage_Page clicktraversalsIllustration() throws IOException
       {
    	   TraversalsIllustration.click();
    	   LoggerLoad.info(" Traversals Illustration link is clicked");
    	    return new TreeHomePage_Page();
       }
       
       public void verifyclicktraversalsIllustration()
       {
    	   String traversalsIllustrationtitle =driver.getTitle();
     	   Assert.assertEquals(traversalsIllustrationtitle, "Traversals-Illustration");
     	  LoggerLoad.info("Page title is : "+traversalsIllustrationtitle);
    	   
       }
       public TreeHomePage_Page clickBinaryTrees() throws IOException
       {
    	   BinaryTrees.click();
    	   LoggerLoad.info(" Binary Trees link is clicked");
    	   return new TreeHomePage_Page();
    	   
       }
       
       public void verifyclickBinaryTrees()
       {
    	   String clickBinaryTreestitle =driver.getTitle();
     	  Assert.assertEquals(clickBinaryTreestitle, "Binary Trees");
     	  LoggerLoad.info("Page title is : "+clickBinaryTreestitle);
       }
       
        public TreeHomePage_Page clickTypesofBinaryTree() throws IOException
        {
        	TypesofBinaryTree.click();
        	LoggerLoad.info(" Types of Binary link is clicked");
        	return new TreeHomePage_Page();
        }
        public void verifyTypesofBinaryTree()
        {
     	   String TypesofBinaryTreetitle =driver.getTitle();
      	   Assert.assertEquals(TypesofBinaryTreetitle, "Types of Binary Trees");
      	   LoggerLoad.info("Page title is : "+TypesofBinaryTreetitle);
        }
        
        
        
       public TreeHomePage_Page clcikImplementationinPython() throws IOException
       {
    	   ImplementationinPython.click();
    	   LoggerLoad.info(" Implementation in Python link is clicked");
    	   return new TreeHomePage_Page();
       }
       public void verifyImplementationinPython()
       {
    	   String ImplementationinPythontitle =driver.getTitle();
     	   Assert.assertEquals(ImplementationinPythontitle, "Implementation in Python");
     	  LoggerLoad.info("Page title is : "+ImplementationinPythontitle);
       }
        
       public TreeHomePage_Page clickBinaryTreeTraversals() throws IOException
        {
        	BinaryTreeTraversals.click();
        	LoggerLoad.info(" Binary Tree Traversals link is clicked");
        	return new TreeHomePage_Page();
        }
        
       public void verifyBinaryTreeTraversals()
        {
     	   String BinaryTreeTraversalstitle =driver.getTitle();
      	   Assert.assertEquals(BinaryTreeTraversalstitle, "Binary Tree Traversals");
      	 LoggerLoad.info("Page title is : "+BinaryTreeTraversalstitle);
        }
        
        
        
        public TreeHomePage_Page clickImplementationofBinaryTrees() throws IOException
        {
        	ImplementationofBinaryTrees.click();
        	LoggerLoad.info(" Implementation of binary Trees link is clicked");
        	return new TreeHomePage_Page();
        }
        
        public void verifyImplementationofBinaryTrees()
        {
     	   String ImplementationofBinaryTreestitle =driver.getTitle();
      	   Assert.assertEquals(ImplementationofBinaryTreestitle, "Implementation of Binary Trees");
      	 LoggerLoad.info("Page title is : "+ImplementationofBinaryTreestitle);
        }
            
        
       public TreeHomePage_Page clickApplicationsofBinaryTrees() throws IOException
       {
    	   ApplicationsofBinaryTrees.click();
    	   LoggerLoad.info(" Applications of binary Trees link is clicked");
    	   return new TreeHomePage_Page();
       }
       
       public void verifyApplicationsofBinaryTrees()
       {
    	   String ApplicationsofBinaryTreestitle =driver.getTitle();
     	  Assert.assertEquals(ApplicationsofBinaryTreestitle, "Applications of Binary trees");
     	 LoggerLoad.info("Page title is : "+ApplicationsofBinaryTreestitle);
       }
       
       
       
       
       public TreeHomePage_Page clickBinarySearchTrees() throws IOException
       {
    	   BinarySearchTrees.click();
    	   LoggerLoad.info(" Binary Search Trees link is clicked");
    	   return new TreeHomePage_Page();

       }
       
       public void  verifyBinarySearchTrees()
       {
    	   String BinarySearchTreestitle =driver.getTitle();
     	   Assert.assertEquals(BinarySearchTreestitle, "Binary Search Trees");
     	  LoggerLoad.info("Page title is : "+BinarySearchTreestitle);
       }
       
       
       
       public TreeHomePage_Page clickBST()throws IOException
       {
    	   BST.click();
    	   LoggerLoad.info(" BST link is clicked");
    	   return new TreeHomePage_Page();
       }
	   
       public void verifyBST()
       {
    	   String BSTtitle =driver.getTitle();
     	  Assert.assertEquals(BSTtitle, "Implementation Of BST");
     	 LoggerLoad.info("Page title is : "+BSTtitle);
       }
       
       
       
       
	  public PracticePage_Page clickPracticeQuestions() throws IOException 
	  { 
		  Practicequestions.click(); 
		  LoggerLoad.info("Practice questions is clicked");
		  return new PracticePage_Page(); 
	  }
	  
	   public void verifyPracticeQuestions()
       {
    	   String PracticeQuestionstitle =driver.getTitle();

          Assert.assertEquals(PracticeQuestionstitle, "Practice Questions" );
          LoggerLoad.info("Page title is : "+PracticeQuestionstitle);
       }
       
       
}
       
       
       
       
       
       



      