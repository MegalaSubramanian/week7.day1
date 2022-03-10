package iScreens;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import iHooks.IncBasePage;

public class SelfServiceViewPage extends IncBasePage{

	public SelfServiceViewPage(ChromeDriver driver) {
		this.driver = driver;
	}
	/**
	 * click All in the SelfServiceViewPage screen
	 * @return IncidentsPage
	 */
	public IncidentPage clickAll() {	
	driver.findElement(By.xpath("(//div[text() ='All'])[2]")).click();
	return new IncidentPage(driver);
	}	
	
	/**
	 * click Open in the SelfServiceViewPage screen
	 * @return IncidentsPage
	 */
	public IncidentPage clickOpen() {	
		driver.findElement(By.xpath("(//div[text()='Open'])[1]")).click();
	return new IncidentPage(driver);
	}

}
