package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Frame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Frames.html");
		driver.manage().window().maximize();
		
		WebElement fr1 = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		fr1.click();
		
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		WebDriver fr2 = driver.switchTo().frame(1);
		WebDriver fr3 = driver.switchTo().frame(0);
		
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Surprise");
	}
}
