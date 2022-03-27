package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Task4 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		WebElement a = driver.findElement(By.xpath("//a[@aria-label='Google apps']"));
		a.click();
		
		Actions act=new Actions(driver);
		
		WebElement b = driver.findElement(By.xpath("(//a[@jslog='46976; 1:23; track:click; index:6']"));
		act.moveToElement(b).build().perform();
		act.click();
		
		
				
	}

}
