package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLeadsPage extends ProjectMethods {

		public ViewLeadsPage() {
			PageFactory.initElements(driver,this);
		}

		@FindBy(how=How.ID,using="viewLead_firstName_sp")
		private WebElement eleVerifyFirstName;
		
		public ViewLeadsPage verifyFirstName(String data)
		{
			//WebElement clickCrmLink = locateElement("link", "CRM/SFA");
			click(eleVerifyFirstName);
			return this;
		}
		
		@FindBy(how=How.XPATH,using="//a[text()='Edit']")
		private WebElement eleEditButton;
		
		public EditLeadsPage clickEditButton()
		{
			click(eleEditButton);
			return new EditLeadsPage();
			
		}
		
		@FindBy(how=How.LINK_TEXT,using="Delete")
		private WebElement eleDeleteButton;
		
		public MyLeadsPage clickDeleteButton()
		
		{
			click(eleDeleteButton);
			return new MyLeadsPage();
			
		}
		@FindBy(how=How.XPATH,using="//a[text()='Duplicate Lead']")
		private WebElement eleDuplicateLeadButton;
		
		public DuplicateLeadsPage clickDuplicaeLeadButton()
		{
			click(eleDuplicateLeadButton);
			return new DuplicateLeadsPage();
		}
}
