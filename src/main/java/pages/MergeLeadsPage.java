package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class MergeLeadsPage extends ProjectMethods{

	public MergeLeadsPage() {
		PageFactory.initElements(driver, this);
	}

	/*
	 * This method will click the first merge lead field and land to same page
	 */
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[1]")
	private WebElement eleFirstMergeLead;
	
	public SwitchFindLeads  FirstMergeLead()
	{
		click(eleFirstMergeLead);
		return new SwitchFindLeads();
	}
	
	/*
	 * This method will click the Secind merge lead field and land to same page
	 */
	@FindBy(how=How.XPATH,using="(//img[@src='/images/fieldlookup.gif'])[2]")
	private WebElement eleSecondMergeLead;
	
	public SwitchFindLeads  secondMergeLead()
	{
		//driver.switchTo().defaultContent();
		switchToWindow(0);
		click(eleSecondMergeLead);
		return new SwitchFindLeads ();
	}
	
	@FindBy(how=How.LINK_TEXT,using="Merge")
	private WebElement eleMergeButton;
	
	public MergeLeadsPage  clickMergeButton()
	{
		//driver.switchTo().defaultContent();
		
		switchToWindow(0);
		return this;
	}
}
