package com.revision;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Rev {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		//WebElement alert1 = driver.findElement(By.id("alertButton"));
		//alert1.click();
		//driver.switchTo().alert().accept();
		
		//WebElement alert2 = driver.findElement(By.id("confirmButton"));
		//alert2.click();
		//driver.switchTo().alert().dismiss();
		
		//Thread.sleep(3000);
		
		WebElement alert3 = driver.findElement(By.id("promtButton"));
		alert3.click();
		Alert a1 = driver.switchTo().alert();
		a1.sendKeys("Hi");
		a1.accept();
		
		
	}
	

}
