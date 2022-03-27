package Task;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		driver.manage().window().maximize();
		
		WebElement dd2 = driver.findElement(By.name("dropdown2"));
		
		Select s =new Select(dd2);
		boolean multiple = s.isMultiple(); //checking
		System.out.println(multiple);
		
		// List<WebElement> options = s.getOptions();
		// for (WebElement opt : options) {               // elements listing in dropdown
			// String text = opt.getText();
			// System.out.println(text);
			
		s.selectByValue("1");
		
		
		
		WebElement dd3 = driver.findElement(By.name("dropdown3"));
		Select a=new Select(dd3);
		a.selectByVisibleText("Selenium");
		
		
	   WebElement dd4 = driver.findElement(By.xpath("(//option[@value=\"1\"])[5]"));
	   dd4.sendKeys("Selenium");
	   //dd4.click();
	 
		
		
		
		
		
		
	}

}
