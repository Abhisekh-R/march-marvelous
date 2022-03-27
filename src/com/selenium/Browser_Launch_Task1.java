package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch_Task1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.navigate().to("https://www.myntra.com/");
		String c = driver.getCurrentUrl();
		System.out.println(c);
		driver.navigate().back();
		String d = driver.getCurrentUrl();
		System.out.println(d);
		driver.navigate().forward();
		String e = driver.getTitle();
		System.out.println(e);
		driver.close();
	}

}
