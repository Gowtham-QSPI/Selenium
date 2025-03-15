package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register_css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
//		driver.findElement(By.linkText("Register")).click();
//		driver.findElement(By.cssSelector("input#gender-male")).click();
//		driver.findElement(By.cssSelector("input[id='FirstName']")).sendKeys("Gowtham");
//		driver.findElement(By.cssSelector("input[name='LastName']")).sendKeys("Ganesan");
//		driver.findElement(By.cssSelector("input[data-val-required='Email is required.']")).sendKeys("QSPIPRACTISE@gmail.com");
//		driver.findElement(By.id("Password")).sendKeys("Gowtham");
//		driver.findElement(By.xpath("//input[@name='ConfirmPassword']")).sendKeys("Gowtham");
//		driver.findElement(By.id("register-button")).click();

		//driver.findElement(By.className("ico-logout")).click();

		driver.findElement(By.className("ico-login")).click();
		
	driver.findElement(By.cssSelector("input[class='email']")).sendKeys("QSPIPRACTISE@gmail.com");
	driver.findElement(By.cssSelector("input[class='password']")).sendKeys("Gowtham");
	driver.findElement(By.cssSelector("input[value='Log in']")).submit();
	String a= driver.findElement(By.linkText("QSPIPRACTISE@gmail.com")).getText();
	System.out.print(a);

		
				

	}

}
