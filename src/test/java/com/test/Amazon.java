package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class Amazon {
WebDriver driver;

@BeforeSuite
	public void browserstart() 
	  {
		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJARS\\geckodriver-v0.18.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		
	  }
	  
	@Test(priority=1)
	public void startappliction() throws InterruptedException
	{
		System.out.println("This is Gmail Test");
		driver.get("https://www.gmail.com");
		
		driver.findElement(By.xpath(".//*[@id='identifierId']")).sendKeys("tonyli7684");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/div[2]")).click();
		
		Thread.sleep(5000);
		if(driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).isDisplayed())
			{
			System.out.println("password field displayed");	
			driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("welcome2gm");
		
				driver.findElement(By.xpath(".//*[@id='passwordNext']/div[2]")).click();
			}
		
		driver.findElement(By.xpath(".//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click();
		
		
		driver.findElement(By.xpath(".//*[@id='gb_71']")).click();
		
		
		driver.close();
	}
}
