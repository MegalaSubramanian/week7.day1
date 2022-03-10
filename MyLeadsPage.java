package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.BasePage;

public class MyLeadsPage extends BasePage{
	
	public MyLeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}
	/**
	 * Click the Create lead in MyLeads screen
	 * @return CreateLeadPage
	 */
	public CreateLeadPage clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
	}
	
	/**
	 * Click the Find lead
	 * @return FindLeadsPage
	 */
	public FindLeadsPage clickFindLead() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage(driver);
	}
	
	/**
	 * Click the Merge leads in MyLeads screen
	 * @return 
	 */
	public MergeLeadsPage clickMergeLeads() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadsPage(driver);
	}

}
