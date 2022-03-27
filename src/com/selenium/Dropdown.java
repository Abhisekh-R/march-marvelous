package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ironspider.ca/forms/dropdowns.htm");
		driver.manage().window().maximize();
		
		WebElement cafe = driver.findElement(By.name("coffee2"));
		Select s=new Select(cafe);
		boolean a = s.isMultiple();
		System.out.println(a);
		
		List<WebElement> options = s.getOptions();
		for (WebElement opt : options) {
			String text = opt.getText();
			System.out.println(text);
			
		}
	}

}
