package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		WebElement alert1 = driver.findElement(By.id("alertButton"));
		alert1.click();
		
		//Thread.sleep(3000);
		
		driver.switchTo().alert().accept();   //ok (simple alert)
		
		WebElement alert2 = driver.findElement(By.id("confirmButton"));
		alert2.click();
		
		//Thread.sleep(3000);
		
		driver.switchTo().alert().dismiss();     //cancel (confirm alert)
	}

}
