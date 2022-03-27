package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Newaccount {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement signup = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		signup.click();
		
		
		Thread.sleep(3000);
		WebElement name = driver.findElement(By.name("firstname"));
		name.sendKeys("Abhisekh");
		
		WebElement lastname = driver.findElement(By.name("lastname"));
		lastname.sendKeys("R");
		
		WebElement mob = driver.findElement(By.name("reg_email__"));
		mob.sendKeys("9551623705");
		
		WebElement pw = driver.findElement(By.name("reg_passwd__"));
		pw.sendKeys("123456789");
		
		WebElement day = driver.findElement(By.name("birthday_day"));
		day.sendKeys("22");
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		month.sendKeys("Sep");
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		year.sendKeys("2000");
		
	
		WebElement male = driver.findElement(By.xpath("//input[@value='2']"));
		male.click();
		
		
	}

}
