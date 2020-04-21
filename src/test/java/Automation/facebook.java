package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeOptions optn=new ChromeOptions();
		optn.addArguments("--incognito");
		Thread.sleep(1000);
		optn.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver(optn);
		/*optn.setPageLoadStrategy(PageLoadStrategy.NONE);*/
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		/*driver.manage().window().maximize();*/
		
		//xpath
		/*driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		Actions action = new Actions(driver);
		WebElement suboption=driver.findElement(By.xpath("//a[@id='menu__Performance']/child::b"));
		WebElement confiOption=driver.findElement(By.xpath("//a[@id='menu__Performance']//following::ul/li/child::a[@id='menu_performance_Configure']"));
		WebElement eps=driver.findElement(By.xpath("//a[text()='KPIs']"));
		action.moveToElement(suboption).moveToElement(confiOption).moveToElement(eps).click().build().perform();*/
	/*	
		JavascriptExecutor js = (JavascriptExecutor)driver;		
		
		  WebElement elm =driver.findElement(By.xpath("//input[@id='txtUsername']"));		
		  js.executeScript("arguments[0].click();alert(\"done\")", button);
		  
		  ((JavascriptExecutor) driver).executeScript("arguments[0].click();alert(\"Clicked on Register Button\"))",elm);

                */
		
	}

}
