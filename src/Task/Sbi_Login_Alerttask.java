package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sbi_Login_Alerttask {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().window().maximize();
		
		WebElement a = driver.findElement(By.xpath("(//a[text()='CONTINUE TO LOGIN'])[1]"));
		a.click();
		
		WebElement b = driver.findElement(By.xpath("//input[@name='userName']"));
		b.sendKeys("Abhi");
		
		WebElement c = driver.findElement(By.id("Button2"));
		c.click();
		
		driver.switchTo().alert().accept();
	}
	
	

}
