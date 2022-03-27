package com.selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);		
		WebElement id = driver.findElement(By.name("username"));
		id.sendKeys("abhi@gmail.com");
		
		WebElement pw = driver.findElement(By.name("password"));
		pw.sendKeys("password");
		
		WebElement button = driver.findElement(By.xpath("//button[@ type='submit']"));
		button.click();
		
		
		Thread.sleep(3000);	
		TakesScreenshot s=(TakesScreenshot) driver;  //typecasting
		File src = s.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Picture\\snap.png");
		FileUtils.copyFile(src, dest);

}
}
