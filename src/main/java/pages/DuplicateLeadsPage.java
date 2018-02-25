package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class DuplicateLeadsPage extends ProjectMethods {
	
	public DuplicateLeadsPage() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(how=How.CLASS_NAME,using="smallSubmit")
	private WebElement eleCreateleadButton;
	
	public ViewLeadsPage clickCreateLeadButton()
	{
		click(eleCreateleadButton);
		return new ViewLeadsPage();
	}
}
