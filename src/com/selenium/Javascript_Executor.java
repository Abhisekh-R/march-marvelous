package com.selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Javascript_Executor {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//TakesScreenshot ts1=(TakesScreenshot) driver;
		//File s1 = ts1.getScreenshotAs(OutputType.FILE);
		//File d1 = new File("C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Picture\\snap1.png");
		//FileUtils.copyFile(s1, d1);
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,10000);");
		
		//TakesScreenshot ts2=(TakesScreenshot) driver;
		//File s2 = ts2.getScreenshotAs(OutputType.FILE);
		//File d2 = new File("C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Picture\\snap2.png");
		//FileUtils.copyFile(s2, d2);
		
	
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-5000);");
		
		//TakesScreenshot ts3=(TakesScreenshot) driver;
		//File s3 = ts3.getScreenshotAs(OutputType.FILE);
		//File d3 = new File("C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Picture\\snap3.png");
		//FileUtils.copyFile(s3, d3);
	
		WebElement a = driver.findElement(By.xpath("//h2[text()='Today’s Deals']"));
		//Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView();",a);		
	
	}

}
