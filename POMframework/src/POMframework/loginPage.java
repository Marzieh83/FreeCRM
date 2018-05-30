package POMframework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class loginPage extends freeCRMBase{
	
		WebElement userNameTxt, passwordTxt, loginBtn, logoutBtn;
			
		public void baseSetup() throws InterruptedException{
			//this.setup();
			//setup();
			userNameTxt = driver.findElement(By.name("username"));
			passwordTxt = driver.findElement(By.name("password"));
			Thread.sleep(1500);
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='submit']")));
			loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		}
		
		
		public homePage login(String un, String pwd){

			try{
				userNameTxt.sendKeys(un);
				passwordTxt.sendKeys(pwd);
				loginBtn.click();
				Thread.sleep(10000);
				String title = driver.getTitle();
			if(title.equals("CRMPRO")){
				return new homePage();
				// it is returning to the homePage class 
			}else{
				return null;				
			}
		
			}catch(Exception ex){
			//ex.printStackTrack();
				return null;
			}
		}
				
		
		public String getLoginTitle() {
			return driver.getTitle();
			}
		
		void closeBrowser() {
			driver.close();
			}
		
		
}

