package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spring_Login_Actiontask {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sprint.com/en/login.html");
		driver.manage().window().maximize();
		
		WebElement subbtn = driver.findElement(By.xpath("//button[text()='Submit']"));
		subbtn.click();
		
	}

}
