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
			
		WebDriver driver=new ChromeDriver();	
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
			
		}
		
		
	}


