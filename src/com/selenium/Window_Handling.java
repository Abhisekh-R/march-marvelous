package com.selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement a1 = driver.findElement(By.xpath("(//a[text()='Best Sellers'])[1]"));
		Actions act=new Actions(driver);
		
		act.contextClick(a1).build().perform();
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement a2 = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		//Actions act2=new Actions(driver);
		
		act.contextClick(a2).build().perform();
		
		//Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		String wh = driver.getWindowHandle();
		System.out.println(wh);
		System.out.println();
		System.out.println();
		
		Set<String> whs = driver.getWindowHandles();
		for (String str : whs) {
			String str1 = driver.switchTo().window(str).getTitle();
			System.out.println(str1);
			System.out.println();
			
		}
		
		String s= "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		 for (String str2 : whs) {
			 if (driver.switchTo().window(str2).getTitle().equals(s)) {
				 System.out.println("Done...");
				 break;
				
			}
			
		}
		
		
		
		
		
		
	}

}
