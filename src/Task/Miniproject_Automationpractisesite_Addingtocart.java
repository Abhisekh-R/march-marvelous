package Task;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Miniproject_Automationpractisesite_Addingtocart {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement log = driver.findElement(By.xpath("//a[@title='Log in to your customer account']"));
		log.click();
		
		WebElement login = driver.findElement(By.id("email"));
		login.sendKeys("abhisekhmech@gmail.com");
		
		WebElement pw = driver.findElement(By.id("passwd"));
		pw.sendKeys("1234@");
		
		WebElement sub = driver.findElement(By.id("SubmitLogin"));
		sub.click();
		
		WebElement dress = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		dress.click();
		
		
		
		WebElement qv = driver.findElement(By.xpath("(//a[text()='Casual Dresses'])[3]"));
		qv.click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,750);");
		
		
		WebElement eye = driver.findElement(By.xpath("(//a[@title='Printed Dress'])[2]"));		
		Actions move=new Actions(driver);
		move.moveToElement(eye).click().build().perform();
		
		WebElement plus = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		plus.click();
		
		WebElement cart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		cart.click();
		
		Thread.sleep(3000);
		
		WebElement ptc = driver.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']"));
		ptc.click();
		
		WebElement ptc1 = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		ptc1.click();
		
		WebElement ptc2 = driver.findElement(By.xpath("//span[text()='Proceed to checkout']"));
		ptc2.click();
		
		WebElement checkbox = driver.findElement(By.id("cgv"));
		checkbox.click();
		
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		js1.executeScript("window.scrollBy(0,500);");
		
		
		
		WebElement ptc3 = driver.findElement(By.xpath("(//span[normalize-space()='Proceed to checkout'])[2]"));
		ptc3.click();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Picture\\snap1.png");
		FileUtils.copyFile(src, dest);
		
		
		
	}
}
