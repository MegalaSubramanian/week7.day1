package tests;

import org.testng.annotations.Test;

import hooks.BasePage;
import screens.LoginPage;

public class S12_1024_DeleteLead extends BasePage{

	@Test
	public void DeleteTest() throws InterruptedException {
	new LoginPage(driver)
	.typeUserName("DemoSalesManager")
	.typePassword("crmsfa")
	.clickLogin()
	.clickCRMSFA()
	.clickLeadsTab()
	.clickFindLead()
	.clickPhoneTab()
	.clickPhoneNumber()
	.typePhoneNumber("9")
	.clickFindLeadsButton()
	.getLeadID()
	.clickLeadIdLinkFromResult()
	.clickDeleteButton()
	.clickFindLead()
	.typeLeadID()
	.clickFindLeadsButton()
	.validateNoRecord();
	
}
}
