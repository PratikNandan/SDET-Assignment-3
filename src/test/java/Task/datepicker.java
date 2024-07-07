package Task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class datepicker {
	WebDriver driver;
	
@BeforeTest

public void bt() throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Datepicker.html");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	
}

@Test()
public void test() {
	driver.findElement(By.id("datepicker2")).click();
	WebDriverWait wait = new WebDriverWait(driver,30);
	//this i sfor inspecting the full calender
	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("datepick-ctrl"))));
	WebElement drpdwn =driver.findElement(By.xpath("(//select[@class=\'datepick-month-year\'])[1]"));
	drpdwn.click();
	
	Select select = new  Select(drpdwn);
	
	select.selectByVisibleText("March");
	
	WebElement drpdwn1 =driver.findElement(By.xpath("(//select[@class=\'datepick-month-year\'])[2]"));
	drpdwn1.click();
	
	Select select1 = new  Select(drpdwn1);
	
	select1.selectByVisibleText("2027");
	
	
	
	
	
	
	
	//driver.findElement(By.xpath("(//select[@class='datepick-month-year'])[2]")).getText();
	
	
//	while(!(actualmonth.equals("September")&&actualyear.equals("2024"))) {
//		
//		driver.findElement(By.xpath("//a[@class='datepick-cmd datepick-cmd-next ']")).click();
//		
//		actualmonth = driver.findElement(By.xpath("(//select[@class=\'datepick-month-year\'])[1]")).getText();
//		actualyear = driver.findElement(By.xpath("(//select[@class='datepick-month-year'])[2]")).getText();
//		

		
	}


}








