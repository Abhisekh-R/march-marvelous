package Task;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Greenstechnology_Selenium {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.greenstechnologys.com/courses.html");
		driver.manage().window().maximize();
		
		WebElement sele = driver.findElement(By.xpath("//img[@alt='Selenium Training in Chennai']"));
		sele.click();
		
		WebElement cts = driver.findElement(By.xpath("//a[text()=' CTS 1st Round Interview Question ']"));
		cts.click();
		
		Thread.sleep(3000);
		TakesScreenshot s=(TakesScreenshot) driver;
		File src = s.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Picture\\snap.png");
		FileUtils.copyFile(src,dest);
		
		
		
	}

}
