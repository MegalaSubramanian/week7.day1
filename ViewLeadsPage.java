package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.BasePage;

public class ViewLeadsPage extends BasePage{
	
	public ViewLeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	/**
	 * Get the title
	 * Print the title
	 * @return 
	 */	
	
	public ViewLeadsPage getTitle() {				
	String title = driver.getTitle();
	System.out.println(title);
	return this;
	}
	
	/**
	 * Click the Edit Button in the ViewLeadsPage screen
	 * @return 
	 */	
	
	public EditLeadPage clickEditButton() {		
		driver.findElement(By.linkText("Edit")).click();
	return new EditLeadPage(driver);
	}
	
	/**
	 * Click the Delete Button in the ViewLeadsPage screen
	 * @return 
	 */	
	
	public MyLeadsPage clickDeleteButton() {		
		driver.findElement(By.linkText("Delete")).click();
	return new MyLeadsPage(driver);
	}

	/**
	 * Click the Duplicate Button in the ViewLeadsPage screen
	 * @return 
	 */	
	
	public DuplicateLeadPage clickDuplicateButton() {		
		driver.findElement(By.linkText("Duplicate Lead")).click();
	return new DuplicateLeadPage(driver);
	}
	
	
}
