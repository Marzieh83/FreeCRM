package POMframework;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class testHomePage extends freeCRMBase {
	homePage homepage;
	loginPage loginpage;

	@BeforeTest
	void initialize() throws InterruptedException{
		setup();
		loginpage = new loginPage();
		loginpage.baseSetup();
		//You're running the loginpage
		homepage = loginpage.login("Marzieh","123456");
		driver.switchTo().frame("mainpanel");
		homepage.homePageSetup();
	}
	
	@Test
	void testGetLabel(){
		boolean label = homepage.getLael();
		if (label==true){
			Reporter.log("Home page is displayed", true);
		}
		else{
			Reporter.log("Home page is not displayed", true);
			Assert.fail();
		}
	}
	
	@AfterTest
	void tearDownLP(){
		driver.quit();
	}
}
 