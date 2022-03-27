package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Task2 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement a = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
		a.click();
		
		//Actions act=new Actions(driver);
		
		//WebElement b = driver.findElement(By.xpath("(//div[@class='_1mkliO'])[6]"));
	//	act.moveToElement(b).build().perform();
		
		WebElement c = driver.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		c.sendKeys("chair");
		
		WebElement d = driver.findElement(By.xpath("//button[@type='submit']"));
		d.click();
		
		Actions act1=new Actions(driver);
		
		Thread.sleep(3000);
		
		WebElement e = driver.findElement(By.xpath("//div[text()='Popularity']"));
		act1.moveToElement(e).build().perform();
		e.click();
		
		WebElement f = driver.findElement(By.xpath("//a[text()='Nilkamal Mystique Plastic Outdoor Chair']"));
		f.click();
		
		
		
		WebElement h = driver.findElement(By.xpath("//button[@type='button']"));
		h.click();
	
		
		
		
		
		
	
	
		
	
		
		
		
	}
}
