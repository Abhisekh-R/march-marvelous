package Alert_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icicibanl_Alert {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
		driver.manage().window().maximize();
		
		WebElement a1 = driver.findElement(By.xpath("//input[@title='Login using User ID and password']"));
		a1.sendKeys("Abhi123");
		
		WebElement b = driver.findElement(By.xpath("(//span[@class='input-arrow'])[1]"));
		b.click();
		
		Thread.sleep(3000);
		
		WebElement c = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
		c.sendKeys("Abhi123");
		
		WebElement d = driver.findElement(By.xpath("(//input[@type='password'])[4]"));
		d.sendKeys("1234");
		
		WebElement e = driver.findElement(By.xpath("(//input[@type='Submit'])[1]"));
		e.click();
	}

}
