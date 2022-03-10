package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import hooks.BasePage;
import screens.LoginPage;

public class S12_1021_Login extends BasePage{
	
	//@BeforeClass
	//public void setData() {
	//	fileName = "Login";
	//}
	//}

	@Test()
	public void loginTest() {
		
		new LoginPage(driver)
		.typeUserName("DemoSalesManager")
		.typePassword("crmsfa")
		.clickLogin()
		.clickCRMSFA()
		.clickLeadsTab();	
		
	}
	
}
