package Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    	   return treeIntro;
       }
       
       public TreeHomePage_Page clickoverviewofTrees() throws IOException
       {
    	   overviewOfTrees.click();
    	   return new TreeHomePage_Page();
       }
       public void  verifyoverviewofTrees()
       {
    	   String overviewtitle =driver.getTitle();
    	   Assert.assertEquals(overviewtitle, "Overview of Trees");
       }
       public TreeHomePage_Page clickTerminologies() throws IOException
       {
    	   Terminologies.click();
    	   return new TreeHomePage_Page();
    
       }  
       public void verifyterminologies()
       {
    	   String terminologiestitle =driver.getTitle();
    	   Assert.assertEquals(terminologiestitle, "Terminologies");
       }
       public TreeHomePage_Page clicktypesofTrees() throws IOException
       {
    	   TypeofTrees.click();
    	   return new TreeHomePage_Page();
    
       }
       
       public void  verifytypeoftrees()
       {
    	   String typeoftreestitle =driver.getTitle();
    	   Assert.assertEquals(typeoftreestitle, "Types of Trees");
       }
        public TreeHomePage_Page clickTreeTraversals() throws IOException
        {
        	TreeTraversals.click();
        	return new TreeHomePage_Page();
        }
        public void  verifyTreeTraversals()
        {
     	   String TreeTraversaltitle =driver.getTitle();
     	   Assert.assertEquals(TreeTraversaltitle, "Tree Traversals");
        }
       
       public TreeHomePage_Page clicktraversalsIllustration() throws IOException
       {
    	   TraversalsIllustration.click();
    	    return new TreeHomePage_Page();
       }
       
       public void verifyclicktraversalsIllustration()
       {
    	   String traversalsIllustrationtitle =driver.getTitle();
     	   Assert.assertEquals(traversalsIllustrationtitle, "Traversals-Illustration");
    	   
       }
       public TreeHomePage_Page clickBinaryTrees() throws IOException
       {
    	   BinaryTrees.click();
    	   return new TreeHomePage_Page();
    	   
       }
       
       public void verifyclickBinaryTrees()
       {
    	   String clickBinaryTreestitle =driver.getTitle();
     	  Assert.assertEquals(clickBinaryTreestitle, "Binary Trees");
       }
        public TreeHomePage_Page clickTypesofBinaryTree() throws IOException
        {
        	TypesofBinaryTree.click();
        	return new TreeHomePage_Page();
        }
        public void verifyTypesofBinaryTree()
        {
     	   String TypesofBinaryTreetitle =driver.getTitle();
      	   Assert.assertEquals(TypesofBinaryTreetitle, "Types of Binary Trees");
        }
        
        
        
       public TreeHomePage_Page clcikImplementationinPython() throws IOException
       {
    	   ImplementationinPython.click();
    	   return new TreeHomePage_Page();
       }
       public void verifyImplementationinPython()
       {
    	   String ImplementationinPythontitle =driver.getTitle();
     	   Assert.assertEquals(ImplementationinPythontitle, "Implementation in Python");
       }
        public TreeHomePage_Page clickBinaryTreeTraversals() throws IOException
        {
        	BinaryTreeTraversals.click();
        	return new TreeHomePage_Page();
        }
        public void verifyBinaryTreeTraversals()
        {
     	   String BinaryTreeTraversalstitle =driver.getTitle();
      	   Assert.assertEquals(BinaryTreeTraversalstitle, "Binary Tree Traversals");
        }
        
        
        
        public TreeHomePage_Page clickImplementationofBinaryTrees() throws IOException
        {
        	ImplementationofBinaryTrees.click();
        	return new TreeHomePage_Page();
        }
        
        public void verifyImplementationofBinaryTrees()
        {
     	   String ImplementationofBinaryTreestitle =driver.getTitle();
      	   Assert.assertEquals(ImplementationofBinaryTreestitle, "Implementation of Binary Trees");
        }
        
        
        
       public TreeHomePage_Page clickApplicationsofBinaryTrees() throws IOException
       {
    	   ApplicationsofBinaryTrees.click();
    	   return new TreeHomePage_Page();
       }
       
       public void verifyApplicationsofBinaryTrees()
       {
    	   String ApplicationsofBinaryTreestitle =driver.getTitle();
     	  Assert.assertEquals(ApplicationsofBinaryTreestitle, "Applications of Binary trees");
       }
       
       
       
       
       public TreeHomePage_Page clickBinarySearchTrees() throws IOException
       {
    	   BinarySearchTrees.click();
    	   return new TreeHomePage_Page();

       }
       
       public void  verifyBinarySearchTrees()
       {
    	   String BinarySearchTreestitle =driver.getTitle();
     	   Assert.assertEquals(BinarySearchTreestitle, "Binary Search Trees");
       }
       
       
       
       public TreeHomePage_Page clickBST()throws IOException
       {
    	   BST.click();
    	   return new TreeHomePage_Page();
       }
	   
       public void verifyBST()
       {
    	   String BSTtitle =driver.getTitle();
     	  Assert.assertEquals(BSTtitle, "Implementation Of BST");
       }
       
       
       
       
	  public PracticePage_Page clickPracticeQuestions() throws IOException 
	  { 
		  Practicequestions.click(); 
		  return new PracticePage_Page(); 
	  }
	  
	   public void verifyPracticeQuestions()
       {
    	   String PracticeQuestionstitle =driver.getTitle();

          Assert.assertEquals(PracticeQuestionstitle, "Practice Questions" );
       }
       
       
}
       
       
       
       
       
       



      
