package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class CreateLeadsPage extends ProjectMethods{

	public CreateLeadsPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	
	public CreateLeadsPage EnterCompanyName(String cName)
	{
		//WebElement clickCrmLink = locateElement("link", "CRM/SFA");
		//click(eleCompanyName);
		type(eleCompanyName, cName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	public CreateLeadsPage EnterFirstName(String fName)
	{
		//WebElement clickCrmLink = locateElement("link", "CRM/SFA");
		//click(eleFirstName);
		type(eleFirstName, fName);
		return this;
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLasttName;
	
	public CreateLeadsPage EnterLastName(String lName)
	{
		//WebElement clickCrmLink = locateElement("link", "CRM/SFA");
		type(eleLasttName, lName);
		return this;
	}
	
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateLeadButton;
	
	public ViewLeadsPage ClickCreateLeadButton()
	{
		//WebElement clickCrmLink = locateElement("Class", "smallSubmit");
		click(eleCreateLeadButton);
		return new ViewLeadsPage();
	}
}

/*//Enter Company Name
		type(locateElement("createLeadForm_companyName"),companyName);
		//Enter First Name	
		type(locateElement("createLeadForm_firstName"),fName);
		//Enter Last Name
		type(locateElement("createLeadForm_lastName"),lName);
		WebElement createLead=locateElement("class","smallSubmit");
		click(createLead);	
*/