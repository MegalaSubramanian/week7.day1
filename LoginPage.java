package screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import hooks.BasePage;

public class LoginPage extends BasePage{
	
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
	}
	/**
	 * Type the user name in the login screen
	 * @param userId -- The different username to login
	 * @return 
	 */
	public LoginPage typeUserName(String userId) {
		driver.findElement(By.id("username")).sendKeys(userId);
		return this;
	}
	/**
	 * Type the password in the login screen
	 * @param password -- The different password to login
	 * @return 
	 */
	public LoginPage typePassword(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
		return this; 
	}
	/**
	 * Click the login button
	 * @return HomePage
	 */
	public HomePage clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);
	}

}







