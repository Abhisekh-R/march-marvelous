package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		
		List<WebElement> th1 = driver.findElements(By.tagName("th"));
		for (WebElement webElement : th1) {
			System.out.println(webElement.getText());
		}
			System.out.println();
			System.out.println();
			
			List<WebElement> contents = driver.findElements(By.xpath("//table/tbody/tr/td"));
			for (WebElement webElement2 : contents) {
				System.out.println(webElement2.getText());
				
			}
			
		}
	}


