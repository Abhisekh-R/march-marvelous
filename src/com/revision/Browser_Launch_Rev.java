package com.revision;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser_Launch_Rev {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/i/flow/login?input_flow_data=%7B%22requested_variant%22%3A%22eyJsYW5nIjoiZW4ifQ%3D%3D%22%7D");
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.navigate().back();
		String title2 = driver.getTitle();
		System.out.println(title2);
		String url1 = driver.getCurrentUrl();
		System.out.println(url1);
	}

}
