package Task;

import java.io.File;
import java.io.IOException;

import javax.rmi.CORBA.Util;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class Miniproject_Adactin {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("abhisekhmech");
		WebElement pw = driver.findElement(By.id("password"));
		pw.sendKeys("Abhi@123");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Picture\\snap1.png");
		FileUtils.copyFile(src, dest);
		
		WebElement loginbtn = driver.findElement(By.id("login"));
		loginbtn.click();
		
		WebElement loc = driver.findElement(By.id("location"));
		Select s=new Select(loc);
		s.selectByValue("New York");
		
		WebElement hotel = driver.findElement(By.id("hotels"));
		Select s1=new Select(hotel);
		s1.selectByValue("Hotel Sunshine");
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select s2=new Select(roomtype);
		s2.selectByValue("Deluxe");
		
		WebElement roomno = driver.findElement(By.id("room_nos"));
		Select s3=new Select(roomno);
		s3.selectByValue("1");
		
		WebElement datein = driver.findElement(By.id("datepick_in"));
		datein.sendKeys("21/02/2022");
		
		WebElement dateout = driver.findElement(By.id("datepick_out"));
		dateout.sendKeys("22/02/2022");
		
		WebElement adroom = driver.findElement(By.id("adult_room"));
		Select s4=new Select (adroom);
		s4.selectByValue("1");
		
		WebElement childroom = driver.findElement(By.id("child_room"));
		Select s5=new Select(childroom);
		s5.selectByValue("0");
		TakesScreenshot ts1=(TakesScreenshot)driver;
		File src1=ts1.getScreenshotAs(OutputType.FILE);
		File dest1=new File("C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Picture\\snap2.png");
		FileUtils.copyFile(src1, dest1);
		
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.id("radiobutton_0")).click();
		TakesScreenshot ts2=(TakesScreenshot)driver;
		File src2=ts2.getScreenshotAs(OutputType.FILE);
		File dest2=new File("C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Picture\\snap3.png");
		FileUtils.copyFile(src2, dest2);
		driver.findElement(By.id("continue")).click();
		
		driver.findElement(By.id("first_name")).sendKeys("Abhisekh");
		driver.findElement(By.id("last_name")).sendKeys("R");
		driver.findElement(By.id("address")).sendKeys("New York 10003");
		driver.findElement(By.id("cc_num")).sendKeys("1234123456785678");
		WebElement cctype = driver.findElement(By.id("cc_type"));
		Select s6=new Select(cctype);
		s6.selectByValue("VISA");
		WebElement expmon = driver.findElement(By.id("cc_exp_month"));
		Select s7=new Select(expmon);
		s7.selectByValue("12");
		WebElement expyear = driver.findElement(By.id("cc_exp_year"));
		Select s8=new Select(expyear);
		s8.selectByValue("2022");
		
		driver.findElement(By.id("cc_cvv")).sendKeys("123");
		TakesScreenshot ts3=(TakesScreenshot)driver;
		File src3=ts3.getScreenshotAs(OutputType.FILE);
		File dest3=new File("C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Picture\\snap4.png");
		FileUtils.copyFile(src3, dest3);
		driver.findElement(By.id("book_now")).click();
		Thread.sleep(9000);
		TakesScreenshot ts4=(TakesScreenshot)driver;
		File src4=ts4.getScreenshotAs(OutputType.FILE);
		File dest4=new File("C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Picture\\snap5.png");
		FileUtils.copyFile(src4, dest4);
		
		
		
		
		
	}

}
