package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class EditLeadsPage extends ProjectMethods{
	public EditLeadsPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(how=How.ID,using="updateLeadForm_firstName")
	private WebElement eleFirstName;
	
	public EditLeadsPage EditFirstName(String data)
	{
		//WebElement clickCrmLink = locateElement("link", "CRM/SFA");
		type(eleFirstName, data);
		return this;
	}

	
	@FindBy(how=How.XPATH,using="(//input[@name='submitButton'])[1]")
	private WebElement eleclickUpdateButton;
	
	public ViewLeadsPage clickUpdateButton()
	{
		//WebElement clickCrmLink = locateElement("link", "CRM/SFA");
		click(eleclickUpdateButton);
		return new ViewLeadsPage();
	}
}
