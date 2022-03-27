package Alert_Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Canarabank_Alert {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://candi.canarabank.in/omnichannel/");
		driver.manage().window().maximize();
		
		
	Thread.sleep(3000);
		WebElement a = driver.findElement(By.id("login__Login__password"));
		a.sendKeys("Abhi");
		
		WebElement b = driver.findElement(By.id("login__Login__el_btn_1"));
		b.click();
		driver.switchTo().alert().accept();
	}

}
