package JS_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Login_JS {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement a = driver.findElement(By.xpath("//a[text()='Login']"));
		js.executeScript("arguments[0].click();", a);	
		
	   // WebElement b = driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
	  //  b.sendKeys("123");
		
		Thread.sleep(3000);
		//js.executeScript("document.getElementById('(//input[@autocomplete='off'])[2]').value='1234';");
		
		js.executeScript("document.getElementById('text').value='Abhi';");
	
	}

}
