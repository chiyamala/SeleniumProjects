package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_MergeLeads extends ProjectMethods{
	@BeforeTest
	public void setData() {
		testCaseName="TC001_LoginAndLogout";
		testDescription="login to LeafTaps And Logout";
		testNodes="Leads";
		category="Smoke";
		authors="Sarath";
		browserName="chrome";
		dataSheetName="TC001";
	}
	
	
	
	@Test(dataProvider="fetchData")
	public void loginAndLogout(String uName,String pwd,String vName) {
		
		new LoginPage()
		.enterUserName(uName)
		.enterPassword(pwd)
		.clickLogIn()
		//.verifyLoggedName(vName)
		.clickCRMSFA()
		.clickLeadsButton()
		.ClickMergeLeadsButton()
		//.switchToWindow(1)
		.FirstMergeLead()
		//.switchToWindow(1)
		.clickEmailid()
		.EnterEmailid("Chiyamaladevi@gmail.com")
		.ClickFirstLead()
		.secondMergeLead()
		.clickEmailid()
		.EnterEmailid("Chiyamaladevi@gmail.com")
		.ClickSecondLead();
//.switchToWindow(0);
		
		/*.EnterCompanyName("Trimble")
		.EnterFirstName("Chiyamala")
		.EnterLastName("Devi")
		.ClickCreateLeadButton()
		.verifyFirstName("Chiyamala");*/
		//.clickLogOut();
		
		
		
		
		
		
		
	}

}
