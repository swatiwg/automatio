package Automation;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class facebook {


		
		private WebDriver driver; 
		String URL = "http://google.com";

		@BeforeClass
		public void testSetUp() {
		/*	
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");*/
			
			
		/*	ChromeOptions options = new ChromeOptions();
			options.addArguments("start-maximized");
			options.addArguments("--headless");
			options.addArguments("--window-size=1920x1080");
			options.addArguments("--disable-dev-shm-usage");
			options.addArguments("--no-sandbox");
			options.addArguments("--disable-gpu");
			driver = new ChromeDriver(options);*/
			
		/*	System.setProperty("webdriver.chrome.driver","chromedriver.exe");  */
			System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");
			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("useAutomationExtension", false);
		    driver = new ChromeDriver(options);
		

		
			/*driver = new ChromeDriver();*/
		}
		
		@Test
		public void verifyGooglePageTittle() {
			driver.navigate().to(URL);
			String getTitle = driver.getTitle();
			System.out.println(getTitle);
			Assert.assertEquals(getTitle, "Google");
		}
		
		@AfterClass
		public void tearDown() {
			driver.quit();
		}
		
	}


