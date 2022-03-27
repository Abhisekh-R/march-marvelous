package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhisekh R\\Selenium\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://practice.automationtesting.in/");
		driver.manage().window().maximize();
		
		WebElement demobtn = driver.findElement(By.xpath("//a[text()='Demo Site']"));
		demobtn.click();
		
		WebElement fn = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fn.sendKeys("Abhisekh");
		
		WebElement ln = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		ln.sendKeys("R");
		
		WebElement ad = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		ad.sendKeys("48A DABC Layout 1st street Menambedu Ambattur Chennai-600053");
		
		WebElement mailid = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		mailid.sendKeys("abhisekhmech@gmail.com");
		
		WebElement mob = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		mob.sendKeys("9551623705");
		
		WebElement male = driver.findElement(By.xpath("//input[@value='Male']"));
		male.click();
		
		WebElement cb = driver.findElement(By.id("checkbox2"));
		cb.click();
		
		
		WebElement skill = driver.findElement(By.id("Skills"));
		
		Select s=new Select(skill);
		s.selectByValue("Java");
		
		WebElement nation = driver.findElement(By.id("country"));
		Select s1=new Select(nation);
		s1.selectByValue("India");
		
		WebElement year = driver.findElement(By.id("yearbox"));
		Select s2=new Select (year);
		s2.selectByValue("2000");
		
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select s3=new Select (month);
		s3.selectByValue("September");
		
		WebElement day = driver.findElement(By.id("daybox"));
		Select s4=new Select (day);
		s4.selectByValue("22");
		
		WebElement pw1 = driver.findElement(By.id("firstpassword"));
		pw1.sendKeys("1234@");
		
		WebElement pw2 = driver.findElement(By.id("secondpassword"));
		pw2.sendKeys("12345");
		
		WebElement lang = driver.findElement(By.xpath("(//div[@class='col-md-4 col-xs-4 col-sm-4'])[7]"));
		lang.click();
		//Select s5=new Select (lang);
		//boolean multiple = s5.isMultiple();
		//System.out.println(multiple);
		//s5.selectByValue("English");
		
		WebElement sub = driver.findElement(By.id("submitbtn"));
		sub.click();
		
		//(//a[@style='text-decoration:none'])[8]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
