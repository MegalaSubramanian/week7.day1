package iTests;

import org.testng.annotations.Test;

import iHooks.IncBasePage;
import iScreens.SelfServiceViewPage;

public class S1_1002_DeleteIncident extends IncBasePage{
	
	@Test
	public void DeleteIncTest() throws InterruptedException {
	
		new SelfServiceViewPage(driver)
		.clickAll()
		.switchToFrame0()
		.selectIncDelete()
		.getIncident()
		.deleteIncident()
		.confirmDeletion()
		.clickSearchTab()
		.searchIncidentID();	
}
	
}