package tests;

import org.testng.annotations.Test;

import hooks.BasePage;
import screens.LoginPage;

public class S12_1025_DuplicateLead extends BasePage {
	
	@Test
	public void DuplicateTest() throws InterruptedException {
		new LoginPage(driver)
		.typeUserName("DemoSalesManager")
		.typePassword("crmsfa")
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsTab()
		.clickFindLead()
		.clickPhoneTab()
		.clickPhoneNumber()
		.typePhoneNumber("99")
		.clickFindLeadsButton()
		.clickLeadIdLinkFromResult()
		.clickDuplicateButton()
		.clickCreateLeadButton();
		
	}
	}
