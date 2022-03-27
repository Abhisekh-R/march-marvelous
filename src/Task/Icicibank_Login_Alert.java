package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Icicibank_Login_Alert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&ACCESS_DEV=WAP&ITM=nli_primer_login_btn_mob");
		driver.manage().window().maximize();
		
		WebElement id = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		id.sendKeys("abhi");
		
		WebElement pw = driver.findElement(By.xpath("//input[@type='password']"));
		pw.sendKeys("1234@ab");
		
		WebElement login = driver.findElement(By.xpath("//input[@value='Login']"));
		login.click();
		
		
		WebElement al = driver.findElement(By.xpath("(//input[@type='Submit'])[3]"));
		driver.switchTo().alert().accept();
		
		
		
	}

}
