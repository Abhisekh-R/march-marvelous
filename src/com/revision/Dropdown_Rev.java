package com.revision;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Rev {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement a = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		a.click();
		Thread.sleep(3000);
		WebElement b = driver.findElement(By.xpath("//select[@title='Day']"));
		Select s=new Select (b);
		boolean multiple = s.isMultiple();
		
		System.out.println(multiple);
		s.selectByVisibleText("22");
		List<WebElement> list = s.getOptions();
		for (WebElement opts : list) {
			String text = opts.getText();
			System.out.println(text);
			
		}
		//System.out.println(list);
	}

}
