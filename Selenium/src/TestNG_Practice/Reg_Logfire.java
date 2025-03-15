package TestNG_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Reg_Logfire {
	
	
	
	@Test
	public void Register2() {
		
		WebDriver driver= new ChromeDriver();
		

		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Gowtham");
		driver.findElement(By.id("LastName")).sendKeys("G");
		driver.findElement(By.id("Email")).sendKeys("goqwwutmanajih7@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Gowtham&9842");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Gowtham&9842");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		

	}
	
	@Test
	public void actions2(WebDriver driver) throws InterruptedException {
		//WebDriver driver= new ChromeDriver();

		Actions a = new Actions(driver);
		Thread.sleep(2000);
		WebElement b = driver.findElement(By.xpath("(//ul/li/a[@href='/electronics'])[1]"));
		WebElement c = driver.findElement(By.xpath("(//a[@class='hover'])[2]"));
		a.moveToElement(b).moveToElement(c).click().perform();
		
	}
	
}

