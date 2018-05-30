package POMframework;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testLoginPage extends freeCRMBase {
	loginPage loginpage;
	homePage homepage;

	@BeforeTest
	void initialize () throws InterruptedException{
		setup();
		loginpage = new loginPage();
		loginpage.baseSetup();	
	}
	
	@Test(priority=0)
	void testTitle() {
		 String title = loginpage.getLoginTitle();
//		 Assert.assertEquals(title,"Free CRM software in the cloud powers sales and customer service","freecrm page is not lunch!!");
//		 If Assert is failed the codes after that will not run so it is better to DO NOT use it and use IF condition
	
		 if (title.equalsIgnoreCase("Free CRM software in the cloud powers sales and customer service")){
				Reporter.log("FreeCRM Page is Run Successfully");
			}
			else {			
				Reporter.log("FreeCRM Page is not Run");
				Assert.fail();
			}
	}
		 
	@Test(priority=1)
	void testlogin(){
		homepage = loginpage.login("Marzieh", "123456");
		if(homepage !=null) {
			Reporter.log("logg in Successfully", true);
		}
		else {
			Reporter.log("Use the correct username or password", true);
			Assert.fail();
		}		
//if you want to use this one, you should go to the loginPage and change the homePage method
//You need to make some conditions there: if (...) do ... else return null
		
	}

/*	
	@Test
	void testLoginTitle() {
		boolean Text = driver.findElement(By.xpath("//*[contains(text(),'User: Marzieh Sarabadani')]")).isDisplayed();			
		if (Text){
			System.out.println("login Successfully");
		}
		else {
			System.out.println("You're not loged in");
			driver.quit();
		}
	}
	*/
	@AfterTest
	void tearDownLP(){
		driver.quit();
	}
}
