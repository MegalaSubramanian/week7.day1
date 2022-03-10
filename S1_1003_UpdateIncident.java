package iTests;

import org.testng.annotations.Test;

import iHooks.IncBasePage;
import iScreens.SelfServiceViewPage;

public class S1_1003_UpdateIncident extends IncBasePage{

	
	@Test
	public void UpdateIncTest() {
		
		new SelfServiceViewPage(driver).clickAll().switchToFrame0()
		.selectIncUpdate()
		.getIncident()
		.changeState()
		.changeUrgency()
		.clickUpdateButton()
		.clickSearchTab()
		.searchIncidentID();
		
		
	}
}
