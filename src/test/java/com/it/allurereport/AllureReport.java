package com.it.allurereport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class AllureReport {

	WebDriver driver;
	
	
	@Test( )
	public void pageLogin() {
	
		System.setProperty("WebDriver.Chrome.driver", "D:\\Drivers\\chromedriver_win3/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		
		   driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		//driver.findElement(By.xpath("//a[@class='i']")).click();
           driver.findElement(By.xpath("//input[@class='email']")).sendKeys("techmangeshpatil31@gmail.com");
           driver.findElement(By.xpath("//input[@class='password']")).sendKeys("8888459441");
           driver.findElement(By.xpath("//button[@class='button-1 login-button']")).click();      
 
		
	}	
	
	@Test
	public void closeapp() {
		
		driver.close();
	}
}
