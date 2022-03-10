package iTests;

import org.testng.annotations.Test;

import iHooks.IncBasePage;
import iScreens.IncidentCreatePage;
import iScreens.IncidentPage;
import iScreens.SelfServiceViewPage;

public class S1_1004_AssignIncident extends IncBasePage{
	
	@Test
	public void AssignIncTest() {
	
		new SelfServiceViewPage(driver).clickOpen()
		.switchToFrame0()
		.searchIncAssign()
		.selectIncAssign()
		.clickAssigngroupLookUp();
		new IncidentCreatePage(driver).GetWindowsHandle()
		.switchToSecondWindow();
		new IncidentPage(driver).searchGroup()
		.selectGroup();
		new IncidentCreatePage(driver).switchToHomeWindow();
		new IncidentPage(driver).switchToFrame0()
		.typeWorkNote()
		.clickUpdateButton();
		
	}

}
