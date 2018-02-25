package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class SwitchFindLeads extends ProjectMethods{
	public SwitchFindLeads()
	{
		PageFactory.initElements(driver, this);
	}
	/*
	 * This Method will click mailid button and land in the same page
	 */
	@FindBy(how=How.XPATH,using="//span[text()='Email']")
	private WebElement eleEmailid;
	
	public SwitchFindLeads clickEmailid()
	{
		
		switchToWindow(1);
		click(eleEmailid);
		return this;
	}
	/*
	 * This Method will enter the mail id button and land in the same page
	 */
	@FindBy(how=How.XPATH,using="//input[@name='emailAddress']")
	private WebElement eleEnterEmailid;
	
	public SwitchFindLeads EnterEmailid(String data)
	{
		switchToWindow(1);
		type(eleEnterEmailid, data);
		return this;
	}
	/*
	 * This Method will click the very first item matching and return to MergeLead page
	 */
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")
	private WebElement eleClickFirstLead;
	
	public MergeLeadsPage ClickFirstLead()
	{
		switchToWindow(1);
		click(eleClickFirstLead);
		return new MergeLeadsPage() ;
	}
	
	/*
	 * This Method will click the second item matching and return to MergeLead page
	 */
	
	@FindBy(how=How.XPATH,using="(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")
	private WebElement eleClickSecondLead;
	
	public MergeLeadsPage ClickSecondLead()
	{
		switchToWindow(1);
		click(eleClickSecondLead);
		return new MergeLeadsPage() ;
	}
	
}
