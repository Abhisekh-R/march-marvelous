package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Dragndrop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe" );
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		Actions act=new Actions (driver);
		
		driver.switchTo().frame(0);
		
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement tgt = driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(src, tgt).build().perform();
		
	}

}
