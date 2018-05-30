package POMframework;

	import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

public class dataProviderExample extends freeCRMBase {
	

		WebElement username,password,signup,login,logout;
		homePage homepage;
		void initialize() {
			setup();			 
			}
		
		String getTitle() {
			return driver.getTitle();
			}
		void login(String usr,String pss) throws InterruptedException {
			Thread.sleep(3000);
			 username= driver.findElement(By.name("username"));
			username.sendKeys(usr);
			 password= driver.findElement(By.name("password"));
			 password.sendKeys(pss);
			 login= driver.findElement(By.xpath("//input[@type='submit']"));
			Thread.sleep(3000);
		     login.click();
		     Thread.sleep(3000);
		     if(homepage !=null) {
					Reporter.log("logg in Successfully", true);
				}
				else {
					Reporter.log("Use the correct username or password", true);
					Assert.fail();
				}	
				
		     driver.switchTo().frame("mainpanel");
		     driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();
			
			}
		
		String getLoginTitle() {
			return driver.getTitle();
			}
		void logOut() {
					
		}	
		
	}


