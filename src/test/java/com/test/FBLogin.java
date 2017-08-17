package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class FBLogin {
WebDriver driver;

@BeforeSuite
	public void browserstart() 
	  {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJARS\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		
	  }
	  
	@Test(priority=1)
	public void startappliction()
	{
		System.out.println("This is FB Test");
		driver.get("http://www.facebook.com");
		
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("anshu.shrivastava");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("Dec231280@fb");
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		
		
		
		driver.findElement(By.xpath(".//*[@id='userNavigationLabel']")).click();
		driver.findElement(By.xpath(".//*[@id='BLUE_BAR_ID_DO_NOT_USE']//*[contains(text(),'Log Out')]")).click();
		
		
		driver.close();
	}
}
