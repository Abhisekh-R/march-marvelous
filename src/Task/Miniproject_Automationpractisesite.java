package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Miniproject_Automationpractisesite {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
		login.click();
		
		WebElement create = driver.findElement(By.xpath("//input[@id='email_create']"));
		create.sendKeys("abhisekhmech@gmail.com");
		
		WebElement submit = driver.findElement(By.id("SubmitCreate"));
		submit.click();
		
		Thread.sleep(3000);
		
		WebElement mr = driver.findElement(By.xpath("//input[@id='id_gender1']"));
		mr.click();
		
		WebElement fn = driver.findElement(By.id("customer_firstname"));
		fn.sendKeys("Abhisekh");
		
		WebElement ln = driver.findElement(By.id("customer_lastname"));
		ln.sendKeys("R");
		
		WebElement pw = driver.findElement(By.id("passwd"));
		
		pw.sendKeys("1234@");
		
		Thread.sleep(3000);
		
		WebElement day = driver.findElement(By.xpath("//select[@id='days']"));
		Select s=new Select (day);
		s.selectByValue("22");
		
		WebElement mn = driver.findElement(By.id("months"));
		Select s2=new Select(mn);
		s2.selectByVisibleText("September ");
		
		WebElement yr = driver.findElement(By.id("years"));
		Select s3=new Select (yr);
		s3.selectByVisibleText("2000  ");
		
		WebElement cm = driver.findElement(By.id("company"));
		cm.sendKeys("IT");
		
		WebElement ad1 = driver.findElement(By.id("address1"));
		ad1.sendKeys("Wall street 100054");
		
		WebElement ad2 = driver.findElement(By.id("address2"));
		ad2.sendKeys("Green Technologies");
		
		WebElement city = driver.findElement(By.id("city"));
		city.sendKeys("NY");
		
		Thread.sleep(3000);
		
		WebElement state = driver.findElement(By.id("id_state"));
		Select s4=new Select(state);
		s4.selectByValue("47");
		
		WebElement code = driver.findElement(By.id("postcode"));
		code.sendKeys("00001");
		
		WebElement country = driver.findElement(By.id("id_country"));
		Select s5 =new Select (country);
		s5.selectByValue("21");
		
		WebElement mob = driver.findElement(By.id("phone_mobile"));
		mob.sendKeys("9551623705");
		
		WebElement alt = driver.findElement(By.id("alias"));
		alt.clear();
		alt.sendKeys("abhisekh@gmail.com");
		
		WebElement sub = driver.findElement(By.id("submitAccount"));
		sub.click();
		
		
		
		
		
		
		
	}

}
