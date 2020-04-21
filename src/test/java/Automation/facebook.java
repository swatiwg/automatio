package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class facebook {


		
		 WebDriver driver; 
		String URL = "http://google.com";

		@BeforeClass
		public void testSetUp() throws InterruptedException {
			
			Thread.sleep(1000);
			/*System.setProperty("webdriver.chrome.driver","chromedriver.exe");*/
			driver = new ChromeDriver();
		}
		
		@Test
		public void verifyGooglePageTittle() throws InterruptedException {
			driver.navigate().to(URL);
			Thread.sleep(1000);
			String getTitle = driver.getTitle();
			Assert.assertEquals(getTitle, "Google");
		}
		
		@AfterClass
		public void tearDown() {
			driver.quit();
		}
		
	}


