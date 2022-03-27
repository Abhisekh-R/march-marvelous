package com.revision;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handling_Rev {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		
		WebElement a1 = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		Actions act=new Actions(driver);
			act.contextClick(a1).build().perform();
			
			Robot r=new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			WebElement a2 = driver.findElement(By.xpath("(//a[text()='Women'])[1]"));
			act.contextClick(a2).build().perform();
			
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
			String wh1 = driver.getWindowHandle();
			System.out.println(wh1);
			String t1 = driver.getTitle();
			System.out.println(t1);
			System.out.println();
			System.out.println();
			
			Set<String> whs1 = driver.getWindowHandles();
			for (String str : whs1) {
				System.out.println(str);
				String titles = driver.getTitle();
				System.out.println(titles);
				}
			
			Thread.sleep(3000);
			
		String	s="Online Shopping for Women, Men, Kids Fashion & Lifestyle - Myntra";
		for (String str2 : whs1) {
			if (driver.switchTo().window(str2).getTitle().equals(s)){
				System.out.println("Done");
				break;
			}
			
		}
		
			
			
	}
	

}
