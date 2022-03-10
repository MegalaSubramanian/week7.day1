package tests;

import org.testng.annotations.Test;

import hooks.BasePage;
import screens.LoginPage;

public class S12_1023_EditLead extends BasePage {
	
	@Test
	public void EditTest() throws InterruptedException {
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
		.clickLeadIdLinkFromResult()
		.clickEditButton()
		.updateCompanyName("TCS")
		.clickUpdateButton()
		.getTitle();
		
	}
	

}
