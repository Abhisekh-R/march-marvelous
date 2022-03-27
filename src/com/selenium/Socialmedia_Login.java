package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Socialmedia_Login {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		
// parent (interface)         //child (class)
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/"); //social media login
		driver.manage().window().maximize();
		
		WebElement id = driver.findElement(By.id("email")); //user input entry
		id.sendKeys("abhi@gmail.com");
		
		WebElement password = driver.findElement(By.name("pass")); //to enter password
		password.sendKeys("1234");
		
		//WebElement login = driver.findElement(By.name("login"));
		//login.click();    //just to click login button
		
		WebElement create = driver.findElement(By.xpath("//a[text()='Create a Page']"));
		String ac = create.getText();
		System.out.println(ac);
		
		WebElement ab = driver.findElement(By.xpath("//h2[contains(text(),'your')]"));
		String ur = ab.getText();
		System.out.println(ur);
		
		
				
	}

}
