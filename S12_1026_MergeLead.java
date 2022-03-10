package tests;

import org.testng.annotations.Test;

import hooks.BasePage;
import screens.LoginPage;

public class S12_1026_MergeLead extends BasePage{
	@Test
	public void MergeTest() throws InterruptedException{
		
	new LoginPage(driver)
	.typeUserName("DemoSalesManager")
	.typePassword("crmsfa")
	.clickLogin()
	.clickCRMSFA()
	.clickLeadsTab()
	.clickMergeLeads()
	.clickFromLeadlookup()
	.getWindows()
	.switchToWindow1()
	.typefirstName("gopi")
	.clickFindLeadsButton()
	.getLeadID()
	.clickLeadIdLinkFromMergeResult()
	.getWindows()
	.switchToHomeWindow()
	.clickToLeadlookup()
	.getWindows()
	.switchToWindow1()
	.typefirstName("babu")
	.clickFindLeadsButton()
	.clickLeadIdLinkFromMergeResult()
	.getWindows()
	.switchToHomeWindow()
	.clickMergeButton()
	.acceptMergeAlert()
	.clickFindLead()
	.typeLeadID()
	.clickFindLeadsButton()
	.validateNoRecord();

	}
}
