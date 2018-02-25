package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class FindLeadsPage extends ProjectMethods{
	
	public FindLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
	private WebElement eleFirstName;
	
public  FindLeadsPage enterName(String data)
{
	type(eleFirstName, data);
	return this;
}


@FindBy(how=How.XPATH,using="//input[@name='id']")
private WebElement eleClickLeadId;

public  FindLeadsPage clickLeadId(String data)
{
type(eleClickLeadId, data);
return this;
}


@FindBy(how=How.XPATH,using="//button[text() = 'Find Leads']")
private WebElement eleFindLeadsButton;

public  FindLeadsPage FindLeadsButton()
{
click(eleFindLeadsButton);
return this;
}

@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
private WebElement eleFirstLead;

public  ViewLeadsPage FirstLead()
{
	 
click(eleFirstLead);
return new ViewLeadsPage();
}


@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
private WebElement eleFirstLeadId;
public  FindLeadsPage GetFirstLeadId()
{
	String text = eleFirstLeadId.getText();
return this;
}

	
}
