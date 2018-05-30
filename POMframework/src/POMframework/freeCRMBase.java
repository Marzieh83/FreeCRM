package POMframework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class freeCRMBase {
	public static WebDriver driver;
	public static WebDriverWait wait;

	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/user/Documents/Selenium/webdriver/chromedriver.exe");
		driver = new ChromeDriver();		
		driver.get("http://freecrm.com/index.html");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		wait = new WebDriverWait(driver, 20);
		
/*		
		String crmTitle = driver.getTitle();
		if (crmTitle.equals("Free CRM software in the cloud powers sales and customer service")){
			System.out.println("CRM website is opened Successfully");
		}
		else {			
			System.out.println("CRM website is not opened");
			driver.quit();
		}
*/

		
//		System.out.println("The title after going back is:" + crmTitle);

	}


}

