package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mouse_hover {
	WebDriver driver;

	@BeforeTest
	public void bt() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();

	}
	
@Test
public void hover() throws InterruptedException {
	WebElement tohover =driver.findElement(By.linkText("Electronics"));
	Actions actions = new Actions(driver);
	actions.moveToElement(tohover).perform();
	Thread.sleep(3000);
	
	WebElement tohover2 =driver.findElement(By.linkText("Fashion"));
	Actions actions2 = new Actions(driver);
	actions2.moveToElement(tohover2).perform();
	Thread.sleep(3000);
	
	WebElement tohover3 =driver.findElement(By.linkText("Electronics"));
	Actions actions3 = new Actions(driver);
	actions3.moveToElement(tohover3).perform();
	Thread.sleep(3000);
	
	WebElement tohover4 =driver.findElement(By.linkText("Refurbished"));
	Actions actions4 = new Actions(driver);
	actions4.moveToElement(tohover4).perform();
	Thread.sleep(3000);
	
	
	
	
	
	
	
	
}


}
