package iScreens;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import iHooks.IncBasePage;
import screens.FindLeadsPage;

public class IncidentPage extends IncBasePage{

	public IncidentPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	//Actions builder = new Actions(driver);
	
	
		/**
		 * Switch to frame0 in IncidentPage screen
		 * @return 
		 */
		public IncidentPage switchToFrame0() {	
			driver.switchTo().frame(0);
		return this;
		}
		/**
		 * click the new button in IncidentPage screen
		 * @return IncidentCreatePage
		 */
		public IncidentCreatePage clickNewButton() {	
			driver.findElement(By.xpath("//button[text()='New']")).click();
		return new IncidentCreatePage(driver);
		}	
		
		/**
		 * click the search tab in IncidentPage screen
		 * @return
		 */
		public IncidentPage clickSearchTab() {	
			search = driver.findElement(By.xpath("(//label[text()='Search'])[2]/following::input"));
			search.click();
		return this;
		}	
		/**
		 * click the search to assign in IncidentPage screen
		 * @return
		 */
		public IncidentPage searchIncAssign() {	
			WebElement search = driver.findElement(By.xpath("(//input[@class='form-control'])[1]"));
			search.click();
			search.sendKeys("INC0000007");
			search.click();
		return this;
		}
		/**
		 * click the select to assign in IncidentPage screen
		 * @return
		 */
		public IncidentPage selectIncAssign() {	
			driver.findElement(By.xpath("(//tbody[@class='list2_body'])/tr[1]/td[3]")).click();
		return this;
		}
		/**
		 * click the Assignment group Lookup in IncidentPage screen
		 * @return 
		 */
		public IncidentPage clickAssigngroupLookUp() {	
			driver.findElement(By.id("lookup.incident.assignment_group")).click();
		return this;
		}
		
		/**
		 * search group in the IncidentPage screen
		 * @return
		 */
		public IncidentPage searchGroup() {	
			driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("software", Keys.ENTER);
		return this;
		}
		
		/**
		 * select group in the IncidentPage screen
		 * @return
		 */
		public IncidentPage selectGroup() {	
			driver.findElement(By.xpath("//a[text()='Software']")).click();
		return this;
		}
		
		/**
		 * type worknote in the IncidentPage screen
		 * @return
		 */
		public IncidentPage typeWorkNote() {	
			driver.findElement(By.id("activity-stream-textarea")).sendKeys("Testing");
		return this;
		}
		
		/**
		 * search the Incident ID in the IncidentPage screen
		 * @return
		 */
		public IncidentPage searchIncidentID() {	
			search.sendKeys(incidentID);
			search.click();
		return this;
		}
		/**
		 * select incident to delete in the SelfServiceViewPage screen
		 * @return
		 */
		public IncidentPage selectIncDelete() {	
			driver.findElement(By.xpath("(//tbody[@class='list2_body'])/tr[9]/td[3]")).click();
		return this;
		}
		/**
		 * select incident to update in the SelfServiceViewPage screen
		 * @return 
		 */
		public IncidentPage selectIncUpdate() {	
			driver.findElement(By.xpath("(//tbody[@class='list2_body'])/tr[9]/td[3]")).click();
		return this;
		}
		
		
		/**
		 * get the Incident ID in the IncidentPage screen
		 * @return
		 */
		public IncidentPage getIncident() {	
			value = driver.findElement(By.id("incident.number"));
			incidentID = value.getAttribute("value");
			System.out.println(incidentID);
		return this;
		}
		
		/**
		 * Delete the Incident in the IncidentPage screen
		 * @return
		 */
		public IncidentPage deleteIncident() {	
			driver.findElement(By.xpath("(//button[text()='Delete'])[1]")).click();
		return this;
		}
		/**
		 * Confirm deletion of the Incident in the IncidentPage screen
		 * @return
		 * @throws InterruptedException 
		 */
		public IncidentPage confirmDeletion() throws InterruptedException {	
			driver.findElement(By.id("ok_button")).click();
			Thread.sleep(3000);
		return this;
		}
		/**
		 * change state in the IncidentPage screen
		 * @return
		 */
		public IncidentPage changeState(){	
			Select dropdown = new Select((driver.findElement(By.xpath("//Select[@name='incident.state']"))));
			dropdown.selectByValue("2");
		return this;
		}	
		/**
		 * change urgency in the IncidentPage screen
		 * @return
		 */
		public IncidentPage changeUrgency(){	
			Select dropdown = new Select((driver.findElement(By.xpath("//Select[@name='incident.urgency']"))));
			dropdown.selectByValue("1");
		return this;
		}	
		
		/**
		 * click update button in the IncidentPage screen
		 * @return
		 */
		public IncidentPage clickUpdateButton(){	
			driver.findElement(By.xpath("(//button[text()='Update'])[1]")).click();
		return this;
		}		
		
	}
