package TestNG_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Reg_Login {
	
	

	
	@Test
	public void Register() {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Gowtham");
		driver.findElement(By.id("LastName")).sendKeys("G");
		driver.findElement(By.id("Email")).sendKeys("gowthamnajith7@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Gowtham&9842");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Gowtham&9842");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		

	}
	
	@Test
	public void actions() {
		WebDriver driver= new ChromeDriver();
		
		Actions a = new Actions(driver);
		WebElement b = driver.findElement(By.xpath("(//li/a[contains(text(),'Electronics')])[1]"));
		WebElement c = driver.findElement(By.xpath("(//a[@class='hover'])[2]"));
		a.moveToElement(b).moveToElement(c).click().perform();
		
	}

}
