package iScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import iHooks.IncBasePage;

public class UsersPage extends IncBasePage{

	public UsersPage(ChromeDriver driver) {
		this.driver = driver;
	}

	/**
	 * select a caller from the usersPage screen
	 * @return IncidentCreatePage
	 */
	public IncidentCreatePage clickCallerFromList() {	
		driver.findElement(By.xpath("//tbody[@class='list2_body']/tr[1]/td[3]/a")).click();
	return new IncidentCreatePage(driver);
	}
}