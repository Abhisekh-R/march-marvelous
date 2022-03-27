package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hdfc_Bank_Alerttask {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();		
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.176378149.1819882415.1533883212-608727520.1532670997");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		
		Thread.sleep(3000);
		WebElement cnbtn = driver.findElement(By.xpath("//a[text()='CONTINUE']"));
		act.contextClick(cnbtn).build().perform();
		//cnbtn.click();    //couldnot press continue button
		
		
		
		
	}

}
