package iScreens;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import iHooks.IncBasePage;

public class IncidentCreatePage extends IncBasePage{
	public IncidentCreatePage(ChromeDriver driver) {
		this.driver = driver;
	}
	

	
	/**
	 * click the Caller Lookup in IncidentPage screen
	 * @return 
	 */
	public IncidentCreatePage clickCallerLookUp() {	
		driver.findElement(By.id("lookup.incident.caller_id")).click();
	return this;
	}
	
	/**
	 * Get windows handle in IncidentPage screen
	 * @return 
	 */
	public IncidentCreatePage GetWindowsHandle() {	
		windows = driver.getWindowHandles();
		list = new ArrayList<String>(windows);
	return this;
	}
	
	/**
	 * switch to second window in IncidentPage screen
	 * @return 
	 */
	public UsersPage switchToSecondWindow() {	
		driver.switchTo().window(list.get(1));
	return new UsersPage(driver);
	}
	
	/**
	 * switch to Home window in IncidentPage screen
	 * @return 
	 */
	public IncidentCreatePage switchToHomeWindow() {	
		driver.switchTo().window(list.get(0));
	return this;
	}
	/**
	 * Type the description in the IncidentPage screen
	 * @param shortDesc
	 * @return 
	 */	
	public IncidentCreatePage typeshortDesc(String shortDesc) {			
		driver.findElement(By.xpath("(//input[contains(@name,'incident.short_description')])[4]")).sendKeys(shortDesc);
	return this;
	}		
	/**
	 * Get Incident ID Created in the IncidentPage screen
	 * @return 
	 */	
	public IncidentCreatePage getIncID() {			
		number = driver.findElement(By.id("incident.number"));
		incidentID = number.getAttribute("value");
		System.out.println(incidentID);
	return this;
	}
	/**
	 * click submit button in the IncidentCreatePage screen
	 * @return 
	 */	
	public IncidentCreatePage clickSubmitButton() {			
		driver.findElement(By.xpath("//button[text() ='Submit']")).click();
	return this;
	}
}
