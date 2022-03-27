package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		
		WebElement a = driver.findElement(By.id("doubleClickBtn"));
		
		Actions db=new Actions(driver);
		
		db.doubleClick(a).build().perform();
		
		WebElement b = driver.findElement(By.id("rightClickBtn"));
		Actions rc=new Actions(driver);
		rc.contextClick(b).build().perform();
		
		WebElement c = driver.findElement(By.xpath("//button[text()='Click Me']"));
		Actions cl=new Actions(driver);
		cl.click(c).build().perform();
		
	}

}
