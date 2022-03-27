package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe" );
		//object creation
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//navigation
		driver.navigate().to("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		String c = driver.getCurrentUrl();
		System.out.println(c);
		//driver.close();
	}
 
}
