package tests;

import org.testng.annotations.Test;

import hooks.BasePage;
import screens.LoginPage;

public class S12_1022_CreateLead extends BasePage{

	@Test
	public void CreateTest() {
		
		new LoginPage(driver)
		.typeUserName("DemoSalesManager")
		.typePassword("crmsfa")
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickCreateLead()
		.typeCompanyName("TestLeaf")
		.typeFirstName("Hari")
		.typeLastName("R")
		.clickCreateLead()
		.getTitle();
	
	}
	
}
