package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MyLeadsPage extends ProjectMethods {
	
	public MyLeadsPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleclicCreateLeads;
	
	public CreateLeadsPage  CreateLead()
	{
		//WebElement clickCrmLink = locateElement("link", "CRM/SFA");
		click(eleclicCreateLeads);
		return new CreateLeadsPage();
	}
	@FindBy(how=How.LINK_TEXT,using="Find Leads")
	private WebElement eleFindLeadsButton;
	
public  FindLeadsPage clickFindLeads()
{
	click(eleFindLeadsButton);
	return new FindLeadsPage();
}	

/*
 * This method will click MergeLeads button and land to MERGE LEADS page
 */
@FindBy(how=How.LINK_TEXT,using="Merge Leads")
private WebElement eleClickMergeLeadsButton;

public  MergeLeadsPage ClickMergeLeadsButton()
{
click(eleClickMergeLeadsButton);
return new MergeLeadsPage();
}	

}


/*click(locateElement("link","Create Lead"));
;*/
