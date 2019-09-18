package com.test.FillForm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FillForm {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp(){
		System.setProperty("webdriver.chrome.driver", "E:\\Softwares\\Reetu\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
	}
	
	@Test
	public void test(){
		driver.findElement(By.name("username")).sendKeys("Test");
		driver.findElement(By.name("password")).sendKeys("test");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
	}
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
