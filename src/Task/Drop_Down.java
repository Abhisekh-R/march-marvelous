package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.seleniumhq.jetty9.server.Response.OutputType;

public class Drop_Down {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		WebElement dd2 = driver.findElement(By.name("dropdown2"));
		Select b=new Select(dd2);
		b.selectByVisibleText("Selenium");
		
		WebElement dd3 = driver.findElement(By.id("dropdown3"));
		Select a=new Select(dd3);
		a.selectByValue("1");
		
		WebElement dd4 = driver.findElement(By.xpath("//select[@class='dropdown']"));
		Select c=new Select(dd4);
		List<WebElement> list = c.getOptions();
		int d = list.size();
		System.out.println(d);
		
		WebElement dd5 = driver.findElement(By.xpath("(//select)[5]"));
		Select e=new Select(dd5);
		dd5.sendKeys("Selenium");
		dd5.click();
		
		driver.findElement(By.xpath("(//option[@value='1'])[6]")).click();
		
		WebElement dd1 = driver.findElement(By.id("dropdown1"));
		Select f=new Select(dd1);
		f.selectByIndex(1);
		
			
	}

}
