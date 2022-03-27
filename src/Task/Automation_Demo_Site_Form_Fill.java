package Task;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Demo_Site_Form_Fill {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		
		WebElement fn = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fn.sendKeys("Abhisekh");
		
		WebElement ln = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		ln.sendKeys("R");
		
		WebElement ad = driver.findElement(By.xpath("//textarea[@rows='3']"));
		ad.sendKeys("Chennai");
		
		WebElement mail = driver.findElement(By.xpath("//input[@type='email']"));
		mail.sendKeys("abhi@gmail.com");
		
		WebElement mob = driver.findElement(By.xpath("//input[@type='tel']"));
		mob.sendKeys("1234567892");
		
		WebElement male = driver.findElement(By.xpath("//input[@value='Male']"));
		male.click();
		
		WebElement cric = driver.findElement(By.xpath("//input[@value='Cricket']"));
		cric.click();
		
		WebElement mov = driver.findElement(By.xpath("//input[@value='Movies']"));
		mov.click();
		
        //Thread.sleep(3000);
        TakesScreenshot s=(TakesScreenshot) driver;
		File src = s.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Picture\\snap1.png");
		FileUtils.copyFile(src,dest);
				
		
	}

}
