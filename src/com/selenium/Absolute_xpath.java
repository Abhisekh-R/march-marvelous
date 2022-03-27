package com.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.javatpoint.com/java-tutorial");
		driver.manage().window().maximize();
		
		//WebElement abs = driver.findElement(By.xpath("/html/body/div/div/div[6]/div[2]/div/table/tbody/tr/td/h1"));
		//String text = abs.getText();
		//System.out.println(text);
		
		List<WebElement> head = driver.findElements(By.xpath("/html/body/div/div/div[6]/div[2]/div/table/tbody/tr/td/h2"));
		for (WebElement heads : head) {
			String t1 = heads.getText();
			System.out.println(t1);
			
		}
		
		
		
	}

}
