package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Task3 {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		WebElement a = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		a.click();
		
		WebElement b = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-square-aspect'])[10]"));
		b.click();
		
		Actions act=new Actions(driver);
		Thread.sleep(3000);
		WebElement c = driver.findElement(By.xpath("//span[text()='Add to Cart']"));
		act.click(c).build().perform();
		
	}

}
