package com.selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Xpath {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/men-casual-shirts");
		driver.manage().window().maximize();
		
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='product-strike']//preceding-sibling :: span[@class='product-discountedPrice']"));
		
		List<Integer> product=new ArrayList <Integer>();
		
		for (WebElement rupee : price) {
			String replace = rupee.getText().replace("Rs. ", "");
			int prices = Integer.parseInt(replace);
			product.add(prices);
			
		}
		System.out.println(product);
		System.out.println("Total count=  "+product.size());
		System.out.println("Maximum price=  "+Collections.max(product));
		System.out.println("Minimum price=  "+Collections.min(product));
		Collections.sort(product);
		System.out.println(product);
		Collections.sort(product,Collections.reverseOrder());
		System.out.println(product);
			
		}

}
