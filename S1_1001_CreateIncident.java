package iTests;

import org.testng.annotations.Test;

import iHooks.IncBasePage;
import iScreens.IncidentCreatePage;
import iScreens.IncidentPage;
import iScreens.SelfServiceViewPage;

public class S1_1001_CreateIncident extends IncBasePage{

	@Test
	public void CreateIncTest() {
		
		new SelfServiceViewPage(driver).clickAll().switchToFrame0()
		.clickNewButton()
		.clickCallerLookUp()
		.GetWindowsHandle()
		.switchToSecondWindow()
		.clickCallerFromList()
		.switchToHomeWindow();
		new IncidentPage(driver)
		.switchToFrame0();
		new IncidentCreatePage(driver).typeshortDesc("Testing")
		.getIncID().GetWindowsHandle()
		.clickSubmitButton();
		new IncidentPage(driver)
		.clickSearchTab()
		.searchIncidentID();
	
	}
	
}
