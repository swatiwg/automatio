package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class facebook {


		
		private WebDriver driver; 
		String URL = "http://google.com";

		@BeforeClass
		public void testSetUp() {
			
			System.setProperty("webdriver.chrome.driver","/Users/Swanka644/workspace/new/demo/src/test/java/Automation/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		@Test
		public void verifyGooglePageTittle() {
			driver.navigate().to(URL);
			String getTitle = driver.getTitle();
			Assert.assertEquals(getTitle, "Google");
		}
		
		@AfterClass
		public void tearDown() {
			driver.quit();
		}
		
	}


