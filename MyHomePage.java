package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import hooks.BasePage;

public class MyHomePage extends BasePage{

	public MyHomePage(ChromeDriver driver) {
		this.driver = driver;
	}
	/**
	 * Click the LeadTab in the MyHomePage screen
	 * @return MyLeadsPage
	 */		
	public MyLeadsPage clickLeadsTab() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.linkText("Leads")).click();
		return new MyLeadsPage(driver);
	}
}
