package Task;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Task1 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
			
	     Actions act=new Actions (driver);
		//driver.switchTo().frame(3);
		
		Thread.sleep(3000);
	     

		WebElement src = driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement dest = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		act.dragAndDrop(src, dest).build().perform();
		
		
		//Actions act1=new Actions(driver);
		//WebElement a = driver.findElement(By.xpath("(//a[text()=' 5000 '])[1]"));
		//WebElement b = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		//act1.dragAndDrop(a, b).build().perform();
		
		WebElement src2 = driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement dest2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		act.dragAndDrop(src2, dest2).build().perform();
		
	
		
	}

}
