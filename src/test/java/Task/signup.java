package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class signup {
	WebDriver driver;
	
@BeforeTest
public void bt() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://www.facebook.com/signup");
	Thread.sleep(3000);
	driver.manage().window().maximize();

}

@Test
public void register() throws InterruptedException {
	driver.findElement(By.name("firstname")).sendKeys("Muzan");
	driver.findElement(By.name("lastname")).sendKeys("Kibutsuji");
	driver.findElement(By.name("reg_email__")).sendKeys("MuzanKibutsuji@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.name("reg_email_confirmation__")).sendKeys("MuzanKibutsuji@gmail.com");

	
	driver.findElement(By.name("reg_passwd__")).sendKeys("SetYourH34rt_48laze");
	driver.findElement(By.name("birthday_day")).sendKeys("15");
	driver.findElement(By.name("birthday_month")).sendKeys("Dec");
	driver.findElement(By.name("birthday_year")).sendKeys("1999");

	driver.findElement(By.xpath("//input[@value='2']")).click(); //for male
	
	//button[@name='websubmit']
	driver.findElement(By.xpath("//button[@name='websubmit']")).click(); //submit

	

	
	
}

}
