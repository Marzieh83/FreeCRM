package POMframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class homePage extends freeCRMBase {
	WebElement label;
//	loginPage loginpage;
	
	public void homePageSetup() throws InterruptedException {
			//setup();
			// this setup is running the loginPage only and the next step is login successfully, if you don't the next element will not find and you will get the error 
			
			//driver.switchTo().frame("mainpanel");
			label = driver.findElement(By.xpath("//td[contains(text(),'User: Marzieh Sarabadani')]"));
//			contacts= driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
//			newContacts= driver.findElement(By.xpath("//a[contains(text(),'New Contact')]"));
			
			}

	
	
		boolean getLael() {
			return label.isDisplayed();
			
		}
		
		public String getHPTitle() {
			return label.getText();
		}

/*		
		ContactsPage getNewContactPage() throws InterruptedException {
			Actions action=new Actions(driver);
			action.moveToElement(contacts).build().perform();
			Thread.sleep(3000);
			newContacts.click();
			
			return new ContactsPage();
		}
		void contactPageClick() {
			contacts.click();
		}
*/
}
